import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * NumericOperation is the class
 * which allows to perform various operations with numbers.
 *
 * @author    Denys Honcharenko
 */
public class NumericOperation {


    /**
     * The method find the sum of the digits in the factorial of a number.
     */
    public static int sumDigitsInFactorialNumber(int number){
        return sumDigitsInNumber(factorial(number));
    }

    /**
     * The method calculates the factorial of a number.
     */
    public static BigInteger factorial(int number){
        return factorial(BigInteger.valueOf(number));
    }

    /**
     * The method calculates the factorial of a number.
     */
    private static BigInteger factorial(BigInteger number) {
        if (intToBoolean(BigInteger.valueOf(1).compareTo(number))){
            return BigInteger.valueOf(1);
        }else if (intToBoolean(BigInteger.valueOf(0).compareTo(number))){
            return BigInteger.valueOf(0);
        }else {
            return number.multiply(factorial(number.subtract(BigInteger.valueOf(1))));
        }
    }

    /**
     * The method find the sum of the digits in the number.
     */
    public static int sumDigitsInNumber(BigInteger number){
        BigInteger sum = new BigInteger("0");
        List<BigInteger> digits = new ArrayList<>();

        do {
            digits.add((number.mod(BigInteger.valueOf(10))));
            number = number.divide(BigInteger.valueOf(10));
        }while (intToBoolean(number.compareTo(BigInteger.valueOf(1))));

        for (BigInteger i: digits) {
            sum = i.add(sum);
        }
        return sum.intValue();
    }

    /**
     * The method converts int to boolean.
     */
    private static boolean intToBoolean(int input) {
        if(input > 0){
            return input!=0;
        }else {
            return false;
        }
    }
}
