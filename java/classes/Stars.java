package classes;

public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private String getStarString(int numStars, char starChar) {
        if (numStars == 0) {
            return "";
        }
        String starString = "";
        for (int i = 0; i < numStars; i++) {
            starString += starChar;
        }
        return starString;
    }

    @Override
    public String toString() {
        String result = "";
        int numThousands = count / 1000;
        int numHundreds = (count % 1000) / 100;
        int numTens = (count % 100) / 10;
        int numOnes = count % 10;

        result += getStarString(numThousands, 'X');
        result += getStarString(numHundreds, 'Y');
        result += getStarString(numTens, 'Z');
        result += getStarString(numOnes, '*');

        return result;
    }
}
