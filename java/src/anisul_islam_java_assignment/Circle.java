package anisul_islam_java_assignment;

import java.util.Scanner;

public class Circle {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        double radius,area;
        System.out.println("Enter the radious:");
        radius= abc.nextDouble();
        area=3.14*radius*radius;
        System.out.println("area:"+area);
    }
}
