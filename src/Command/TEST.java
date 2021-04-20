package Command;

public class TEST {
    public static void main(String[] args) {

        Remote remote = new Remote();
        MusicSystem musicSystems = new MusicSystem();
        AirCondition airCondition = new AirCondition();
        LightControl lightControl = new LightControl();

        CommandPlan musicPlay = new MusicPlay(musicSystems);
        CommandPlan lightOn = new LightOn(lightControl);
        CommandPlan lightOff = new LightOff(lightControl);
        CommandPlan airConditionOn = new AirConditionOn(airCondition);
        CommandPlan airConditionOff = new AirConditionOff(airCondition);


        remote.setCommand(musicPlay);
        remote.buttonPressed();

        remote.setCommand(lightOn);
        remote.buttonPressed();
        remote.setCommand(lightOff);
        remote.buttonPressed();

        remote.setCommand(airConditionOn);
        remote.buttonPressed();
        remote.setCommand(airConditionOff);
        remote.buttonPressed();
    }

}

