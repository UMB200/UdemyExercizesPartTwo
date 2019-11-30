package com.UmidJavaUdemy;

public class LoopingExamples {
    public static void basicLoop(){
        /*  using the for statement, call the calculateInterest method with
        the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        and print the results to the console window.
        How would you modify the for loop above to do the same thing as
        shown but to start from 8% and work back to 2% */
        for (int i = 2; i < 9; i++) {
            System.out.println("10000 at rate " + i + " % is " +
                    String.format("%.2f", ChallengeWeekDay.calcInt(10000, i)) );
        }
        for(int i = 8; i > 1 ; i--){
            System.out.println("10000 at rate " + i + " % is " +
                    String.format("%.2f", ChallengeWeekDay.calcInt(10000, i)) );
        }
    }

    public static void loopingPrime() {
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit
       int counter = 0;
        for(int i = 1; i < 100; i++){
            if(isPrime(i)){
                counter++;
                System.out.println("Prime number " + i);
                if(counter == 10){
                    System.out.println("Exiting...");
                    break;
                }
            }
        }

    }
    public static void LoopingSumThreeOrFive() {
        /*
        Create a for statement using a range of numbers from 1 to 1000 inclusive.
        Sum all the numbers that can be divided with both 3 and also with 5.
        For those numbers that met the above conditions, print out the number.
        break out of the loop once you find 5 numbers that met the above conditions.
        After breaking out of the loop print the sum of the numbers that met the above conditions.
        Note: Type all code in main method  */
        int counter = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Number " + i + " met condition");
                sum += i;
                counter++;
                if (counter == 5) {
                    System.out.println("Enough");
                    System.out.println("Total sum of numbers that met condition is " + sum);
                    break;
                }
            }
        }
    }
    public static boolean isPrime (int n){
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    /*
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;
     */
    public static boolean isEven(int number){
        if(number % 2 == 0){
            //System.out.println(number + " is even number");
            return true;
        }
        else {
            //System.out.println(number + " is not even number");
            return false;
        }
    }
    // Modify the while code above
    // Make it also record the total number of even numbers it has found
    // and break once 5 are found
    // and at the end, display the total number of even numbers found
    public static void doWhileExample(){
        int start = 4;
        int end = 20;
        int counter = 0;
        while (start <= end && counter <5){
            start++;

            if(!LoopingExamples.isEven(start)){
                continue;
            }
            System.out.println("Even number is "+ start);
            counter ++;

        }  System.out.println("Quantity of even numbers is " + counter);
    }


}

