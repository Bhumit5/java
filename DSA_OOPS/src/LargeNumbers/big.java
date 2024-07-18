package LargeNumbers;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.math.BigInteger;

public class big {
    /* *
    * BigInteger -> object -> java.lang.Number -> java.lang.BigInteger
    * BigInteger extends Number, Implements comparable interface
    * Range -> -2 ^ Integer.MAX_VALUE to 2 ^ Integer.MAX_VALUE
    * */


    static BigInteger fact(int num){
        BigInteger factNum = new BigInteger("1");

        for (int i = 2; i <= num; i++) {
            factNum = factNum.multiply(BigInteger.valueOf(i));
        }

        return factNum;
    }

    public static void main(String[] args) {

        //* BigInteger
        BigInteger A = BigInteger.valueOf(13254);
        BigInteger B = BigInteger.valueOf(23513254);

        //* For string values, we have to initialize the object
        BigInteger C = new BigInteger("23513456454");

        System.out.println(C);

        //* For constants
        BigInteger D = BigInteger.ONE;
        System.out.println(D);

        //* Addition of BigIntegers

        BigInteger sum = A.add(B);
        System.out.println(sum);

        /* *
        * A.compareTo(B) < 0 -> A < B returns [-1, 0, 1]
        * -1 if A < B
        * 1 if A > B
        * 0 if A == B
        * */

        System.out.println(A.compareTo(B));
        System.out.println(A.equals(B));
        System.out.println(A.multiply(B));
        System.out.println(B.divide(A));
        System.out.println(B.remainder(A));
        System.out.println(B.subtract(A));

        System.out.println(fact(5));


        //* BigDecimal
        bigDec();

    }

    static void bigDec(){
        double a = 0.04;
        double b = 0.03;

        System.out.println(a-b); //? Print : 0.010000000000000002
        /* *
        * float and double are floating point numbers that represent binary of a fraction and an exponent
        * That's why it gives an error (10 ^ -19)
        * */

        System.out.println("=============| BigDecimal |===============");
        BigDecimal A = new BigDecimal("0.03");
        BigDecimal B = new BigDecimal("0.04");
        System.out.println(B.subtract(A));

        //? All methods are same as BigInteger
    }
}
