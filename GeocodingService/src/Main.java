//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    GeocodingServiceInterface accessControlGeocodingServiceProxy = getGeocodingServiceInterface();

    try {
        System.out.println(accessControlGeocodingServiceProxy.getAddress(2345, 345346, "enrvioenb"));
        System.out.println(accessControlGeocodingServiceProxy.getAddress(2345, 45346, "enrvioenb"));
        System.out.println(accessControlGeocodingServiceProxy.getAddress(2345, 35346, "enrvioenb"));
        System.out.println(accessControlGeocodingServiceProxy.getAddress(2345, 34346, "enrvioenb"));
        System.out.println(accessControlGeocodingServiceProxy.getAddress(2345, 34546, "enrvioenb"));
        System.out.println(accessControlGeocodingServiceProxy.getAddress(2345, 34536, "enrvioenb"));
        System.out.println(accessControlGeocodingServiceProxy.getAddress(2345, 34534, "enrvioenb"));
    } catch (Exception e) {
        e.printStackTrace();
    }
}

private static GeocodingServiceInterface getGeocodingServiceInterface() {
    GeocodingServiceInterface geocodingService = new ExternalGeocodingService();
    GeocodingServiceInterface geocodingServiceRetryProxy = new GeocodingServiceRetryProxy(geocodingService);
    GeocodingServiceInterface rateLimitGeocodingServiceProxy = new RateLimitGeocodingServiceProxy(geocodingServiceRetryProxy);
    GeocodingServiceInterface cacheGeocodingServiceProxy = new CacheGeocodingServiceProxy(rateLimitGeocodingServiceProxy);
    return new AccessControlGeocodingServiceProxy(cacheGeocodingServiceProxy);
}
