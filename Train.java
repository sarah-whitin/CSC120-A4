import java.util.ArrayList;

public class Train implements TrainRequirements {
    Engine engine;
    ArrayList<Car> cars;
    int totalMaxCap;   

    /**
     * Constructor
     */
    Train(FuelType fuelType, 
        double currentFuelLevel, 
        double fuelCapacity, 
        int nCars, 
        int passengerCapacity){
        this.engine = new Engine(fuelType, currentFuelLevel, currentFuelLevel);        
        
        this.cars = new ArrayList<>();
        for(int i = 0; i < nCars; i++){
            Car i_car = new Car(passengerCapacity);
            this.cars.add(i_car);
        }
        }

    /**
     * gets engine
     */
    public Engine getEngine(){
        Engine engine = this.engine;
        return engine;
    };

    /**
     * gets and prints scar
     */
    public Car getCar(int i){
        Car car = this.cars.get(i);
        return car;
    };

    /**
     * returns the maximum capacity across all cars
     */
    public int getMaxCapacity(){
        int totalMaxCap = 0;
        for (int i = 0; i < this.cars.size(); i ++) {
            Car car = this.getCar(i);
            int maxcapacity = car.MaxCapacity;
            totalMaxCap = totalMaxCap + maxcapacity;
        };
        return totalMaxCap;
    };

    /**
     * returns the number of remaining open seats across all cars
     */
    public int seatsRemaining(){
        int train_seatsremaing = 0;
        for (int i = 0; i < this.cars.size(); i ++) {
            Car i_car = this.getCar(i);

            int car_seatsremaining =i_car.seatsRemaining();

            train_seatsremaing = train_seatsremaing + car_seatsremaining;
        };
        return train_seatsremaing;
    };

    /**
     *  prints a roster of all `Passenger`s onboard 
     */
    public void printManifest(){
        for (int i = 0; i < this.cars.size(); i++){
            Car car = this.getCar(i);
            car.printManifest();
        }
    };

    public static void main(String[] args) {
        Train train = new Train(FuelType.ELECTRIC, 
            100, 
            0, 
            3, 
            1);

        System.out.println(train.getMaxCapacity());

        Passenger p1 = new Passenger("Alice");
        Passenger p2 = new Passenger("Bob");
        Passenger p3 = new Passenger("Charlie");
        Passenger p4 = new Passenger("David");
        Passenger p5 = new Passenger("Eve");
        Passenger p6 = new Passenger("Frank");
        Passenger p7 = new Passenger("Grace");
        Passenger p8 = new Passenger("Heidi");
        Passenger p9 = new Passenger("Ivan");
        Passenger p10 = new Passenger("Judy");

        System.out.println(train.cars);
        Car car1 = train.getCar(0);
        car1.addPassenger(p1);
        car1.addPassenger(p2);
        car1.addPassenger(p3);
        Car car2 = train.getCar(1);
        car2.addPassenger(p4);
        car2.addPassenger(p5);
        Car car3 = train.getCar(2);
        car3.addPassenger(p6);
        car3.addPassenger(p7);
        car3.addPassenger(p8);
        car3.addPassenger(p9);
        car3.addPassenger(p10);

        train.printManifest();
    
        // train;

}
}