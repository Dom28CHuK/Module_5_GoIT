import classes.*;

public class Main {
    public static void main(String[] args) {
        SeasonTest seasonTest = new SeasonTest();

        //Should be winter is cold
        System.out.println(seasonTest.test(new Winter()));

        //Should be spring is warm
        System.out.println(seasonTest.test(new Spring()));

        //Should be summer is warm
        System.out.println(seasonTest.test(new Summer()));

        //Should be autumn is cold
        System.out.println(seasonTest.test(new Autumn()));
    }
}
