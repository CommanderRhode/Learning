import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Duncan on 14/04/2017.
 */
public class FizzBuzzTest {
    @Test
    public void firstNumberShouldBe1(){
        assertEquals("1",FizzBuzz.generate(1));
    }

    @Test
    public void secondNumberShouldBe2() {
        assertEquals("2",FizzBuzz.generate(2));
    }

    @Test
    public void thirdNumerShouldBeFizz() {
        assertEquals("Fizz",FizzBuzz.generate(3));
    }

    @Test
    public void fithNumberShouldBeBuzz() {
        assertEquals("Buzz",FizzBuzz.generate(5));
    }

    @Test
    public void sixthNumberShouldBeFizz() {
        assertEquals("Fizz",FizzBuzz.generate(6));
    }

    @Test
    public void tenthNumberShouldBeFizz() {
        assertEquals("Buzz",FizzBuzz.generate(10));
    }

    @Test
    public void fifteenthNumberShouldBeFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.generate(15));
    }
}