package anisul_islam_java_assignment;

import java.util.Scanner;

public class Assignmnet_6_logical_or {

        Scanner abc=new Scanner(System.in);
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            char ch;
            System.out.print("Do you love java? ");
            ch=input.next().charAt(0);
            if (ch=='y'||ch=='Y') {
                System.out.println("You are a java lover");
            }
            else if(ch=='n'||ch=='N') {
                System.out.println("You are not a java lover");
            }
            else{
                System.out.println("Invalid action!");
            }
        }
    }


