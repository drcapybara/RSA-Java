import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Random;

public class Init {

    public static void main(final String[] theArgs) {

        //Part 2.1: BigInteger APIs

        // Initialize a BigInteger variable:
        BigInteger bigInt = new BigInteger("0");
        System.out.println("Initialize a BIGNUM variable: \n" + bigInt + "\n");

        // Assign a value from a decimal number string
        bigInt = new BigInteger("12345678901112231223");
        System.out.println("Assign a value from a decimal number string: \n" + bigInt + "\n");

        // Assign a value from a hex number string
        bigInt = new BigInteger("2A3B4C55FF77889AED3F", 16);
        System.out.println("Assign a value from a hex number string: \n" + bigInt + "\n");

        // Generate a random number of 128 bits
        bigInt = new BigInteger(128, new SecureRandom());
        System.out.println("Generate a random number of 128 bits: \n" + bigInt + "\n");

        // Generate a random prime number of 128 bits
        bigInt = BigInteger.probablePrime(128, new SecureRandom());
        System.out.println("Generate a random prime number of 128 bits: \n" + bigInt + "\n");

        //Print out a big number.
        System.out.println(new BigInteger(128, new SecureRandom()) + "\n");

        //Compute res = a − b:

        BigInteger a = new BigInteger("2");
        BigInteger b = new BigInteger("4");
        BigInteger res = a.subtract(b);
        System.out.println("res = a - b: \n" + res + "\n" );
        res = BigInteger.ZERO;



        //and res = a + b:
        res = res.add(a.add(b));
        System.out.println("res = a + b: \n" + res + "\n" );

        //Compute res = a ∗ b.
        res = BigInteger.ZERO;
        res = res.add(a.multiply(b));
        System.out.println("res = a ∗ b: \n" + res + "\n" );

        //Compute res = a ∗ b mod n:
        BigInteger n = new BigInteger("6");
        res = BigInteger.ZERO;
        res = a.multiply(b).mod(n);

        System.out.println("res = a ∗ b mod n: \n" + res + "\n");

        //Compute res = a ^ c mod n:
        res = BigInteger.ZERO;
        int c = 5;
        res = a.pow(c).mod(n);
        System.out.println("res = a ^ " + c + " = " + a.pow(c) + " mod n: \n" + res + "\n");

        /*
        * Compute modular inverse, i.e., given a, find b, such that a ∗ b mod n = 1. The value b is called
        * the inverse of a, with respect to modular n.
        * */
        res = BigInteger.ZERO;

        a = BigInteger.probablePrime(128, new SecureRandom());
        n = BigInteger.probablePrime(128, new SecureRandom());

        res = res.add(a.modInverse(n));

        System.out.println("a is: " + a);
        System.out.println("n is: " + n);
        System.out.println("modular inverse of a with respect to n is: " + res + "\n");

    }

}