public class Main {
    public static void main(String[] args) {
        Vehicle truck = new Truck("MAN", 500, 25, 500);
        Vehicle car = new Car("Corsa",50,10);
        Vehicle vehicle = new Vehicle("pojazd", 30, 3);

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = truck;
        vehicles[1] = car;
        vehicles[2] = vehicle;

        for (Vehicle vehicle1 : vehicles) {
            System.out.println(vehicle1.toString());
        }

        for (Vehicle vehicle1 : vehicles) {
           if(vehicle1 instanceof Car)
               ((Car) vehicle1).setAirConditionOn(true);
        }

        for (Vehicle vehicle1 : vehicles) {
            System.out.println(vehicle1.toString());
        }
    }
}
