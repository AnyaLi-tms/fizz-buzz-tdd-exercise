import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_itself_given_normal_number_when_count_off() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.countOff(2);
        // Then
        assertEquals("2", result);
    }
    @Test
    void should_fizz_given_normal_number_when_count_off() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.countOff(3);
        // Then
        assertEquals("Fizz", result);
    }

    @Test
    void should_buzz_given_normal_number_when_count_off() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.countOff(5);
        // Then
        assertEquals("Buzz", result);
    }
}