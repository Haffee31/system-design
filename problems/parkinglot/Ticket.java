package problems.parkinglot;

import java.time.LocalDateTime;

public class Ticket {

    private String ticketId;

    private Vehicle vehicle;

    private ParkingSpot parkingSpot;

    private LocalDateTime entryTime;

    public Ticket(String ticketId, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = LocalDateTime.now();

    }

    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    @Override
    public String toString() {

        return "Ticket{"
                + "ticketId='" + ticketId + '\''
                + ", vehicle="
                + vehicle.getLicenseNumber()
                + ", spot="
                + parkingSpot.getSpotNumber()
                + ", entryTime="
                + entryTime
                + '}';
    }

}
