//Write a Java method (takes a number n as input) to displays an n-by-n matrix.
package Problem_solving_4_4_23;


import java.util.Scanner;

public class Exercise_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num = input.nextInt();

        for (int x = 0; x < num; x++){
            for (int y = 0; y < num; y++){
                System.out.print((int)(Math.random() * 2)+ " ");
            }
          System.out.println();
        }
    }
}

