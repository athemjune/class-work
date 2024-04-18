import java.util.Scanner;

interface vehicle{
    String TYPE ="Four-Wheeler";
    String start();
    String stop();
    String getModel();
}

class Car implements vehicle{
    private String model;
    String TYPE="Motor-bike";
    
    Car(String m){
        this.model=m;

    }

    @Override
    public String start(){
        return "Starting the car"+model;
    }

    @Override
    public String stop(){
        return "Stoping the car"+model;
    }

    @Override
    public String getModel(){
        return model;
    }
}

public class MainClass{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the Car Model");
        String carModel = scanner.nextLine();

        Car myCar = new Car(carModel);
        System.out.println("Car Model: "+myCar.getModel());
        System.out.println("Car Model: "+myCar.start());
        System.out.println("Car Model: "+myCar.stop());        
        System.out.println("Vehicle Type: "+vehicle.TYPE);
        scanner.close();

    }
}