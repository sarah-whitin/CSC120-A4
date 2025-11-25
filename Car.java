import java.util.ArrayList;

public class Car implements CarRequirements {
    private ArrayList<Passenger> PassengerList;
    private int MaxCapacity;
    
    /**
     * Constructor
     * @param m Car's max capacity
     */
    Car(int m){
        this.MaxCapacity = m;
        this.PassengerList = new ArrayList<>(m);
    }

    /**
     * gets max capacity 
     * @return Car's max capacity 
     */
    public int getCapacity(){
        int capacity = this.MaxCapacity;
        return capacity;
    }

    /**
     * gets seat remaining
     * @return Seats remaining in the car
     */
    public int seatsRemaining(){
        int amntPassanger = this.PassengerList.size();
        int seatsRemaining = this.MaxCapacity - amntPassanger;
        return seatsRemaining;
    }

    /**
     * Adds passenger to the ArrayList of those on the car if there are seats available. 
     * @param p Passenger to get on the car.
     * @return `True` if the passenger was successfully added, and `False` otherwise.
     */      
    public Boolean addPassenger(Passenger p){
        boolean seatAvailable;
        int seatsRemaining = seatsRemaining();
        if(seatsRemaining > 0){
            if(this.PassengerList.contains(p)){
                seatAvailable = false;
                System.out.println("Passenger on car already.");
            }else{
                this.PassengerList.add(p);
                seatAvailable = true;
            }
        }else{
            seatAvailable = false;
        }
        return seatAvailable;
    }
      
    /**
     * Removes passenger to the ArrayList of those on the car if they were on the car.
     * @param p Passenger to be removed from car.
     * @return `True` if the passenger was successfully removed, and `False` otherwise.
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
     * prints out a list of all `Passenger`s aboard the car (or "This car is EMPTY." if there is no one on board)
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
        car.addPassenger(sarah);
    }
}