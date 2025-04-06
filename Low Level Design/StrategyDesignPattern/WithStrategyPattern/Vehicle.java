package WithStrategyPattern;
import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;

    // Here we are injection into constructor, so this is called Constructor injection
    Vehicle(DriveStrategy driveObj) {
        this.driveObject = driveObj;
    }
    public void drive() {
        driveObject.drive();
    }
}
