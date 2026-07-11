import java.util.ArrayList;
import java.util.List;

public class Broker {
    private Command currentCommand;
    private final List<Command> commandList;

    public Broker(){
        this.commandList = new ArrayList<>();
    }

    void setCommand(Command command){
        this.currentCommand = command;
    }

    void execute(){
        this.commandList.add(currentCommand);
        this.currentCommand.execute();
    }

    void undo(){
        if(this.commandList.isEmpty()){
            return;
        }

        Command command = commandList.removeLast();
        command.undo();
    }
}
