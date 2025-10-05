import java.util.ArrayList;

public class Car {
    ArrayList<Passenger> PassengerList;
    int MaxCapacity;
    
    /**
     * Constructor
     */
    Car(int m){
        this.MaxCapacity = m;
        this.PassengerList = new ArrayList<>(m);
    }

    /**
     * gets capacity
     */
    private int getCapacity(){
        int capacity = this.MaxCapacity;
        return capacity;
    }

     /**
      * gets seat remaining
      */
      private int seatsRemaining(){
        int amntPassanger = this.PassengerList.size();
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
        boolean aboard = PassengerList.contains(p);
        if(aboard == true){
            passengers = true;
            this.PassengerList.remove(p);
        }else{
            passengers = false;
            System.out.println("Passenger not on car");
        }
        return passengers;
      }

      public void printManifest(){
        int amntPassenger = this.PassengerList.size();
        ArrayList<String> passengerlist = new ArrayList<>();
        if(amntPassenger > 0){
            for(int i=0; i < this.PassengerList.size(); i++){
                Passenger passenger = this.PassengerList.get(i);
                String name = passenger.getName();
                passengerlist.add(name);
            }
            System.out.println(passengerlist);
        }else{
            System.out.println("This car is EMPTY");
        }
      }

      public static void main(String[] args){
            Car car = new Car(1);

            int capacity = car.getCapacity();
            System.out.println(capacity);

            int seatsremaing = car.seatsRemaining();
            System.out.println(seatsremaing);

            Passenger sarah = new Passenger("Sarah");
            Passenger anna = new Passenger("Anna");

            car.addPassanger(sarah);
         //   Boolean add = car.addPassanger(anna);
         //   System.out.println(add);
            System.out.println(car.PassengerList);

            Boolean remove = car.removePassanger(anna);
            System.out.println(remove);
            // System.out.println(car.PassengerList);

            car.printManifest();


      }
}