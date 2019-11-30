package com.UmidJavaUdemy;
/* Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far in the course.
NOTE: Do not add a main method to the solution code.
 */
public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int evenNumber = 0;
        int lastDigit;
        if(number >= 0){
            while (number != 0){
                lastDigit = number %10;
                if(lastDigit % 2 == 0){
                    evenNumber += lastDigit;
                }
                number /=10;
            } return evenNumber;
        }
        else return -1;
    }
}
