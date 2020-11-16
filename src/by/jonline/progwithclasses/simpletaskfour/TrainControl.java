package by.jonline.progwithclasses.simpletaskfour;

import java.util.Arrays;
import java.util.Comparator;

public class TrainControl {

    private Train[] trains;

    public TrainControl(Train[] trains) {
        this.trains = trains;
    }

    public Train[] getTrains() {
        return trains;
    }

    public void setTrains(Train[] trains) {
        this.trains = trains;
    }

    public String sortTrainsNumbers(){
        Arrays.sort(this.getTrains(), new SortByTrainNumber());
        return Arrays.toString(this.getTrains());
    }

    public String trainInfo(int number){
        for (Train train: this.trains) {
            if(train.getTrainNumber() == number){
                return "Destination: " +  train.getDestination() + ", Departure time: " + train.getDepartureTime();
            }
        }
        return "Train number " + number + " - not found";
    }

    public String sortDestination(){
        Arrays.sort(this.getTrains(), new SortByDepartureTime());
        Arrays.sort(this.getTrains(), new SortByDestination());
        return Arrays.toString(this.getTrains());
    }

    private static class SortByTrainNumber implements Comparator<Train> {
        public int compare(Train a, Train b) {
            return Integer.compare(a.getTrainNumber(), b.getTrainNumber());
        }
    }

    private static class SortByDepartureTime implements Comparator<Train> {
        public int compare(Train a, Train b){
            String timeFirstTrain = a.getDepartureTime();
            String timeSecondTrain = b.getDepartureTime();
            return timeFirstTrain.compareTo(timeSecondTrain);
        }
    }

    private static class SortByDestination implements Comparator<Train> {
        public int compare(Train a, Train b){
            String destFirstTrain = a.getDestination();
            String destSecondTrain = b.getDestination();
            return destFirstTrain.compareTo(destSecondTrain);
        }
    }


}