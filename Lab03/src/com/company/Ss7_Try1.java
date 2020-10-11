package com.company;

public class Ss7_Try1 {

    private int deviceNo;
    private String deviceName, deviceType;
    private double devicePrice;

    public Ss7_Try1() {
        deviceNo = 0;
        deviceName = "";
        deviceType = "";
        devicePrice = 0.0;
    }

    public Ss7_Try1(int deviceNo, String deviceType) {
        this.deviceNo = deviceNo;
        this.deviceType = deviceType;
    }

    public Ss7_Try1(int deviceNo, String deviceName, String deviceType, double devicePrice) {
        this.deviceNo = deviceNo;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.devicePrice = devicePrice;
    }

    public void displayDetails() {
        System.out.println("Device number is: " + deviceNo);
        System.out.println("Device name is: " + deviceName);
        System.out.println("Device type is: " + deviceType);
        System.out.println("Device price is: " + devicePrice);
    }

    public static void main(String[] args) {
	// write your code here
        Ss7_Try1 objDevice = new Ss7_Try1();
        objDevice.displayDetails();

        Ss7_Try1 objDevice1 = new Ss7_Try1(1000, "A37f", "S1", 1023910.234);
        objDevice1.displayDetails();
    }
}