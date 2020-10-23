package Example;

public class Eg1_FourWheels extends Eg1_Vehicle {
    private boolean powerSteer;

    public Eg1_FourWheels(String vId, String vName, int numWheels, boolean powerSteer) {
        super(vId, vName, numWheels);
        this.powerSteer = powerSteer;
    }

    public void showDetails() {
        System.out.println("Vehicle No: " + vehicleNo);
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Number of Wheels: " + wheels);

        if (powerSteer)
            System.out.println("Power Steering: Yes");
        else
            System.out.println("Power Steering: No");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Maximum acceleration: " + speed + "kmph.");
    }
}

