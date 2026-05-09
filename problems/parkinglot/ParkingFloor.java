package problems.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {

    private int floorNumber;
    List<ParkingSpot> parkingSpots;

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;

        this.parkingSpots = new ArrayList<>();
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }

    public ParkingSpot findAvailableSpot(
            Vehicle vehicle) {

        for (ParkingSpot spot : parkingSpots) {

            if (spot.canFitVehicle(vehicle)) {
                return spot;
            }
        }

        return null;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void displayAvailability() {

        System.out.println(
                "Floor " + floorNumber
        );

        for (ParkingSpot spot : parkingSpots) {

            System.out.println(
                    "Spot "
                    + spot.getSpotNumber()
                    + " | Type: "
                    + spot.getSpotType()
                    + " | Available: "
                    + spot.isAvailable()
            );
        }
    }
}
