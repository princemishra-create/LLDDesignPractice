import java.util.LinkedList;
import java.util.Queue;


public class CircuitBreaker {
    private final Queue<Runnable> requests = new LinkedList<>();
    private int failureCount = 0;
    private CircuitBreakerStateAction state = CircuitBreakerClosedState.getInstance();
    private final int failureCountThreshold = 3;

    public void execute() {
        if (requests.isEmpty()) {
            System.out.println("No requests to make");
            return;
        }

        if (this.state.precheck()) {
            StatusCode statusCode = this.requests.remove().execute();

            if(statusCode == StatusCode.SUCCESS){
                this.state.onSuccess(this);
            }else if(statusCode == StatusCode.FAIL){
                this.state.onFailure(this);
            }
        } else {
            System.out.println("Cant make network call dropping the request");
            this.requests.remove();
        }
    }

    public void setState(CircuitBreakerStateAction state) {
        this.state = state;
    }

    public void incrementFailureCount() {
        this.failureCount += 1;
    }

    public boolean hasFailureThresholdExceeded() {
        return this.failureCount > this.failureCountThreshold;
    }

    public void resetFailureCount() {
        this.failureCount = 0;
    }

    public void addRequest(Runnable runnable){
        this.requests.add(runnable);
    }
}
