public class GeyserTurnOffCommand implements Command{
    private final Geyser geyser;

    public GeyserTurnOffCommand(Geyser _geyser){
        this.geyser = _geyser;
    }

    @Override
    public boolean execute() {
        return this.geyser.turnOff();
    }

    @Override
    public boolean undo() {
        return this.geyser.turnOn();
    }
}
