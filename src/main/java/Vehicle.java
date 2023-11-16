public abstract class Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private static int numWheels;
    private int speed;

    public abstract void testDrive();

    public abstract void park();
}
