package Mediator;

public abstract class Device {
    private Mediator mediator;
    public String name;

    public Device(Mediator mediator, String name) {

        this.mediator = mediator;
        this.name = name;

    }

    public Mediator GetMediator() {
        return this.mediator;
    }

    public abstract void SendMessage(int stateChange);
}
