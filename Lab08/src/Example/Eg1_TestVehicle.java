package Example;

public class Eg1_TestVehicle {
    public static void main(String[] args) {
        Eg1_FourWheels objFour = new Eg1_FourWheels("LA-09 CS-1406", "Volkswagen", 4, true);
        objFour.showDetails();
        objFour.accelerate(200);
    }
}
