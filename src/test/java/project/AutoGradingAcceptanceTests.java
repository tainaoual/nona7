package project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class AutoGradingAcceptanceTests {

    private FizzBuzzQix underTest;

    private void assertSpokenWord(int numberToInterpret, String expectedWord) {
        String spokenWord = underTest.interpret(numberToInterpret);
        assertThat(spokenWord).isEqualTo(expectedWord);
    }

    @BeforeEach
    void setUp() {
        underTest = new FizzBuzzQix();
    }

    @DisplayName("Acceptance tests for We Can Code IT's Fizz Buzz Qiz exercise.")
    @Test
    public void acceptanceTests() {
        assertAll(
                ()-> assertSpokenWord(1, "1"),
                ()-> assertSpokenWord(2, "2"),
                ()-> assertSpokenWord(3, "Fizz"),
                ()-> assertSpokenWord(4, "4"),
                ()-> assertSpokenWord(5, "Buzz"),
                ()-> assertSpokenWord(6, "Fizz"),
                ()-> assertSpokenWord(7, "Qix"),
                ()-> assertSpokenWord(10, "Buzz"),
                ()-> assertSpokenWord(14, "Qix"),
                ()-> assertSpokenWord(15, "FizzBuzz"),
                ()-> assertSpokenWord(30, "FizzBuzz"),
                ()-> assertSpokenWord(21, "FizzQix"),
                ()-> assertSpokenWord(42, "FizzQix"),
                ()-> assertSpokenWord(35, "BuzzQix"),
                ()-> assertSpokenWord(70, "BuzzQix"),
                ()-> assertSpokenWord(105, "FizzBuzzQix"),
                ()-> assertSpokenWord(210, "FizzBuzzQix"),
                ()-> assertSpokenWord(44100, "FizzBuzzQix"),
                ()-> assertSpokenWord(44101, "44101")
        );
    }
}
