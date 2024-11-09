package Exercises_09.SecondExercise;

public class Refrigerator extends Appliance {
    int temperature;

    public Refrigerator(String brand, int powerConsumption) {
        super(brand, powerConsumption);
        this.temperature = 0;
    }

    public void setTemperature(int temperature) {
        if (temperature >= -3 && temperature <= 5) {
            this.temperature = temperature;
        } else {
            this.temperature = 0;
        }
        System.out.println(this.temperature + "°C successfully set!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Temperature: " + temperature + "°C");
    }
}