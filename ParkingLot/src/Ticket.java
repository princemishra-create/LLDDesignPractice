import java.time.LocalDateTime;

public class Ticket {
    private ParkingSpot parkingSpot;
    private LocalDateTime parkingTimestamp;

    public Ticket(ParkingSpot parkingSpot){
        this.parkingSpot = parkingSpot;
        this.parkingTimestamp = LocalDateTime.now();
    }

    public void unparkVehicle(){
        this.parkingSpot.unparkVehicle();
    }
}
