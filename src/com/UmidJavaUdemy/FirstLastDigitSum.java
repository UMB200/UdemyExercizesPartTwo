package com.UmidJavaUdemy;
/* Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.
NOTE: The method sumFirstAndLastDigit needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.  */
public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number >= 0) {
            int lastDigit = number % 10;
            while (number > 9) {
                number /= 10;
            } return lastDigit + number;
        }else {
            return -1;
        }
    }
}
