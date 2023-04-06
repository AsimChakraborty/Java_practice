package anisul_islam_java_assignment;

import java.util.Scanner;

public class Assignment_10 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        int sum = 0;
        System.out.print("Enter initial number :");
        num1 = input.nextInt();
        System.out.print("Enter final number :");
        num2 = input.nextInt();

        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.print(" " + i);
            }

        }
        System.out.println(" ");
        System.out.println("The sum is :" + sum);

    }

}
