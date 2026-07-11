public class ParkingLot implements IParkingLot {
    private ParkingFloor[] parkingFloors;
    private int totalFloor;

    public ParkingLot(int totalFloor, int n, int m){
        this.parkingFloors = new ParkingFloor[totalFloor];
        this.totalFloor = totalFloor;

        for(int i=0;i<totalFloor;i++){
            this.parkingFloors[i] = new ParkingFloor(i, n, m);
        }
    }

    public void updateParkingSpotsForRow(int floorNo, int row, VehicleType vehicleType){
        this.parkingFloors[floorNo].updateParkingSpotsForRow(row, vehicleType);
    }

    public void updateParkingSpotsForColumn(int floorNo, int column, VehicleType vehicleType){
        this.parkingFloors[floorNo].updateParkingSpotsForColumn(column, vehicleType);
    }

    public Ticket getParkingSpot(VehicleType vehicleType){
        for (int i=0;i<totalFloor;i++){
            Ticket ticket = parkingFloors[i].getParkingSpot(vehicleType);

            if(ticket!=null){
                return ticket;
            }
        }

        return null;
    }
}
