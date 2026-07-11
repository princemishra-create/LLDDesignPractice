public class AirConditionerTurnOnCommand implements Command{
    private final AirConditioner airConditioner;

    public AirConditionerTurnOnCommand(AirConditioner _airConditioner){
        this.airConditioner = _airConditioner;
    }

    @Override
    public boolean execute() {
        return this.airConditioner.turnOn();
    }

    @Override
    public boolean undo() {
        return this.airConditioner.turnOff();
    }
}
