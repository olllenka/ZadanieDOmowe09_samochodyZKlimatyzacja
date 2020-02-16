public class Car extends Vehicle {
    private boolean airConditionOn;
    private static final double ADD_FUEL_CONSUMPTION_WITH_AIR_CONDITION = 0.8;

    public Car(String name, double fuelTankCapacity, double avgFuelConsumption) {
        super(name, fuelTankCapacity, avgFuelConsumption);
    }

   @Override
   public double fuelConsumption() {
       if(airConditionOn)
           return super.fuelConsumption()+addFuelConsumptionWithAirCondition();
       else
           return super.fuelConsumption();
   }

   public double addFuelConsumptionWithAirCondition(){
       return ADD_FUEL_CONSUMPTION_WITH_AIR_CONDITION/100;
   }

    public void setAirConditionOn(boolean airConditionOn) {
        this.airConditionOn = airConditionOn;
    }

}
