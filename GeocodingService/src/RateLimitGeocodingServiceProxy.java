import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RateLimitGeocodingServiceProxy implements GeocodingServiceInterface{
    private final GeocodingServiceInterface geocodingService;
    private final Map<String, List<Instant>> apiKeyRequestsTimeStamp = new ConcurrentHashMap<>();

    public RateLimitGeocodingServiceProxy(GeocodingServiceInterface geocodingService){
        this.geocodingService = geocodingService;
    }

    @Override
    public String getAddress(double longitude, double latitude, String apiKey) throws Exception {
        Instant now = Instant.now();
        if(this.apiKeyRequestsTimeStamp.containsKey(apiKey)){
            while(apiKeyRequestsTimeStamp.get(apiKey).size() > 5){
                apiKeyRequestsTimeStamp.get(apiKey).remove(apiKeyRequestsTimeStamp.get(apiKey).getFirst());
            }

            if(Duration.between(apiKeyRequestsTimeStamp.get(apiKey).getFirst(), now).toMinutes() <= 1 && apiKeyRequestsTimeStamp.get(apiKey).size() == 5){
                // we can't make request
                throw new Exception("Rate limited to 5 request per minute");
            }
        }else{
            this.apiKeyRequestsTimeStamp.put(apiKey, new ArrayList<>());
        }

        this.apiKeyRequestsTimeStamp.get(apiKey).add(now);
        return this.geocodingService.getAddress(longitude, latitude, apiKey);
    }
}
