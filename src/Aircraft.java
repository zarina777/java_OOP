import java.util.List;

public class Aircraft extends Airline {
    private String name;
    private String model;
    private int manufacturingYear;
    private List<Seat> seats;

    public List<FlightInstance> getFlights() {
        return null;
    }
}
