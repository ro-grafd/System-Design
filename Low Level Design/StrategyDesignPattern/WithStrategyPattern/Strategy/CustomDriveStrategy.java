package WithStrategyPattern.Strategy;

public class CustomDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        // Custom message??
        System.out.println("TESLA SPACE X rocket capabilities");
    }
}
