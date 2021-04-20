package Mediator;

public interface Mediator {

    public abstract void Register(String deviceName, Device device);

    public abstract void GetMessage(int stateChange, String deviceName);

    //public abstract void SendMessage();
}
