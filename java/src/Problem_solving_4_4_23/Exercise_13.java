//Write Java methods to calculate the area of a triangle
package Problem_solving_4_4_23;

import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter the base:");
        int b= abc.nextInt();
        System.out.println("Enter the height");
        int h= abc.nextInt();
        double area;
        area=(b*h)/2;

        System.out.println("The area of the triangle is:"+area);

    }
}
