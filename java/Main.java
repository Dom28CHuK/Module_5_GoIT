import classes.*;

public class Main {
    public static void main(String[] args) {
        FirNum firNum = new FirNumFizzBuzz();
        FirTest firTest = new FirTest();

        //Should be 83
        System.out.println(firTest.test(firNum, 20));
    }
}
