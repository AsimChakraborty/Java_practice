///*
// * valid voter program using if,else
// * step 1: ask for a person age
// * step 2: if age is equal or more than 18 than print valid voter
// * step 3: else print invalid voter
// */
package anisul_islam_java_assignment;

import java.util.Scanner;

public class Assigntment_4_if_else {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        int age;
        System.out.println("Enter your age:");
        age= abc.nextInt();
        if(age >=18){
            System.out.println("valid voter");
        }else{
            System.out.println("invalid voter");
        }

    }
}
