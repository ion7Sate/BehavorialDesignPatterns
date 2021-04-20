package Command;

public class AirConditionOn implements CommandPlan{
    AirCondition airCondition;
    AirConditionOn(AirCondition airCondition)
    {
        this.airCondition = airCondition;
    }
    public void execute()
    {
        this.airCondition.powerOn();
        this.airCondition.setTemperature();
        this.airCondition.start();
    }
}
