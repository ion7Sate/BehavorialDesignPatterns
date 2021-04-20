package Command;

public class Remote {
    CommandPlan commandPlan;

    public void setCommand(CommandPlan commandPlan)
    {
        this.commandPlan = commandPlan;
    }

    public void buttonPressed()
    {
        this.commandPlan.execute();
    }
}
