package Exercises_09.AppliancesDetails;

public class Appliances {
    public static void main(String[] args) {
        HouseholdAppliances washingMachine = new WashingMachine("LG", 500, 8);
        washingMachine.turnOn();
        washingMachine.printDetails();
        ((WashingMachine) washingMachine).printSpecificDetails();

        System.out.println();

        HouseholdAppliances refrigerator = new Refrigerator("Samsung", 150);
        refrigerator.turnOn();
        ((Refrigerator) refrigerator).setTemperature(3);
        refrigerator.printDetails();
        ((Refrigerator) refrigerator).printSpecificDetails();
    }
}

