package classes;

public class JupiterStar extends Spaceport {
    @Override
    public int calculateTotalPrice(int passengerCount) {
        return passengerCount * 2 + 500;
    }
}
