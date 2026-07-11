import javafx.util.Pair;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeocodingServiceRetryProxy implements GeocodingServiceInterface{
    private final GeocodingServiceInterface geocodingService;

    public GeocodingServiceRetryProxy(GeocodingServiceInterface geocodingService){
        this.geocodingService = geocodingService;
    }

    @Override
    public String getAddress(double longitude, double latitude, String apiKey) throws Exception {
        int retryCount = 3;

        while(retryCount > 0){
            try {
                return this.geocodingService.getAddress(longitude, latitude, apiKey);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            retryCount--;
        }

        throw new Exception("Geocoding service failed");
    }
}
