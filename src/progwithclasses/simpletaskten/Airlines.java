package progwithclasses.simpletaskten;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Airlines {

    private Airline[] airlines;

    public Airlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public Airlines(Airline airline) {
        List<Airline> list = new ArrayList<>();
        list.add(airline);
        this.airlines = list.toArray(new Airline[0]);
    }

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    //this method adds an airplane
    public List<Airline> addAirlines(Airline airline){
        List<Airline> list = Arrays.asList(this.airlines);
        list.add(airline);
        return list;
    }
    //this overloaded method adds a list of airplane
    public List<Airline> addAirlines(Airline[] airline){
        List<Airline> list = Arrays.asList(this.airlines);
        list.addAll(Arrays.asList(airline));
        return list;
    }

    //this method deletes the specified plane
    public void removeAirline(Airline airline){
        List<Airline> list = Arrays.asList(this.airlines);
        list.remove(airline);
        this.airlines = list.toArray(new Airline[0]);
    }

    //this method returns a list of airplane at the specified destination
    public List<Airline> destinationAircrafts(String destination){
        List<Airline> list = new ArrayList<>();
        for (Airline air: this.airlines){
            if(air.getDestination().equals(destination)){
                list.add(air);
            }
        }
        return list;
    }



}
