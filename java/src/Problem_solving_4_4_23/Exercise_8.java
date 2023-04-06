//Write a Java method to compute the future investment value at a given interest rate for a specified number of years. Go to the editor
//Sample data (Monthly compounded) and Output:
//Input the investment amount: 1000
//Input the rate of interest: 10
//Input number of years: 5

package Problem_solving_4_4_23;

import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        System.out.println("Input the investment amount:");
        int amount= abc.nextInt();
        System.out.println("Input the rate of interest:");
        int rate=abc.nextInt();
        System.out.println("Input number of years:");
        int year= abc.nextInt();

        double futurevalue=amount*Math.pow((1+rate/100),year);

        System.out.print("FutureValue is: "+futurevalue);

    }

}
