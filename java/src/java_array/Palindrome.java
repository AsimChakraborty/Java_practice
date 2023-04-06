package java_array;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        System.out.println("Input the string:");
        String s1= abc.next();
        StringBuffer sc=new StringBuffer(s1);
        String s2=sc.reverse().toString();
        if(s1.equals(s2)){
            System.out.println("Given string is palindrome");
        }else{
            System.out.println(("NOT palindrome"));
        }
    }
}
