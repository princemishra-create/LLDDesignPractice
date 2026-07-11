public class AccessControlGeocodingServiceProxy implements GeocodingServiceInterface{
    private final GeocodingServiceInterface geocodingService;

    public AccessControlGeocodingServiceProxy(GeocodingServiceInterface geocodingService) {
        this.geocodingService = geocodingService;
    }


    @Override
    public String getAddress(double longitude, double latitude, String apiKey) throws Exception {
        if(apiKey == null){
            throw new Exception("api key is null");
        }

        // checking if apiKey is valid
        return geocodingService.getAddress(longitude, latitude, apiKey);
    }
}
