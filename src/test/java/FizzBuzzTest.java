import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_itself_given_normal_number_when_count_off() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz(2);
        // When
        fizzBuzz.countOff();
        // Then
        assertEquals(2, fizzBuzz.getFizzBuzzCount());
    }
}