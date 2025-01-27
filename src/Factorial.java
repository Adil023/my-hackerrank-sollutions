import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(extraLongFactorials(5));
    }

    public static BigInteger extraLongFactorials(int n) {

        if(n==0){
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(extraLongFactorials(n-1));
    }
}