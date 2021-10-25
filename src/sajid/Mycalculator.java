package sajid;

import java.math.BigInteger;

public class Mycalculator implements Ad {

    public int divisorSum(int n) {
        int sum = 1;
        for (int i = 2; i <=( n/2); i++) {
            if (n % i == 0) {
                sum+= 1;
            }
            else
                return sum;

        }

        return sum;
    }

    BigInteger findFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;

    }
}
}
