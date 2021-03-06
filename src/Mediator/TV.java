package Mediator;

public class TV extends Device{
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.GetMediator().GetMessage(stateChange, this.name);
    }

    public void StartTv() {
        System.out.println("It's time to Start Tv!");
    }

    public void StopTv() {
        System.out.println("Stop Tv!");
    }
}
