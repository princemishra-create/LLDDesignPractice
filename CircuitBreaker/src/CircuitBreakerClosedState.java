public class CircuitBreakerClosedState implements CircuitBreakerStateAction {
    private static volatile CircuitBreakerStateAction instance = null;


    private CircuitBreakerClosedState() {

    }

    public static CircuitBreakerStateAction getInstance() {
        if (instance == null) {
            instance = new CircuitBreakerClosedState();
        }

        return instance;
    }

    @Override
    public void onSuccess(CircuitBreaker context) {
        System.out.println("Success response, in Closed Circuit Phase");
        context.resetFailureCount();
    }

    @Override
    public void onFailure(CircuitBreaker context) {
        System.out.println("Failure response, in Closed Circuit Phase");
        context.incrementFailureCount();

        if (context.hasFailureThresholdExceeded()) {
            System.out.println("Changing to Open Phase");
            context.setState(CircuitBreakerOpenState.getInstance());
        }
    }

    @Override
    public boolean precheck() {
        return true;
    }
}
