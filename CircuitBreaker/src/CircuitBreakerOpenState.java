import java.time.Duration;
import java.time.Instant;

public class CircuitBreakerOpenState implements CircuitBreakerStateAction {
    private static volatile CircuitBreakerStateAction instance = null;
    private final int thresholdTimeToWaitInSeconds = 3;
    private static Instant start;

    private CircuitBreakerOpenState() {
    }

    public static CircuitBreakerStateAction getInstance() {
        if (instance == null) {
            instance = new CircuitBreakerOpenState();
        }

        start = Instant.now();
        return instance;
    }

    @Override
    public void onSuccess(CircuitBreaker context) {
        System.out.println("New request passed, moving to Half Open Circuit Phase");
        context.setState(CircuitBreakerHalfOpenState.getInstance());
    }

    @Override
    public void onFailure(CircuitBreaker context) {
        // new request failed do nothing
        System.out.println("New request failed, still in OpenCircuit Phase");
        this.start = Instant.now();
    }

    @Override
    public boolean precheck() {
        return this.getTimeSpentInSeconds() > thresholdTimeToWaitInSeconds || true;
    }

    private long getTimeSpentInSeconds(){
        return Duration.between(start, Instant.now()).getSeconds();
    }
}
