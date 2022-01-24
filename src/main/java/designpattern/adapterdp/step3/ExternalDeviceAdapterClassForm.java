package designpattern.adapterdp.step3;

public class ExternalDeviceAdapterClassForm extends ExternalDevice implements Switchable {

    public ExternalDeviceAdapterClassForm() {
    }

    @Override
    public void turnOn() {
        super.turnDeviceOn();
    }

    @Override
    public void turnOff() {
        super.turnDeviceOn();
    }
}
