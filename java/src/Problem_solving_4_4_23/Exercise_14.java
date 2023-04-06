package Problem_solving_4_4_23;

import java.util.Scanner;

public class Exercise_14 {
    //     Area of pentagon = 1/2 × p × a;where 'p' is the perimeter of the pentagon and 'a' is the apothem of a pentagon.
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the perimeter:");
        int p= abc.nextInt();
        System.out.println("Enter the apothem:");
        int a=abc.nextInt();
        double area;
        area=0.5*p*a;
        System.out.println("The area of the pentagon is:"+area);
    }
}