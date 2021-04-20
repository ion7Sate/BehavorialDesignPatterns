package Command;

public class AirConditionOff implements CommandPlan{
    AirCondition airCondition;

    AirConditionOff(AirCondition airCondition)
    {
        this.airCondition = airCondition;
    }
    public void execute()
    {
        this.airCondition.powerOff();
    }

}
