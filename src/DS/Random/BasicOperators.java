package DS.Random;

/**
 * Created by jude on 4/6/16.
 */
public class BasicOperators {

    public void arithematic(){}

    public  void relational(){}

    public void bitwise(){}

    public void logical(){}

    public void assignment(){}

    /* 2 */
    public void miscOperators(){

        /* (condition) ? " consider this value if true " : " consider this value if false " */
        int a = 9, b;
        b = (a == 1) ? 20 : 30; /* False */
        System.out.println("Value of b is : " + b);

        b = (a == 9) ? 20 : 30; /* True */
        System.out.println("Value of b is : " + b);

        /* instanceof */
        /* (object ) instanceof (class) */

        String name = "Martin";
        boolean result = name instanceof String;
        System.out.println(result);

    }


    public static void main(String[] args) {
        BasicOperators bo = new BasicOperators();
        bo.miscOperators();
    }
}
/** There are 6 basic operator's
 * ARB -> LAM
 * 1) Arithematic : +, -, *, /, %, ++, --; < Addition, Subtraction, Multiplication, Division, Modulos, Increment, Decrement > (7)
 * 2) Relational  :  ==, !=, <, >, <=, >=; < EqualTo, NotEqualTo, LessThan, GreaterThan, LessThanEqualTo, GreaterThanEqualTo > (6)
 * 3) Bitwise : &, |, ^, ~, <<, >>, >>>; < Bitwise AND, Bitwise OR,Bitwise XOR, Bitwise Complement, LeftShift, RightShift, ZeroFillRightShift > (7)
 *
 * 4) Logical : &&,||, !; < Logical AND, Logical OR, Logical NOT > (3)
 * 5) Assignment : =, +=, -=, *=, /=, %=, <<=, >>=, &=, ^=, |=  < .... > (11)
 * 6) Misc :  ? :, instanceof < conditional operator if then else , boolean check > (2)
**/
