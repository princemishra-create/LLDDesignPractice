import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheGeocodingServiceProxy implements GeocodingServiceInterface{
    private final GeocodingServiceInterface geocodingService;
    private final Map<Pair<Double, Double>, String> cache = new ConcurrentHashMap<>();

    public CacheGeocodingServiceProxy(GeocodingServiceInterface geocodingService){
        this.geocodingService = geocodingService;
    }

    @Override
    public String getAddress(double longitude, double latitude, String apiKey) throws Exception {
        if(!this.cache.containsKey(new Pair<>(longitude, latitude))){
            this.cache.put(new Pair<>(longitude, latitude), this.geocodingService.getAddress(longitude, latitude, apiKey));
        }

        return this.cache.get(new Pair<>(longitude, latitude));
    }
}
