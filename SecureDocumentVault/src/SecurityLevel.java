public enum SecurityLevel {
    PUBLIC(0),
    CONFIDENTIAL(1),
    SECRET(2);

    private final int level;

    SecurityLevel(int level){
        this.level = level;
    }

    boolean isGreaterThan(SecurityLevel securityLevel){
        return this.level >= securityLevel.level;
    }
}
