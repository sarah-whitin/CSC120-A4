import java.util.ArrayList;

public class Train {
    Engine engine;
    ArrayList<Car> cars;
    int totalMaxCap;    
    /**
     * Constructor
     */
    Train(Engine e, Car c){
        this.engine = e;
        this.cars.add(c);
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
     * 
     */
    public int getMaxCapacity(
        int numofcars = ArrayList<Car>.cars.size();
        for (int i == 0; i < numofcars; i ++) {
            Car car = Train.getCar(i);
            int maxcapacity = car.MaxCapacity;
            int totalMaxCap = totalMaxCap + maxcapacity;
        };
    ){};

    /**
     * 
     */
    public int seatsRemaining(){}:

    /**
     * 
     */
    private printManifest(){}:
}
