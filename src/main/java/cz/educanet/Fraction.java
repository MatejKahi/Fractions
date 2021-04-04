package cz.educanet;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //region: basic operations (+, -, *, /)
    /**
     * Adds the fraction to the other fraction. Returns a new fraction.
     * @param other
     * @return new fraction
     */
    public Fraction plus(Fraction other) {
        int a = MathUtils.findLowestCommonMultiple(getDenominator(), other.getDenominator());
        int b = a / getDenominator();
        int c = a / other.getDenominator();
        int součet = (b * getNumerator()) + (c * other.getNumerator());
        return new Fraction(součet, a);
    }


    /**
     * Subtracts other from the fraction. Returns a new fraction.
     * @param other
     * @return new fraction
     */
    public Fraction minus(Fraction other) {
        int a = MathUtils.findLowestCommonMultiple(getDenominator(), other.getDenominator());
        int b = a / getDenominator();
        int c = a / other.getDenominator();
        int rozdíl = (b * getNumerator()) - (c * other.getNumerator());
        return new Fraction(rozdíl, a);
    }
    /**
     * Multiplies the two fractions. Returns a new fraction.
     * @param other
     * @return new fraction
     */
    public Fraction times(Fraction other) {
        int čitatel = getNumerator() * other.getNumerator();
        int jmenovatel= getDenominator() * other.getDenominator();

        return new Fraction(čitatel, jmenovatel);
    }


    /**
     * Divides the two fractions (this / other). Returns a new fraction.
     * @param other
     * @return new fraction
     */
    public Fraction dividedBy(Fraction other) {
        int čitatel = getNumerator() * other.getDenominator();
        int jmenovatel = getDenominator() * other.getNumerator();
        return new Fraction (čitatel, jmenovatel);
    }
    //endregion

    //region: other operations
    /**
     * Gets the reciprocal (flipped) of the fraction. ie. reciprocal of 1/2 is 2/1
     * @return new fraction
     */
    public Fraction getReciprocal() {
        return new Fraction(getDenominator(), getNumerator());
    }

    /**
     * Simplifies the fraction
     * @return new fraction
     */
    public Fraction simplify() {
        int a = MathUtils.findGreatestCommonDenominator(getDenominator(), getNumerator());
        int b = getNumerator() / a;
        int c = getDenominator() / a;
        return new Fraction(b, c);
    }

    /**
     * Calculates the floating value of the fraction.
     * @return float
     */
    public float toFloat() {
        return (float) getNumerator() / (float) getDenominator();

    }
    //endregion

    //region: getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    //endregion
}
