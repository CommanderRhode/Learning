import java.lang.*;
/**
 * Created by Duncan on 14/04/2017.
 */
public class FizzBuzz {
    public static String generate(int sequenceNumber){
        if (sequenceNumber % 15 == 0) {return "FizzBuzz";}
        if (sequenceNumber % 3 == 0) {return "Fizz";}
        if (sequenceNumber % 5 == 0) {return "Buzz";}
        return String.valueOf(sequenceNumber);}
}
