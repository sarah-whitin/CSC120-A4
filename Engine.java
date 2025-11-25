public class Engine implements EngineRequirements{
    private FuelType fuelType;
    private double fuelLevel;
    private double maxFuelLevel;

    /**
    * Constructor: Fuellevel will default to the max level at instintiation
    * @param f Fueltype for the engine
    * @param fuelevel Current fuel level for the engine
    * @param maxlevel Current max level for the engine
    */
    Engine(FuelType f, double fuellevel, double maxlevel){
        this.fuelType = f;
        this.fuelLevel = fuellevel;
        this.maxFuelLevel = maxlevel;
    }

    /**
     * Gets fueltype that engine uses
     * @return FuelType that the engine takes
     */
    public FuelType getFuelType(){
        return this.fuelType;
    }

    /**
     * gets max fuel level
     * @return engine's max fuel level
     */
    public double getMaxFuel(){
        double max = this.maxFuelLevel;
        return max;
    }

    /**
     * gets and prints current fuel level
     */
    public double getCurrentFuel(){
        double fuellevel = this.fuelLevel;
        return fuellevel;
    } 

    /**
     * puts current fuellevel up to max fuel level
     */
    public void refuel(){
        this.fuelLevel = getMaxFuel();
        System.out.println("Refueled. Fuel Level: "+this.fuelLevel);
    } 

    /**
     * decrease the current fuel level, print some useful information (e.g. remaining fuel level), and return `True` if the fuel level is above 0 and `False` otherwise.
     */
    public Boolean go(){
        double fuelLevel = getCurrentFuel();
        this.fuelLevel = fuelLevel - 0.0001;
        System.out.println("Fuel Level: "+this.fuelLevel);
        if (this.fuelLevel > 0.0){
            Boolean fuelStatsus = true;
            return fuelStatsus;
        }
        else {
            Boolean fuelStatsus = false;
            return fuelStatsus;
        }
    }

    
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 10.0, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}
