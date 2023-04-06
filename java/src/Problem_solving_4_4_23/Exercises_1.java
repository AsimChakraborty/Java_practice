
//Write a Java method to find the smallest number among three numbers.
package Problem_solving_4_4_23;

import java.util.Scanner;

public class Exercises_1 {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1= abc.nextInt();
        System.out.println("Enter the Second num:");
        int num2= abc.nextInt();
        System.out.println("Enter the third num:");
        int num3= abc.nextInt();
        if(num1<num2 && num1<num3){
            System.out.println("The smallest value is:" +num1);
        }
        else if(num2<num1 && num2<num3){
            System.out.println("The smallest value is:"+num2);
        }
        else  {
            System.out.println("The smallest value is:"+num3);
        }


    }
}
