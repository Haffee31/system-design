package problems.parkinglot;

public class Main {

    public static void main(String[] args) {
        ParkingFloor floor = new ParkingFloor(1);

        ParkingSpot carSpot = new ParkingSpot(1, SpotType.CAR);
        ParkingSpot bikeSpot = new ParkingSpot(2, SpotType.BIKE);
        ParkingSpot truckSpot = new ParkingSpot(3, SpotType.TRUCK);

        floor.addParkingSpot(carSpot);
        floor.addParkingSpot(bikeSpot);
        floor.addParkingSpot(truckSpot);

        Car car = new Car("Car-1");
        Bike bike = new Bike("Bike-1");
        Truck truck = new Truck("Truck-1");

        ParkingSpot spotToParkVehicle = floor.findAvailableSpot(truck);
        spotToParkVehicle.parkVehicle(truck);

        ParkingSpot spot2 = floor.findAvailableSpot(bike);
        spot2.parkVehicle(bike);

        ParkingSpot spot3 = floor.findAvailableSpot(truck);
        if (spot3 == null) {
            System.out.println("Spot Not available");
        } else {
            spot3.parkVehicle(truck);
        }

    }
}
