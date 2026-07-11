public class EntryGate {
    private ParkingLot parkingLot;

    public EntryGate(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
    }

    public Ticket getTicket(VehicleType vehicleType){
        return this.parkingLot.getParkingSpot(vehicleType);
    }
}
