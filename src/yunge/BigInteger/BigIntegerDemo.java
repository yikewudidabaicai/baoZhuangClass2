package yunge.BigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1000000000000000000000000000000000000000000000000000000");
        System.out.println(bigInteger.add(bigInteger));
        System.out.println(bigInteger);
        System.out.println(bigInteger.subtract(bigInteger.add(bigInteger)));
        System.out.println(bigInteger.multiply(bigInteger));
        System.out.println(bigInteger.divide(new BigInteger("1000000")));
        //存紧精确度更多的小数BigDecimal
    }
}
