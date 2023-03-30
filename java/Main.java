import classes.*;

public class Main {
    public static void main(String[] args) {
        FirNum firNum = new FirNumMultiplyOdd();
        FirTest firTest = new FirTest();

        //Should be 15
        System.out.println(firTest.test(firNum, 5));
    }
}
