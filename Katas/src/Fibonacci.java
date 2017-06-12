/**
 * Created by Duncan on 15/04/2017.
 */
public class Fibonacci {
    public static int generate(int sequenceNumber) {
        if (sequenceNumber ==3 ) return 1;
        if (sequenceNumber < 3) return sequenceNumber - 1;
        return (generate(sequenceNumber -1 ) + generate(sequenceNumber-2));
    }
}
