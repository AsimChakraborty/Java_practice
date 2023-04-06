package anisul_islam_java_assignment;

import java.util.Scanner;

public class Vowel_consonent {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        char ch;
        System.out.println("Enter any letter:");
        ch=abc.next().charAt(0);
        if (ch =='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u') {
            System.out.println("vowel");
        }
        else {
            System.out.println("consonent");
        }

    }
}
