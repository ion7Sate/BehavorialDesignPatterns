package Mediator;

public class Test {
    public static void main(String[] args) {
        Mediator mediator = new Aplication();
        Alarm mAlarm = new Alarm(mediator, "myAlarm");
        CoffeeMachine mCoffeeMachine = new CoffeeMachine(mediator,
                "myCoffeeMachine");
        Curtains mCurtains = new Curtains(mediator, "myCurtains");
        TV mTV = new TV(mediator, "myTV");
        mAlarm.SendAlarm(0);
        mCoffeeMachine.FinishCoffee();
        mAlarm.SendAlarm(1);

    }
}
