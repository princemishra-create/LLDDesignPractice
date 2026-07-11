public interface GeocodingServiceInterface {
    String getAddress(double longitude, double latitude, String apiKey) throws Exception;
}
