//2. Write a Java method to compute the average of three numbers. Go to the editor
//Test Data:
//Input the first number: 25
//Input the second number: 45
//Input the third number: 65
//Expected Output:
//
//The average value is 45.0

package Problem_solving_4_4_23;

import java.util.Scanner;

public class Exercises_2 {
    public static void main(String[]args){
        Scanner abc= new Scanner(System.in);
        System.out.println("Input the first number:");
        int num1= abc.nextInt();
        System.out.println("Input the second  number:");
        int num2= abc.nextInt();
        System.out.println("Input the third  number:");
        int num3= abc.nextInt();
        double result;

        result=(num1+num2+num3)/3;
        System.out.println("The average value is:"+result);
    }
}
