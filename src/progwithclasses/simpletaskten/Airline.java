package progwithclasses.simpletaskten;

public class Airline {

    private String destination;
    private int flight_number;
    private String type_aircraft;
    private String time_of_departure;
    private String day_of_week;

    public Airline(String destination, int flight_number, String type_aircraft, String time_of_departure, String day_of_week) {
        this.destination = destination;
        this.flight_number = flight_number;
        this.type_aircraft = type_aircraft;
        this.time_of_departure = time_of_departure;
        this.day_of_week = day_of_week;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public String getType_aircraft() {
        return type_aircraft;
    }

    public void setType_aircraft(String type_aircraft) {
        this.type_aircraft = type_aircraft;
    }

    public String getTime_of_departure() {
        return time_of_departure;
    }

    public void setTime_of_departure(String time_of_departure) {
        this.time_of_departure = time_of_departure;
    }

    public String getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(String day_of_week) {
        this.day_of_week = day_of_week;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flight_number=" + flight_number +
                ", type_aircraft='" + type_aircraft + '\'' +
                ", time_of_departure='" + time_of_departure + '\'' +
                ", day_of_week='" + day_of_week + '\'' +
                '}';
    }
}
