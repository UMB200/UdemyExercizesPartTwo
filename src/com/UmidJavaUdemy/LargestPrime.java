package com.UmidJavaUdemy;
/* Write a method named getLargestPrime with one parameter of type int named number.
If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
The method should calculate the largest prime factor of a given number and return it.
EXAMPLE INPUT/OUTPUT:
* getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
* getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
* getLargestPrime (0); should return -1 since 0 does not have any prime numbers
* getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
* getLargestPrime (-1); should return -1 since the parameter is negative
HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.
NOTE: Do not add a main method to the solution code.  */
public class LargestPrime {
    public static int getLargestPrime(int number){
        int prime;
        if(number <= 1){
            return -1;
        }
        else
            for(prime = 2; prime <= number; prime++){
                //System.out.println("Prime++ is " + prime);
                //System.out.println("Number is " + number);
                if( number % prime == 0){
                    //System.out.println("number % prime == 0 is " + prime);
                    number /= prime;
                    //System.out.println("then number /= prime " + (number /= prime));
                    prime--;
                    //System.out.println("prime-- is " + (prime--));
                }
        }
        //System.out.println("Final prime is "+ prime);
            return prime;
    }
}
