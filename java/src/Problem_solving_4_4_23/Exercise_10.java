//Write a Java method to check whether a year (integer) entered by the user is a leap year or not.
package Problem_solving_4_4_23;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year= abc.nextInt();
//        The year must be divisible by 4.
//        If the year is divisible by 100, it must also be divisible by 400.
        if(year%4==0 && (year%100!=0 || year%400==0)){
            System.out.println(" Given year is leep year");
        }
        else {
            System.out.println("Given year is not leep year");
        }
    }
}
