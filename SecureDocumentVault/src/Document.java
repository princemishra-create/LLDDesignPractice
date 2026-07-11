public class Document {
    private final String documentName;
    private final SecurityLevel securityLevel;

    public Document(String documentName, SecurityLevel securityLevel){
        this.documentName = documentName;
        this.securityLevel = securityLevel;
    }

    public String getDocumentName(){
        return this.documentName;
    }

    public SecurityLevel getSecurityLevel(){
        return this.securityLevel;
    }
}
