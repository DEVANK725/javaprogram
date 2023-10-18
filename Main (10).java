 class Automobile {
    public void start() {
        System.out.println("Engine starts running");
    }

    public void stop() {
        System.out.println("Engine stops running");
    }

    public void seating() {
    }
}

class Car extends Automobile {
    public void no_of_tyres() {
        System.out.println("There are 4 tyres");
    }

    public void fuel() {
        System.out.println("Petrol");
    }

    public void fuel(String fuel) {
        System.out.println("Also runs on " + fuel);
    }

    public void seating() {
        System.out.println("4 seating");
    }
}

class Bike extends Automobile {
    public void no_of_tyres() {
        System.out.println("There are 2 tyres");
    }

    public void fuel() {
        System.out.println("Petrol");
    }

    public void seating() {
        System.out.println("2 seating");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Bike myBike = new Bike();

        System.out.println("Car Details:");
        myCar.start();
        myCar.no_of_tyres();
        myCar.fuel();
        myCar.fuel("diesel");
        myCar.seating();
        myCar.stop();

        System.out.println("\nBike Details:");
        myBike.start();
        myBike.no_of_tyres();
        myBike.fuel();
        myBike.seating();
        myBike.stop();
    }
}
