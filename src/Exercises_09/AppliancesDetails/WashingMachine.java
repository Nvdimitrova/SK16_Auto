package Exercises_09.AppliancesDetails;

public class WashingMachine extends HouseholdAppliances {
    public int loadCapacity;

    public WashingMachine(String brand, int powerConsumption, int loadCapacity) {
        super(brand, powerConsumption);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        startWashCycle();
    }

    public void startWashCycle(){
        if (isTurnedOn){
            System.out.println("Starting wash cycle with load capacity: " + loadCapacity);
        }
    }

    public void printSpecificDetails() {
        System.out.println("Load Capacity: " + loadCapacity + "kg");
    }
}
