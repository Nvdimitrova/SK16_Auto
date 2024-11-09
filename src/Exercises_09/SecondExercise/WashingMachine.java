package Exercises_09.SecondExercise;

public class WashingMachine extends Appliance {
    int loadCapacity;

    public WashingMachine(String brand, int powerConsumption, int loadCapacity) {
        super(brand, powerConsumption);
        this.loadCapacity = loadCapacity;
    }

    public void startWashCycle() {
        if (super.isTurnedOn) {
            System.out.println("Starting wash cycle with load capacity: " + loadCapacity);
        } else {
            System.out.println("Cannot start wash cycle. The washing machine is turned OFF.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + "kg");
    }
}