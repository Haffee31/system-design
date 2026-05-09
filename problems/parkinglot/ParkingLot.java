package problems.parkinglot;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParkingLot {

    private List<ParkingFloor> parkingFloors;
    private String parkingLotName;

    public ParkingLot(String parkingLotName) {
        this.parkingLotName = parkingLotName;
        this.parkingFloors = new ArrayList<>();
    }

    public void addFloor(ParkingFloor parkingfloor) {
        parkingFloors.add(parkingfloor);
    }

    public Ticket parkVehicle(Vehicle vehicle) {

        for (ParkingFloor floor : parkingFloors) {

            ParkingSpot availableSpot
                    = floor.findAvailableSpot(vehicle);

            if (availableSpot != null) {

                availableSpot.parkVehicle(vehicle);

                String ticketId
                        = UUID.randomUUID().toString();

                Ticket ticket = new Ticket(
                        ticketId,
                        vehicle,
                        availableSpot
                );

                System.out.println(
                        "Vehicle parked successfully"
                );

                System.out.println(ticket);

                return ticket;
            }
        }

        System.out.println(
                "Parking lot is full for vehicle type: "
                + vehicle.getVehicleType()
        );

        return null;
    }

    public void unparkVehicle(Ticket ticket) {

        ParkingSpot parkingSpot
                = ticket.getParkingSpot();

        parkingSpot.removeVehicle();

        System.out.println(
                "Vehicle unparked successfully"
        );

        System.out.println(
                "Ticket closed: "
                + ticket.getTicketId()
        );
    }

    public void displayAvailability() {

        for (ParkingFloor floor : parkingFloors) {

            floor.displayAvailability();
        }
    }

}
