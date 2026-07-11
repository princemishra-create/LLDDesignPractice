import java.util.ArrayList;
import java.util.List;

public class GoodMorningCommand implements Command{
    private final List<Command> commands;

    public GoodMorningCommand(List<Command> commands){
        this.commands = commands;
    }

    public void addCommand(Command command){
        this.commands.add(command);
    }

    @Override
    public boolean execute(){
        for (int i=0;i<this.commands.size();i++){
            Command command = this.commands.get(i);

            if(!command.execute()){
                // command has failed let undo all the previous commands

                for (int j=i-1;j>=0;j--){
                    Command undoCommand = this.commands.get(j);
                    undoCommand.undo();
                }

                return false;
            }
        }

        return true;
    }

    @Override
    public boolean undo() {
        for (Command command : this.commands) {
            command.undo();
        }

        return true;
    }
}
