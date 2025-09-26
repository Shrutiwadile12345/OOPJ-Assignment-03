import java.util.Scanner;

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Vehicle: " + brand + ", Speed=" + speed);
    }
}

class Car extends Vehicle {
    String modelType;

    Car(String brand, int speed, String modelType) {
        super(brand, speed);
        this.modelType = modelType;
    }

    @Override
    void display() {
        System.out.println("Car → " + brand + " " + modelType + ", Speed=" + speed);
    }
}

class Bike extends Vehicle {
    String modelType;

    Bike(String brand, int speed, String modelType) {
        super(brand, speed);
        this.modelType = modelType;
    }

    @Override
    void display() {
        System.out.println("Bike → " + brand + " " + modelType + ", Speed=" + speed);
    }
}

class VehicleTypes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Car input
        System.out.print("Enter Car brand: ");
        String carBrand = sc.next();

        System.out.print("Enter Car speed: ");
        int carSpeed = sc.nextInt();

        System.out.print("Enter Car model: ");
        String carModel = sc.next();

        Car c = new Car(carBrand, carSpeed, carModel);

       
        System.out.print("\nEnter Bike brand: ");
        String bikeBrand = sc.next();

        System.out.print("Enter Bike speed: ");
        int bikeSpeed = sc.nextInt();

        System.out.print("Enter Bike model: ");
        String bikeModel = sc.next();

        Bike b = new Bike(bikeBrand, bikeSpeed, bikeModel);

        System.out.println("\n--- Vehicle Details ---");
        c.display();
        b.display();
    }
}
