package anisul_islam_java_assignment;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        double length;
        double width;
        double area;
        System.out.println("Enter the length:");
        length= abc.nextDouble();
        System.out.println("Enter the width:");
        width= abc.nextDouble();
        area=length*width;
        System.out.println("area:"+area);
    }
}
