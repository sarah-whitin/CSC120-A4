import java.util.ArrayList;

public class Car {
    ArrayList<Passenger> PassengerList;
    int MaxCapacity;
    
    /**
     * Constructor
     */
    Car(ArrayList<Passenger> p, int m){
        this.PassengerList = p;
        this.MaxCapacity = m;
    }

    /**
     * gets capacity
     */
    private int getCapacity(){
        int capacity = this.PassengerList.size();
        return capacity;
    }

     /**
      * gets seat remaining
      */
      private int seatsRemaining(){
        int amntPassanger = getCapacity();
        int seatsRemaining = this.MaxCapacity - amntPassanger;
        return seatsRemaining;
      }

      public Boolean addPassanger(Passenger p){
        boolean seatAvailable;
        int seatsRemaining = seatsRemaining();
        if(seatsRemaining > 0){
            seatAvailable = true;
            this.PassengerList.add(p);
        }else{
            seatAvailable = false;
        }
        return seatAvailable;
      }

      public Boolean removePassanger(Passenger p){
        boolean passengers;
        int seatsRemaining = seatsRemaining();
        if(seatsRemaining > 0){
            passengers = true;
            this.PassengerList.add(p);
        }else{
            passengers = false;
        }
        return passengers;
      }

      public void printManifest(){
        int amntPassenger = getCapacity();
        if(amntPassenger > 0){
            System.out.println(PassengerList);
        }else{
            System.out.println("This car is EMPTY");
        }
      }
}