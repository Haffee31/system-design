package problems.parkinglot;

public class ParkingSpot {

    private int spotNumber;
    private SpotType spotType;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotNumber, SpotType spotType) {
        this.spotNumber = spotNumber;
        this.spotType = spotType;
    }

    public boolean isAvailable() {
        return parkedVehicle == null;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    boolean canFitVehicle(Vehicle vehicle) {

        if (!isAvailable()) {
            return false;
        }

        VehicleType vehicleType = vehicle.getVehicleType();

        switch (spotType) {
            case BIKE:
                return vehicleType == VehicleType.BIKE;

            case CAR:
                return vehicleType == VehicleType.CAR
                        || vehicleType == VehicleType.BIKE;

            case TRUCK:
                return vehicleType == VehicleType.CAR
                        || vehicleType == VehicleType.BIKE
                        || vehicleType == VehicleType.TRUCK;

            default:
                return false;
        }

    }

    public void parkVehicle(Vehicle vehicle) {

        if (!canFitVehicle(vehicle)) {

            throw new IllegalArgumentException(
                    "Vehicle cannot fit in this spot"
            );
        }

        parkedVehicle = vehicle;

        System.out.println(
                "Vehicle parked at spot "
                + spotNumber
        );
    }

    public void removeVehicle() {

        parkedVehicle = null;

        System.out.println(
                "Vehicle removed. Spot " + spotNumber + " is now empty"
        );
    }
}
