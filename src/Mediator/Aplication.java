package Mediator;

import java.util.HashMap;

public class Aplication implements Mediator{
    private HashMap<String, Device> deviceHashMap;
    private HashMap<String, String> interMap;

    public Aplication() {
        deviceHashMap = new HashMap<String, Device>();
        interMap = new HashMap<String, String>();
    }

    @Override
    public void Register(String deviceName, Device device) {
        deviceHashMap.put(deviceName, device);


        if (device instanceof Alarm) {
            interMap.put("Alarm", deviceName);
        } else if (device instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", deviceName);
        } else if (device instanceof TV) {
            interMap.put("TV", deviceName);
        } else if (device instanceof Curtains) {
            interMap.put("Curtains", deviceName);
        }

    }

    @Override
    public void GetMessage(int stateChange, String deviceName) {

        if (deviceHashMap.get(deviceName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) (deviceHashMap.get(interMap
                        .get("CoffeeMachine")))).StartCoffee();
                ((TV) (deviceHashMap.get(interMap.get("TV")))).StartTv();
            } else if (stateChange == 1) {
                ((TV) (deviceHashMap.get(interMap.get("TV")))).StopTv();
            }

        } else if (deviceHashMap.get(deviceName) instanceof CoffeeMachine) {
            ((Curtains) (deviceHashMap.get(interMap.get("Curtains"))))
                    .UpCurtains();

        } else if (deviceHashMap.get(deviceName) instanceof TV) {

        } else if (deviceHashMap.get(deviceName) instanceof Curtains) {

        }

    }

    @Override
    public void SendMessage() {

    }
}
