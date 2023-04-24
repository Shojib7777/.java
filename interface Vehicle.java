interface Vehicle { 
    void gearChange(int x); 
    void speedIncrease(); 
    void brakes(); 
} 
 
class Bike implements Vehicle { 
    int speed = 0; 
    int gear = 0; 
     
    public void gearChange(int x) { 
        gear = x; 
        System.out.println("Changed gear to: " + gear); 
    } 
     
    public void speedIncrease() { 
        speed += 10; 
        System.out.println("Increased speed to: " + speed); 
    } 
     
    public void brakes() { 
        speed -= 5; 
        System.out.println("Applied brakes, current speed: " + speed); 
    } 
} 
 
class Car implements Vehicle { 
    int speed = 0; 
    int gear = 0; 
     
    public void gearChange(int x) { 
        gear = x; 
        System.out.println("Changed gear to: " + gear); 
    } 
     
    public void speedIncrease() { 
        speed += 20; 
        System.out.println("Increased speed to: " + speed); 
    } 
     
    public void brakes() { 
        speed -= 10; 
        System.out.println("Applied brakes, current speed: " + speed); 
    } 
     
    public void printSpeedAndGear() { 
        System.out.println("Current speed: " + speed + ", Current gear: " + gear); 
    } 
} 
 
public class Main { 
    public static void main(String[] args) { 
        Bike bike = new Bike(); 
        bike.gearChange(1); 
        bike.speedIncrease(); 
        bike.brakes(); 
         
        Car car = new Car(); 
        car.gearChange(1); 
        car.speedIncrease(); 
        car.speedIncrease(); 
        car.speedIncrease(); 
        car.brakes(); 
        car.printSpeedAndGear(); 
    } 
}