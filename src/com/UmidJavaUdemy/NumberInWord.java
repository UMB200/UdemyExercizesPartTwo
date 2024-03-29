package com.UmidJavaUdemy;
/* Write a method called printNumberInWord. The method has one parameter number which is the whole number.
The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9
or other for any other number including negative numbers.
You can use if-else statement or switch statement whatever is easier for you.
NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
NOTE: Do not add main method to solution code.  */
public class NumberInWord {
    public static void printNumberInWord(int day){
        if(day == 0){
            System.out.println("ZERO");
        }
        else if(day == 1){
            System.out.println("ONE");
        }
        else if(day == 2){
            System.out.println("TWO");
        }
        else if(day == 3){
            System.out.println("THREE");
        }
        else if(day == 4){
            System.out.println("FOUR");
        }
        else if(day == 5){
            System.out.println("FIVE");
        }
        else if(day == 6){
            System.out.println("SIX");
        }
        else if(day == 7){
            System.out.println("SEVEN");
        }
        else if(day == 8){
            System.out.println("EIGHT");
        }
        else if(day == 9){
            System.out.println("NINE");
        }
        else System.out.println("OTHER");
    }
}
