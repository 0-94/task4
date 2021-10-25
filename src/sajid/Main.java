package sajid;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Mycalculator mycalculator = new Mycalculator();

        System.out.println("Enter a number you want the sum of: ");
        int a = input.nextInt();
        int sum = mycalculator.divisorSum(a);
        System.out.println("The sum of the divisors of the number is: " + sum);
        System.out.println("Enter a number you want factorial of : ");
        int b = input.nextInt();
        BigInteger factorial = mycalculator.findFactorial(b);
        System.out.println("Factorial of the number is : " + factorial);
    }
}


/*
Name : Sajid Ispak Choudhury
ID : 2012020094
section : B
Email: cse_2012020094@lus.ac.bd
Date: 16-10-21
 */