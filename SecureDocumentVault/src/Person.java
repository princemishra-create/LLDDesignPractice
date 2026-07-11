public class Person {
    private final String name;
    private final SecurityLevel securityLevel;

    public Person(String name, SecurityLevel securityLevel){
        this.name = name;
        this.securityLevel = securityLevel;
    }

    public String getName(){
        return this.name;
    }

    public SecurityLevel getSecurityLevel(){
        return this.securityLevel;
    }

    public boolean canAccessDocument(Document document){
        return this.securityLevel.isGreaterThan(document.getSecurityLevel());
    }
}
