package problems.parkinglot;

public class Main {

    public static void main(String[] args) {

        ParkingLot parkingLot
                = new ParkingLot("Hafeez Parking Lot");

        ParkingFloor floor1
                = new ParkingFloor(1);

        floor1.addParkingSpot(
                new ParkingSpot(1, SpotType.BIKE)
        );

        floor1.addParkingSpot(
                new ParkingSpot(2, SpotType.CAR)
        );

        floor1.addParkingSpot(
                new ParkingSpot(3, SpotType.TRUCK)
        );

        ParkingFloor floor2
                = new ParkingFloor(2);

        floor2.addParkingSpot(
                new ParkingSpot(4, SpotType.CAR)
        );

        floor2.addParkingSpot(
                new ParkingSpot(5, SpotType.BIKE)
        );

        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);

        Vehicle car
                = new Car("KA-01-CAR");

        Vehicle bike
                = new Bike("KA-01-BIKE");

        Vehicle truck
                = new Truck("KA-01-TRUCK");

        Ticket carTicket
                = parkingLot.parkVehicle(car);

        Ticket bikeTicket
                = parkingLot.parkVehicle(bike);

        Ticket truckTicket
                = parkingLot.parkVehicle(truck);

        parkingLot.parkVehicle(truck);

        parkingLot.displayAvailability();

        parkingLot.unparkVehicle(carTicket);

        parkingLot.displayAvailability();
    }
}
