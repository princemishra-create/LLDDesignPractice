public class Invoker {
    private Command command;

    public Invoker(){}

    public void setCommand(Command command){
        this.command = command;
    }

    void execute(){
        this.command.execute();
    }
}
