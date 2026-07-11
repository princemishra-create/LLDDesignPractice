import java.time.Instant;

public class CircuitBreakerHalfOpenState implements CircuitBreakerStateAction{
    private static volatile CircuitBreakerStateAction instance = null;
    private boolean isRunning = false;


    private CircuitBreakerHalfOpenState() {

    }

    public static CircuitBreakerStateAction getInstance() {
        if (instance == null) {
            instance = new CircuitBreakerHalfOpenState();
        }

        return instance;
    }

    @Override
    public void onSuccess(CircuitBreaker context) {
        isRunning = true;
        context.resetFailureCount();
        context.setState(CircuitBreakerClosedState.getInstance());
        System.out.println("Request passed transitioning to Closed state");
        isRunning = false;
    }

    @Override
    public void onFailure(CircuitBreaker context) {
        isRunning = true;
        context.setState(CircuitBreakerOpenState.getInstance());
        isRunning = false;
    }

    @Override
    public boolean precheck() {
        return !isRunning;
    }
}
