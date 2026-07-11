public class ExitGate {
    private ParkingLot parkingLot;

    public ExitGate(ParkingLot parkingLot)
    {
        this.parkingLot = parkingLot;
    }

    public ParkingCharge calculateParkingCharge(Ticket ticket){
        ticket.unparkVehicle();
        return null;
    }
}
