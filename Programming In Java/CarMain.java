class Car {
    String color;
    int year;
    
    public Car(String c, int y) {
        color = c;
        year = y;
    }
    
    public void start() {
        System.out.println("The car is starting.");
        System.out.println("Program Executed By: Daegna Mangu");
        System.out.println("ERP Id: 0251BCA069");
    }
}
public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Red", 2024);
        Car car2 = new Car("Blue", 2025);
        
        System.out.println("Car 1 color: " + car1.color);
        System.out.println("Car 1 year: " + car1.year);
       
        car1.start();

	System.out.println("Car 2 color: " + car2.color);
        System.out.println("Car 2 year: " + car2.year);
 
        car2.start();

    }
}

