import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
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
    private static Stream<Arguments> useCases() {
        return Stream.of(
                of(false, -4),
                of(true, 4),
                of(true, 40),
                of(true, 400),
                of(false, 100),
                of(false, 300),
                of(false, 1700),
                of(false, 1800),
                of(false, 1900),
                of(true, 2000),
                of(false, 2100),
                of(false, 4000)
        );
    }

    @ParameterizedTest()
    @MethodSource("useCases")
    public void testLeapYear(boolean expected, int input) {

        Assertions.assertEquals(expected, LeapYear.isLeapYear(input));
    }

}
