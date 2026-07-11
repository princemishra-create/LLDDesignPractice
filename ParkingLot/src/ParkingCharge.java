public abstract class ParkingCharge {
    private int parkingCost;
    private Ticket ticket;

    public ParkingCharge(Ticket ticket){
        this.ticket = ticket;
    }

    public int getCost(){
        return parkingCost;
    }

    public void getParkingCost(){
        this.calculateParkingCost();
        this.ticket.unparkVehicle();
    }

    abstract void calculateParkingCost();
}
