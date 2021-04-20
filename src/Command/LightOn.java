package Command;

public class LightOn implements CommandPlan{
    LightControl lightControl;
    LightOn(LightControl lightControl)
    {
        this.lightControl = lightControl;
    }
    public void execute()
    {
        this.lightControl.powerOn();
    }
}
