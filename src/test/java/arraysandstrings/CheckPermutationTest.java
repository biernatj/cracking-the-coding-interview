package arraysandstrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckPermutationTest {

    CheckPermutation checkPermutation = new CheckPermutation();

    @ParameterizedTest
    @MethodSource("provideStringsForCheckPermutation")
    public void isUniqueTest(String input1, String input2, boolean expected) {
        assertEquals(expected, checkPermutation.verify(input1, input2));
    }

    private static Stream<Arguments> provideStringsForCheckPermutation() {
        return Stream.of(
                Arguments.of("abc", "bac", true),
                Arguments.of("abcs", "abc", false),
                Arguments.of("abcd", "efgh", false)
        );
    }

}
