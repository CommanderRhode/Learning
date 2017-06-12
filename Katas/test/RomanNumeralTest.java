import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * Created by Duncan on 12/06/2017.
 */
public class RomanNumeralTest {

    @Test
    public void Number1ShouldBeI(){
        assertEquals("I",RomanNumeral.generate(1));
    }

    @Test
    public void Number2ShouldBeII(){
        assertEquals("II", RomanNumeral.generate(2));
    }

    @Test
    public void Number3ShouldBeIII(){
        assertEquals("III",RomanNumeral.generate(3));
    }

    @Test
    public void Number4ShouldBeIV(){
        assertEquals("IV",RomanNumeral.generate(4));
    }

    @Test
    public void Number5ShouldBeV(){
        assertEquals("V",RomanNumeral.generate(5));
    }

    @Test
    public void Number6ShouldBeVI(){
        assertEquals("VI", RomanNumeral.generate(6));
    }

    @Test
    public void Number9ShouldBeIX(){
        assertEquals("IX", RomanNumeral.generate(9));
    }

    @Test
    public void Number10ShouldBeX(){
        assertEquals("X", RomanNumeral.generate(10));
    }

    @Test
    public void Numeber14ShouldBeXIV(){
        assertEquals("XIV", RomanNumeral.generate(14));
    }

    @Test
    public void Number19ShouldBeXIX(){
        assertEquals("XIX", RomanNumeral.generate(19));
    }

    @Test
    public void Number20ShouldBeXX(){
        assertEquals("XX", RomanNumeral.generate(20));
    }

    @Test
    public void Number40ShouldBeXL(){
        assertEquals("XL", RomanNumeral.generate(40));
    }

    @Test
    public void Number49ShouldBeXLIX(){
        assertEquals("XLIX",RomanNumeral.generate(49));
    }

    @Test
    public void Number50ShouldBeL(){
        assertEquals("L", RomanNumeral.generate(50));
    }

    @Test
    public void Number90ShouldBeXC(){
        assertEquals("XC",RomanNumeral.generate(90));
    }

    @Test
    public void Number99ShouldBeXCIX(){
        assertEquals("XCIX", RomanNumeral.generate(99));
    }

    @Test
    public void Number100ShouldBeC(){
        assertEquals("C",RomanNumeral.generate(100));
    }

    @Test
    public void Number400ShouldBeCD(){
        assertEquals("CD", RomanNumeral.generate(400));
    }

    @Test
    public void Number500ShouldBeD(){
        assertEquals("D",RomanNumeral.generate(500));
    }

    @Test
    public void Number900ShouldBeCM(){
        assertEquals("CM", RomanNumeral.generate(900));
    }

    @Test
    public void Number1000ShouldBeM(){
        assertEquals("M", RomanNumeral.generate(1000));
    }

    @Test
    public void Number3999ShouldBeMMMCMXCIX(){
        assertEquals("MMMCMXCIX", RomanNumeral.generate(3999));
    }
}
