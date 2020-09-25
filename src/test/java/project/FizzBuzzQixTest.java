package project;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzQixTest {
    @Test
    public void oneShouldReturnOne() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(1);
        assertThat(spokenWord).isEqualTo("1");
    }
}
