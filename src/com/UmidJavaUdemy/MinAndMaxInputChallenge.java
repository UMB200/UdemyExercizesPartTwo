package com.UmidJavaUdemy;
import java.util.Scanner;
/* -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message gEnter number:h
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
Hint:
-Use an endless while loop.  */
public class MinAndMaxInputChallenge {
    public static void minMax(){
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean flag = true;
        while (true){
            System.out.println("Enter number");
            boolean isNumber = scanner.hasNextInt();
            if(isNumber){
                int enteredValue = scanner.nextInt();
                if(flag) {
                    flag = false;
                    min = enteredValue;
                    max = enteredValue;
                }
                if(enteredValue > max){
                    max = enteredValue;
                }
                if( enteredValue < min){
                    min = enteredValue;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Max value entered is " + max);
        System.out.println("Min value entered is " + min);
        scanner.close();
    }
}
