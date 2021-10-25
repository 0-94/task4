import java.math.BigInteger;
public class Mycalculator implements AdvancedArithmetic {

    @Override
     int divisorSum(int n) {
        int sum = 1;
        for (int i = 2; i <=( n/2); i++) {
            if (n % i == 0) {
                sum+= 1;
            }


        }

        return sum;
    }

    @Override
    public BigInteger findFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
              return factorial;

    }
}

/*
Name : Sajid Ispak Choudhury
ID : 2012020094
section : B
Email: cse_2012020094@lus.ac.bd
Date: 16-10-21
 */