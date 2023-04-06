//Write a Java method to compute the sum of the digits in an integer

package Problem_solving_4_4_23;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[]args){

        int  n, sum = 0;
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num= abc.nextInt();
        while(num > 0)
        {
            n = num % 10;
            sum = sum + n;
            num = num / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
}
