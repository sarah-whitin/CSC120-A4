public class Engine {
    // Attibutes
    FuelType fueltype;
    double fuellevel;
    double maxfuellevel;


    /**
    * Constructor 
    */
    Engine(FuelType f, double level, double maxlevel){
        this.fueltype = f;
        this.fuellevel = level;
        this.maxfuellevel = maxlevel;
    }

    // Methods

    /**
     * prints & returns fuel type
     */
    private FuelType getFuelType(){
        FuelType fueltype = this.fueltype;
        System.out.println("Current FuelType: "+fueltype);
        return fueltype;
    }; 
    
    /**
     * prints & returns max fuel level
     */
    private double getMaxFuel(){
        FuelType fueltype = getFuelType();
        if (fueltype == FuelType.STEAM){
            this.maxfuellevel = 60;
            System.out.println("Max FuelLevel: "+fuellevel);
            return maxfuellevel;
        }if(fueltype == FuelType.INTERNAL_COMBUSTION){
            this. maxfuellevel = 100;
            System.out.println("Max FuelLevel: "+fuellevel);
            return maxfuellevel;
        }if(fueltype == FuelType.ELECTRIC){
            this. maxfuellevel = 85;
            System.out.println("Max FuelLevel: "+fuellevel);
            return maxfuellevel;
        }else{
            this.maxfuellevel = 75;
            System.out.println("Max FuelLevel: "+fuellevel);
            return maxfuellevel;
        }
    };

    /**
     * gets and prints current fuel level
     */
    private double getCurrentFuel(){
        double fuellevel = this.fuellevel;
        return fuellevel;
    }; 

    /**
     * @return
     */
    public void refuel(){
        this.fuellevel = getMaxFuel();
        System.out.println("Refuled. Fuel Level: "+this.fuellevel);
    }; 

    /**
     * decrease the current fuel level, print some useful information (e.g. remaining fuel level), and return `True` if the fuel level is above 0 and `False` otherwise.
     */
    public Boolean go(){
        double fuelevel = getCurrentFuel();
        this.fuellevel = fuelevel - 1;
        System.out.println("Fuel Level: "+this.fuellevel);
        if (this.fuellevel > 0){
            Boolean fuelstatsus = true;
            return fuelstatsus;
        }
        else {
            Boolean fuelstatsus = false;
            return fuelstatsus;
        }
    };

    
    // Constructor

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 0.0, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
      }

}