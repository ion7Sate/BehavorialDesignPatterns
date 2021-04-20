package Command;

public class LightOff implements CommandPlan{
    LightControl lightControl;
    LightOff(LightControl lightControl)
    {
        this.lightControl = lightControl;
    }
    public void execute()
    {
        this.lightControl.powerOff();
    }
}
