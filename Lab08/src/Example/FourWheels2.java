package Example;

public class FourWheels2 extends Eg1_Vehicle {
    private boolean powerSteers;

    public FourWheels2(String vehicleNo, String vehicleName, int wheels, boolean powerSteers) {
        super(vehicleNo, vehicleName, wheels);
        this.powerSteers = powerSteers;
    }
}
