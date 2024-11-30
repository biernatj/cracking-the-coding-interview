package arraysandstrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsUniqueTest {

    IsUnique isUnique = new IsUnique();

    @ParameterizedTest
    @MethodSource("provideStringsForIsUnique")
    public void isUniqueTest(String input, boolean expected) {
        assertEquals(expected, isUnique.verify(input));
    }

    private static Stream<Arguments> provideStringsForIsUnique() {
        return Stream.of(
                Arguments.of("", true),
                Arguments.of("abcs", true),
                Arguments.of("mnbgtyuiopm", false)
        );
    }

}
