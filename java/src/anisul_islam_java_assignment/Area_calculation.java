package anisul_islam_java_assignment;

import java.util.Scanner;

public class Area_calculation {
    public static void main(String[] args){
        Scanner abc=new Scanner(System.in);
        double height;
        double base;
        double result;
        System.out.println("Enter the height:");
        height= abc.nextDouble();
        System.out.println("Enter the base:");
        base=abc.nextDouble();
        result=0.5*height*base;
        System.out.println("calculate area:"+result);

    }

}
