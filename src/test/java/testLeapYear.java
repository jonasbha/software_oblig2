import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;
import static org.junit.jupiter.params.provider.Arguments.*;

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
    public void yearIsDividableWith4AndNot100() {
        Assertions.assertTrue(LeapYear.isLeapYear(40));
    }

    @Test
    public void yearIsDividableWith400() {
        Assertions.assertTrue(LeapYear.isLeapYear(400));
    }

    @Test
    public void yearIsNotDividableWith4() {
        Assertions.assertFalse(LeapYear.isLeapYear(5));
    }

    @Test
    public void yearIsDividableWith100AndNot400() {
        Assertions.assertFalse(LeapYear.isLeapYear(500));
    }

    @Test
    public void yearIsNotDividableWith4000() {
        Assertions.assertFalse(LeapYear.isLeapYear(4000));
    }

    @ParameterizedTest()
    @ValueSource(ints = {4, 40, 2000})
    public void testIfYearIsLeapYear(int year) {
        Assertions.assertTrue(LeapYear.isLeapYear(year));
    }

    @ParameterizedTest()
    @ValueSource(ints = {-4, 300, 1700, 1800, 1900, 2100, 4000})
    public void testIfYearIsNotLeapYear(int year) {
        Assertions.assertFalse(LeapYear.isLeapYear(year));
    }
}
