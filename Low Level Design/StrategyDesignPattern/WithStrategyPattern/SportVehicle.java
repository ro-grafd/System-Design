package WithStrategyPattern;

import WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportVehicle extends Vehicle {
    public SportVehicle() {
        super(new SportsDriveStrategy());
    }
}
