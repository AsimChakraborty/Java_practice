package anisul_islam_java_assignment;

import java.util.Scanner;

public class Assignment_9_factorial {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        int num;
        System.out.println("Enter the num:");
        num= abc.nextInt();
        int fact=1;
        for(int i=1; i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of n"+fact);
    }
}
