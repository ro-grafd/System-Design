package WithStrategyPattern;

import WithStrategyPattern.Strategy.CustomDriveStrategy;


public class OffroadVehicle extends Vehicle{
    public OffroadVehicle(){
        super( new CustomDriveStrategy() );     // This is calling the constructor of the parent class
    }                                           // and the parent class has a relation to DriveStrategy interface
}
