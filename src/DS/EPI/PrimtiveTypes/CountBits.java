package DS.EPI;

/**
 * Created by jude on 4/5/16.
 */
import java.util.BitSet;
import java.util.Random;

public class CountBits {

    public static short countBits(int x){
        short numBits = 0;
        while (x != 0) {
            numBits += (x & 1);
            // clang-format off
            x >>>= 1;
            // clang-format on
        }
        return numBits;
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            int x = Integer.parseInt(args[0]);
            System.out.println("x = " + x + ", = " + countBits(x));
        } else {
            Random r = new Random();
            for (int times = 0; times < 1000; ++times) {
                int x = r.nextInt(Integer.MAX_VALUE);
                System.out.println("x = " + x + ", = " + countBits(x) + " " + times);
                BitSet checker = BitSet.valueOf(new long[] {x});
                assert(countBits(x) == checker.cardinality());
            }
        }
    }
}
