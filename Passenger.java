public class Passenger implements PassengerRequirements{
    
    private String name;

    /**
     * Constructor for Passenger class
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Obtains name
     */
    public String getName(){
        String name = this.name;
        return name;
    }

    /**
     * Passenger boards car if there is a seat available, otherwise prints no seats available
     */
    public void boardCar(Car c){
        boolean seatAvailable = c.addPassenger(this);
        if (seatAvailable == true){
            System.out.println(name+" boarded car");
        }else{
            System.out.println("No seats available");
        }
    }

    /**
     * Passenger gets off car if they are in the car, otherwise prints not in car
     */
    public void getOffCar(Car c){
        boolean passengers = c.removePassenger(this);
        if(passengers == true){
            System.out.println(this.name+" got off car");
        }
    }

    public static void main(String[] args) {
        Car car = new Car(1);
        Passenger sarah = new Passenger("Sarah");
        Passenger anna = new Passenger("Anna");

        sarah.boardCar(car);
        car.printManifest();

      //  sarah.getOffCar(car);
     //   car.printManifest();

      //  anna.boardCar(car);
      //  car.printManifest();

        anna.getOffCar(car);
    }
}
