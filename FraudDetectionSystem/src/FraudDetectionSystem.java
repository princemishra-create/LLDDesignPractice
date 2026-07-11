public abstract class FraudDetectionSystem {
    void execute(){
        initAudit();

        boolean isAuthenticated = authenticateInstrument();

        if(!isAuthenticated){
            System.out.println("Authentication failed! Aborting pipeline");
            flagTransaction();
            closeAudit();
            return;
        }

        if(!runVelocityChecks()){
            flagTransaction();
        }

        closeAudit();
    }

    void initAudit(){
        System.out.println("Starting the Audit");
    }

    void closeAudit(){
        System.out.println("Ending the Audit");
    }

    abstract boolean authenticateInstrument();
    abstract boolean runVelocityChecks();

    void flagTransaction(){
        System.out.println("Transaction Failed");
    }
}
