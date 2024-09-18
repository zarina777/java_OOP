import enums.FlightStatus;

public class FlightInstance {
    private Date departureTime;
    private String gate;
    private FlightStatus status;
    private Aircraft aircraft;

    public boolean cancel() {
        return false;
    }

    public void updateStatus(FlightStatus status) {

    }
}
