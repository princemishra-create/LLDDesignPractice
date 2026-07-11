public interface CircuitBreakerStateAction {
    void onSuccess(CircuitBreaker context);
    void onFailure(CircuitBreaker context);
    boolean precheck();
}
