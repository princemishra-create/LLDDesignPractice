public class ExternalGeocodingService implements GeocodingServiceInterface{
    @Override
    public String getAddress(double longitude, double latitude, String apiKey) throws Exception {
        return "this is a dummy address";
    }
}
