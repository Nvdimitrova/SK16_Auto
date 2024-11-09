package Exercises_09.AppliancesDetails;

public class Appliances {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine("LG", 500, 8);
        washingMachine.displayInfo();
        washingMachine.startWashCycle();

        System.out.println();

        Refrigerator refrigerator = new Refrigerator("Samsung", 150);
        refrigerator.displayInfo();
        refrigerator.setTemperature(3);
    }
}