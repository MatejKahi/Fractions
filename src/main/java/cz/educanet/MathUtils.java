package cz.educanet;

public class MathUtils {

    /**
     * Calculates the greatest common divisor.
     * https://www.bbc.co.uk/bitesize/guides/z9hb97h/revision/5
     * ie. for 8 and 12 => 4.
     * ie. for 10 and 5 => 5.
     * ect.
     *
     * @param a first number
     * @param b second number
     * @return GCD
     */
    public static int findGreatestCommonDenominator(int a, int b) {
        int c;
        while (b != 0) {
            c = b;
            b = a % b;
            a = c;
        }
        return a;
    }

    public static int findLowestCommonMultiple(int a, int b) {
        int cislo1;
        int cislo2;
        if (a > b) {
            cislo1 = a;
            cislo2 = b;
        } else {
            cislo1 = b;
            cislo2 = a;
        }
        for (int i = 1; i <= cislo2; i++) {
            if ((cislo1 * i) % cislo2 == 0) {
                return i * cislo1;
            }
        }
        return 0;
    }
}
