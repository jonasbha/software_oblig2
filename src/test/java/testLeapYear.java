import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/*
Et år er et skuddår:

- Når det er delelig med 4, men ikke 100
- Når det er delelig med 400
(For eksempel var år 2000 et skuddår)

Et år er ikke et skuddår:

- Når det ikke er delelig med 4
- Når det er delelig med 100, men ikke 400.
(For eksempel var ikke 1700, 1800 og 1900 skuddår, ei heller blir 2100 et)
* */

public class testLeapYear {

    @Test
    public void yearIsDividableWith4AndNot100() throws TooNegativeException {
        Assertions.assertTrue(LeapYear.isLeapYear(40));
    }

    @Test
    public void yearIsDividableWith400() throws TooNegativeException {
        Assertions.assertTrue(LeapYear.isLeapYear(400));
    }

    @Test
    public void yearIsNotDividableWith4() throws TooNegativeException {
        Assertions.assertFalse(LeapYear.isLeapYear(5));
    }

    @Test
    public void yearIsDividableWith100AndNot400() throws TooNegativeException {
        Assertions.assertFalse(LeapYear.isLeapYear(500));
    }

    @Test
    public void yearIsNotDividableWith4000() throws TooNegativeException {
        Assertions.assertFalse(LeapYear.isLeapYear(4000));
    }

    @Test
    public void testThrowsTooNegativeOnYearBeforeZero() {
        Assertions.assertThrows(TooNegativeException.class, () -> { LeapYear.isLeapYear(-1); });
    }

    @ParameterizedTest()
    @ValueSource(ints = {4, 40, 2000})
    public void testIfYearIsLeapYear(int year) throws TooNegativeException {
        Assertions.assertTrue(LeapYear.isLeapYear(year));
    }

    @ParameterizedTest()
    @ValueSource(ints = {300, 1700, 1800, 1900, 2100, 4000, 8000})
    public void testIfYearIsNotLeapYear(int year) throws TooNegativeException {
        Assertions.assertFalse(LeapYear.isLeapYear(year));
    }
}
