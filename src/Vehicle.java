public class Vehicle {
    private String name;
    private double fuelTankCapacity;
    private double avgFuelConsumption;

    public Vehicle(String name, double fuelTankCapacity, double avgFuelConsumption) {
        this.name = name;
        this.fuelTankCapacity = fuelTankCapacity;
        this.avgFuelConsumption = avgFuelConsumption;
    }

    public double range(){
        return fuelTankCapacity/fuelConsumption();
    }

    public double fuelConsumption() {
        return avgFuelConsumption/100;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", fuelTankCapacity=" + fuelTankCapacity +
                ", avgFuelConsumption=" + avgFuelConsumption +
                ", range=" + range();
    }
}
