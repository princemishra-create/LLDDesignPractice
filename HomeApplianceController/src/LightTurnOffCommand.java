public class LightTurnOffCommand implements Command{
    private final BedroomLights bedroomLights;

    public LightTurnOffCommand(BedroomLights bedroomLights){
        this.bedroomLights = bedroomLights;
    }

    @Override
    public boolean execute() {
        return this.bedroomLights.turnOff();
    }

    @Override
    public boolean undo() {
        return this.bedroomLights.turnOn();
    }
}
