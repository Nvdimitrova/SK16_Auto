package Exercises_09.AppliancesDetails;

public class Refrigerator extends HouseholdAppliances {
    public int temperature;

    public Refrigerator(String brand, int powerConsumption) {
        super(brand, powerConsumption);
        this.temperature = 0;
    }

    public void setTemperature(int temp){
        if (temp >= -3 && temp <= 5){
            this.temperature = temp;
        }else{
            this.temperature = 0;
        }
        System.out.println(this.temperature + "°C successfully set!");
    }


    public void printSpecificDetails() {
        System.out.println("Current Temperature: " + temperature + "°C");
    }
}