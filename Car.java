import java.util.ArrayList;

public class Car implements CarRequirements {
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
    public int getCapacity(){
        int capacity = this.MaxCapacity;
        return capacity;
    }

     /**
      * gets seat remaining
      */
    public int seatsRemaining(){
        int amntPassanger = this.PassengerList.size();
        int seatsRemaining = this.MaxCapacity - amntPassanger;
        return seatsRemaining;
      }

    /**
     * places passenger & returns true in car if seat available, false if not
     */      
    public Boolean addPassenger(Passenger p){
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
      
      /**
       * removes passenger & returns true if passenger was on car, false if not
       */
      public Boolean removePassenger(Passenger p){
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

      /**
       * prints manifest of passengers on car
       */
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
            Car car = new Car(10);

            int capacity = car.getCapacity();
            System.out.println(capacity);

            int seatsremaing = car.seatsRemaining();
            System.out.println(seatsremaing);

            Passenger sarah = new Passenger("Sarah");
            Passenger anna = new Passenger("Anna");

            car.addPassenger(sarah);
         //   Boolean add = car.addPassanger(anna);
         //   System.out.println(add);
            System.out.println(car.PassengerList);

            Boolean remove = car.removePassenger(anna);
            System.out.println(remove);
            // System.out.println(car.PassengerList);

            seatsremaing = car.seatsRemaining();
            System.out.println(seatsremaing);

            car.printManifest();


      }
}