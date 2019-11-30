package com.UmidJavaUdemy;
/* Write a method called numberToWords with one int parameter named number.
The method should print out the passed number using words for the digits.
If the number is negative, print "Invalid Value".
To print the number as words, follow these steps:
1. Extract the last digit of the given number using the remainder operator.
2. Convert the value of the digit found in Step 1 into a word.
There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
3. Remove the last digit from the number.
4. Repeat Steps 2 through 4 until the number is 0.
The logic above is correct, but in its current state, the words will be printed in reverse order.
For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four".
To overcome this problem, write a second method called reverse.
The method reverse should have one int parameter and return the reversed number (int).
For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
Use the method reverse within the method numberToWords in order to print the words in the correct order.
Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001).
The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero".
To solve this problem, write a third method called getDigitCount.
The method getDigitCount should have one int parameter called number and return the count of the digits in that number.
If the number is negative, return -1 to indicate an invalid value.
For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).
Example Input/Output - getDigitCount method
* getDigitCount(0); should return 1 since there is only 1 digit
* getDigitCount(123); should return 3
* getDigitCount(-12); should return -1 since the parameter is negative
* getDigitCount(5200); should return 4 since there are 4 digits in the number
Example Input/Output - reverse method
* reverse(-121); should  return -121
* reverse(1212); should return  2121
* reverse(1234); should return 4321
* reverse(100); should return 1
Example Input/Output - numberToWords method
* numberToWords(123); should print "One Two Three".
* numberToWords(1010); should print "One Zero One Zero".
* numberToWords(1000); should print "One Zero Zero Zero".
* numberToWords(-12); should print "Invalid Value" since the parameter is negative.
HINT: Use a for loop to print zeroes after reversing the number. As seen in a previous example, 100 reversed becomes 1,
but the method numberToWords should print "One Zero Zero". To get the number of zeroes, check the difference between the digit
count from the original number and the reversed number.
NOTE: When printing words, each word can be in its own line. For example, numberToWords(123); can be:
One
Two
Three
They don't have to be separated by a space.
NOTE: The methods numberToWords, getDigitCount, reverse should be defined as public static like we have been doing so far in the course.
NOTE: In total, you have to write 3 methods.
NOTE: Do not add a main method to the solution code.  */
public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        //System.out.println("Initial value is "+ number);
        int lastDigit;
        int newValue = reverse(number);
        StringBuilder txtNumber = new StringBuilder();
       //System.out.println("New reversed value from main method is " + newValue);
        //System.out.println(number);
        int extraZero = getDigitCount(number) - getDigitCount(newValue);
        do {
            lastDigit = newValue % 10;
            switch (lastDigit) {
                case 1:
                    txtNumber.append("One");
                    break;
                case 2:
                    txtNumber.append("Two");
                    break;
                case 3:
                    txtNumber.append("Three");
                    break;
                case 4:
                    txtNumber.append("Four");
                    break;
                case 5:
                    txtNumber.append("Five");
                    break;
                case 6:
                    txtNumber.append("Six");
                    break;
                case 7:
                    txtNumber.append("Seven");
                    break;
                case 8:
                    txtNumber.append("Eight");
                    break;
                case 9:
                    txtNumber.append("Nine");
                    break;
                default:
                    txtNumber.append("Zero");
                    break;
            }
            txtNumber.append("\n");
            newValue /= 10;
        }
        //printNumberInWord(lastDigit);
        //System.out.println("New Value is " + newValue);
        while (newValue > 0 );

        for(int i = 0; i < extraZero; i++){
            txtNumber.append("Zero\n");
        }
        System.out.println(txtNumber);
    }

    public static int getDigitCount(int number) {
        //int initValue = number;
        int counter = 0;
        if (number < 0) {
            return -1;
        } else {
            do{
                counter++;
                number /=10;
            }
            while (number > 0);
        }
        //System.out.println("Number of value in "+ initValue + " is " + counter);
        return counter;
    }

    public static int reverse(int numRet) {
        //int initValue = numRet;
        int reversedN = 0;
        int lastD;
        while (numRet != 0) {
            lastD = numRet % 10;
            reversedN = reversedN * 10 + lastD;
            numRet /= 10;
        }
//        System.out.println("Reversed number is " + reversedN);
//        if (getDigitCount(reversedN) < getDigitCount(initValue)) {
//            int multiplier = getDigitCount(initValue) - getDigitCount(reversedN);
//            //System.out.println(multiplier);
//            for (int i = 0; i < multiplier; i++) {
//                reversedN *=10;
//            }
//        }
//        System.out.println("New reversed number is " + reversedN);
        return reversedN;
    }

//    public static void printNumberInWord(int day) {
//        if (day == 0) {
//            System.out.println("ZERO");
//        } else if (day == 1) {
//            System.out.println("ONE");
//        } else if (day == 2) {
//            System.out.println("TWO");
//        } else if (day == 3) {
//            System.out.println("THREE");
//        } else if (day == 4) {
//            System.out.println("FOUR");
//        } else if (day == 5) {
//            System.out.println("FIVE");
//        } else if (day == 6) {
//            System.out.println("SIX");
//        } else if (day == 7) {
//            System.out.println("SEVEN");
//        } else if (day == 8) {
//            System.out.println("EIGHT");
//        } else if (day == 9) {
//            System.out.println("NINE");
//        } else System.out.println("OTHER");
//    }
}
