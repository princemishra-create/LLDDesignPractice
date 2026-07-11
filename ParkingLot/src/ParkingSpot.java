public class ParkingSpot {
    private boolean isParked;
    private VehicleType parkingSpotType;
    private int floorNo;
    private int row, column;

    public ParkingSpot(int floorNo, int row, int column, VehicleType vehicleType){
        this.floorNo = floorNo;
        this.row = row;
        this.column = column;
        this.isParked = false;
        this.parkingSpotType = vehicleType;
    }

    public void parkVehicle(){
        this.isParked = true;
    }

    public void unparkVehicle(){
        this.isParked = false;
    }

    public boolean isParked(){
        return this.isParked;
    }

    public VehicleType getParkingSpotType(){
        return this.parkingSpotType;
    }

    public Ticket getTicket(){
        this.parkVehicle();
        return new Ticket(this);
    }
}
