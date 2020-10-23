package Example;

public class Eg1_Vehicle {
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;

    public Eg1_Vehicle(String vehicleNo, String vehicleName, int wheels) {
        this.vehicleNo = vehicleNo;
        this.vehicleName = vehicleName;
        this.wheels = wheels;
    }

    public void accelerate(int speed) {
        System.out.println("Accelerating at:" + speed + "kmph");
    }

}
