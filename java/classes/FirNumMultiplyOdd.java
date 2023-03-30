package classes;

public class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                result *= i;
            }
        }
        return result;
    }
}
