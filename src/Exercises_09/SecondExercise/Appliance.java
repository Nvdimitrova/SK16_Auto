package Exercises_09.SecondExercise;

public class Appliance {
    public String brand;
    public int powerConsumption;
    public boolean isTurnedOn;

    public Appliance(String brand, int powerConsumption) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.isTurnedOn = false;
    }

    public void turnOn() {
        isTurnedOn = true;
        System.out.println("Appliance is now ON.");
    }

    public void turnOff() {
        isTurnedOn = false;
        System.out.println("Appliance is now OFF.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Power consumption: " + powerConsumption);
        System.out.println("Status: " + (isTurnedOn ? "ON" : "OFF"));
    }
}