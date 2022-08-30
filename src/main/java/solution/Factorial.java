package solution;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static BigInteger factorial(int value) {
        BigInteger f= new BigInteger("1");
        for(int i=1;i<=value;i++){
            f= f.multiply(BigInteger.valueOf(i));
        }
        return f; // your implementation here
    }
}
