import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Created by Duncan on 15/04/2017.
 */
public class FibonacciTest {
    @Test
    public void FirstNumberShouldBe0() {
        assertEquals(0,Fibonacci.generate(1));
    }

    @Test
    public void SecondNumberShouldBe1() {
        assertEquals(1,Fibonacci.generate(2));
    }

    @Test
    public void ThirdNumberShouldBe1() {
        assertEquals(1,Fibonacci.generate(3));
    }

    @Test
    public void TwentithNumberShouldBe4181() {
        assertEquals(4181,Fibonacci.generate(20));
    }

    @Test
    public void ThirtithNumberShouldBe514229() {
        assertEquals(514229,Fibonacci.generate(30));
    }
}