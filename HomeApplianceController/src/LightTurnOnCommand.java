public class LightTurnOnCommand implements Command{
    private final BedroomLights bedroomLights;

    public LightTurnOnCommand(BedroomLights bedroomLights){
        this.bedroomLights = bedroomLights;
    }

    @Override
    public boolean execute() {
        return this.bedroomLights.turnOn();
    }

    @Override
    public boolean undo() {
        return this.bedroomLights.turnOff();
    }
}
