public class AirConditionerTurnOffCommand implements Command{
    private final AirConditioner airConditioner;

    public AirConditionerTurnOffCommand(AirConditioner _airConditioner){
        this.airConditioner = _airConditioner;
    }

    @Override
    public boolean execute() {
        return this.airConditioner.turnOff();
    }

    @Override
    public boolean undo() {
        return this.airConditioner.turnOn();
    }
}
