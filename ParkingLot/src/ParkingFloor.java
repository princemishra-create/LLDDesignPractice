import java.util.ArrayList;

public class ParkingFloor {
    private int floorNo;
    private ParkingSpot[][] parkingFloor;
    private int n;
    private int m;

    public ParkingFloor(int floorNo, int n, int m){
        this.n = n;
        this.m = m;
        this.floorNo = floorNo;
        this.parkingFloor = new ParkingSpot[n][m];


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               parkingFloor[i][j] = new ParkingSpot(floorNo, i, j, VehicleType.Car);
            }
        }
    }

    public void updateParkingSpotsForRow(int row, VehicleType vehicleType){
        for (int j=0;j<m;j++){
            parkingFloor[row][j] = new ParkingSpot(floorNo, row, j, vehicleType);
        }
    }

    public void updateParkingSpotsForColumn(int column, VehicleType vehicleType){
        for (int i=0;i<n;i++){
            parkingFloor[i][column] = new ParkingSpot(floorNo, i, column, vehicleType);
        }
    }

    public Ticket getParkingSpot(VehicleType vehicleType){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(this.parkingFloor[i][j].isParked() || this.parkingFloor[i][j].getParkingSpotType() != vehicleType){continue;}
                return this.parkingFloor[i][j].getTicket();
            }
        }

        return null;
    }
}
