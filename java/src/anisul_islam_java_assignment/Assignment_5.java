///*
// * Digit spelling program using if,else if, else
// * step 1: ask for a digit between 0-9
// * step 2: check the digit and print it by spelling. example if user input is 0 then print Zero
// * step 3: if the digit is not among 0-9 then print Invalid digit
// */
package anisul_islam_java_assignment;

import java.util.Scanner;

public class Assignment_5 {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        int digit;
        System.out.println("Enter the digit 0-9");
        digit=abc.nextInt();
        if(digit==0){
            System.out.println("Zero");
        } else if (digit ==1) {
            System.out.println("one");
        } else if (digit ==2) {
            System.out.println("Two");
        } else if (digit ==3) {
            System.out.println("three");
        } else if (digit==4) {
            System.out.println("four");
        } else if (digit==5) {
            System.out.println("five");
        } else if (digit==6) {
            System.out.println("six");
        } else if (digit==7) {
            System.out.println("seven");
        } else if (digit==8) {
            System.out.println("eight");
        } else if (digit==9) {
            System.out.println("nine");
        }
        else {
            System.out.println("invalid digit");
        }
    }
}

