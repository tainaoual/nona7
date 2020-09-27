
package project;

        import org.junit.jupiter.api.Test;

        import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzQixTest {
    private Object StringToInterpret;

    @Test
    public void oneShouldReturnOne() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(1);
        assertThat(spokenWord).isEqualTo("1");
    }

    @Test
    public void multipleOfTreeShouldReturnFizz() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(3);
        assertThat(spokenWord).isEqualTo("Fizz");
    }

    @Test
    public void multipleOfFiveShouldReturnBuzz() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(5);
        assertThat(spokenWord).isEqualTo("Buzz");
    }

    @Test
    public void multipleOfSevenShouldReturnQix() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(7);
        assertThat(spokenWord).isEqualTo("Qix");
    }

    @Test
    public void multipleOfWordsAddShouldReturninorderFizzBzzQix() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(105);
        assertThat(spokenWord).isEqualTo("FizzBuzzQix");
    }
}



