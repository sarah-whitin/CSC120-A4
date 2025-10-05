public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName(){
        String name = this.name;
        return name;
    }

    private void boardCar(Car c){
        boolean seatAvailable = c.addPassanger(this);
        if (seatAvailable == true){
            System.out.println(name+" boarded car");
        }else{
            System.out.println("No seats available");
        }
    }

    private void getOffCar(Car c){
        boolean passengers = c.removePassanger(this);
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
