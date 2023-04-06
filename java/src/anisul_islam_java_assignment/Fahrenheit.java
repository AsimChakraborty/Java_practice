package anisul_islam_java_assignment;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        double F,C;
        System.out.println("Enter the celsius:");
        C=abc.nextDouble();
        F=1.8*C+32;
        System.out.println("Celsius to Fahrenheit:"+F);
    }
}
