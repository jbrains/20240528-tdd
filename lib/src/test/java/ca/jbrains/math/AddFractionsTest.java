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

    @Test
    void zeroPlusNotZero() {
        final Fraction sum = new Fraction(0).plus(new Fraction(7));
        Assertions.assertEquals(7, sum.intValue());
    }

    private static class Fraction {
        private final int integerValue;

        public Fraction(int integerValue) {
            this.integerValue = integerValue;
        }

        public Fraction plus(Fraction other) {
            if (this.integerValue == 0)
                return other;
            else
                return this;
        }

        public int intValue() {
            return integerValue;
        }
    }
}
