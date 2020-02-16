public class Truck extends Car {
    private double loadWeight;
    private static final double ADD_FUEL_CONSUMPTION_WITH_AIR_CONDITION = 1.6;
    private static final double ADD_FUEL_CONSUMPTION_WITH_LOAD = 0.5;

    public Truck(String name, double fuelTankCapacity, double avgFuelConsumption, double loadWeight) {
        super(name, fuelTankCapacity, avgFuelConsumption);
        this.loadWeight = loadWeight;
    }

    @Override
    public double fuelConsumption() {
        return super.fuelConsumption()+addFuelConsumptionWithLoad();
        //return super.fuelConsumption()+addFuelConsumptionWithAirCondition();
    }

    private double addFuelConsumptionWithLoad() {
        return (ADD_FUEL_CONSUMPTION_WITH_LOAD*loadWeight/100)/100;
    }

    @Override
    public double addFuelConsumptionWithAirCondition(){
        return ADD_FUEL_CONSUMPTION_WITH_AIR_CONDITION/100;
    }
}
