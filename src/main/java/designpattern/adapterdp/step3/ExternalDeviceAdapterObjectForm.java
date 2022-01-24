package designpattern.adapterdp.step3;

public class ExternalDeviceAdapterObjectForm implements Switchable {

    private final ExternalDevice externalDevice;

    public ExternalDeviceAdapterObjectForm(ExternalDevice externalDevice) {
        this.externalDevice = externalDevice;
    }

    @Override
    public void turnOn() {
        externalDevice.turnDeviceOn();
    }

    @Override
    public void turnOff() {
        externalDevice.turnDeviceOn();
    }
}
