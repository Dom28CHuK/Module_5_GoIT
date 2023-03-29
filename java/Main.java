import classes.FirNum;
import classes.FirNumSum;
import classes.FirTest;

public class Main {
    public static void main(String[] args) {
        FirNum firNum = new FirNum();
        FirTest firTest = new FirTest();

        //Should be 10
        System.out.println(firTest.test(firNum, 3));
    }
}
