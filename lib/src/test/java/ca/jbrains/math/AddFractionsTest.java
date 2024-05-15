package ca.jbrains.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddFractionsTest {
    @Test
    void zeroPlusZero() {
        final Fraction sum = new Fraction(0).plus(new Fraction(0));
        Assertions.assertEquals(0, sum.intValue());
    }

    @Test
    void notZeroPlusZero() {
        final Fraction sum = new Fraction(4).plus(new Fraction(0));
        Assertions.assertEquals(4, sum.intValue());
    }

    private static class Fraction {
        public Fraction(int integerValue) {
        }

        public Fraction plus(Fraction other) {
            return this;
        }

        public int intValue() {
            return 0;
        }
    }
}
