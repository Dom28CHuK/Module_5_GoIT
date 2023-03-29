import classes.FirNum;
import classes.FirNumFactorial;
import classes.FirNumSum;
import classes.FirTest;

public class Main {
    public static void main(String[] args) {
        FirNum firNum = new FirNumFactorial();
        FirTest firTest = new FirTest();

        //Should be 120
        System.out.println(firTest.test(firNum, 5));
    }
}
