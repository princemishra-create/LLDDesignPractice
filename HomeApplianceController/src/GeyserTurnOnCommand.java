public class GeyserTurnOnCommand implements Command{
    private final Geyser geyser;

    public GeyserTurnOnCommand(Geyser _geyser){
        this.geyser = _geyser;
    }

    @Override
    public boolean execute() {
        return this.geyser.turnOn();
    }

    @Override
    public boolean undo() {
        return this.geyser.turnOff();
    }
}
