import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.params.provider.Arguments.*;

public class testLeapYear {
    private static Stream<Arguments> useCases() {
        return Stream.of(
                of(true, 4),
                of(false, 100)
        );
    }

    @ParameterizedTest()
    @MethodSource("useCases")
    public void testLeapYear(boolean expected, int input) {

        Assertions.assertEquals(expected, LeapYear.isLeapYear(input));
    }

}
