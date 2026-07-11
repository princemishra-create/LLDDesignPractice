//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    AirConditioner airConditioner = new AirConditioner();
    Geyser geyser = new Geyser();
    BedroomLights bedroomLights = new BedroomLights();

    Command airConditionerTurnOnCommand = new AirConditionerTurnOnCommand(airConditioner);
    Command airConditionerTurnOffCommand = new AirConditionerTurnOffCommand(airConditioner);
    Command geyserTurnOnCommand = new GeyserTurnOnCommand(geyser);
    Command geyserTurnOffCommand = new GeyserTurnOffCommand(geyser);
    Command lightTurnOnCommand = new LightTurnOnCommand(bedroomLights);
    Command lightTurnOffCommand = new LightTurnOffCommand(bedroomLights);

    List<Command> goodMorningCommands = new ArrayList<>();
    goodMorningCommands.add(airConditionerTurnOffCommand);
    goodMorningCommands.add(geyserTurnOnCommand);
    goodMorningCommands.add(lightTurnOnCommand);
    Command goodMorningCommand = new GoodMorningCommand(goodMorningCommands);
    goodMorningCommand.execute();
}
