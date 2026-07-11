public class Server implements IServer {
    private Provider m_provider;

    public Server(Provider provider){
        this.m_provider = provider;
    }

    @Override
    public String checkHeartBeat() {
        return "{\n" +
                "  \"provider\": \"AWS\",\n" +
                "  \"timestamp\": \"2026-02-27T10:00:05Z\",\n" +
                "  \"event_type\": \"FailedLogin\",\n" +
                "  \"source_ip\": \"192.168.1.50\",\n" +
                "  \"payload\": \"USER: admin | PASS: 123456\",\n" +
                "  \"severity\": \"High\"\n" +
                "}";
    }

    @Override
    public Provider getServerProvider() {
        return this.m_provider;
    }
}
