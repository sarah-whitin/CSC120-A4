public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    private void boardCar(Car c){
        boolean seatAvailable = c.addPassanger(this);
        if (seatAvailable = true){
            System.out.println(name+" boarded car");
        }else{
            System.out.println("No seats available");
        }
    }

    private void getOffCar(Car c){
        boolean passengers = c.removePassanger(this);
    }
}
