package anisul_islam_java_assignment;

import java.util.Scanner;

public class Assignment_7_switch_case {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        int num;
        System.out.println("select the option");
        num= abc.nextInt();
        switch (num){
            case 1:{
                System.out.println("Bengali");
            }
            break;
            case 2:
            {
                System.out.println("hindi");
            }
            break;
            case 3:{
                System.out.println("urdu");
            }
            break;
            case 4:{
                System.out.println("English");
            }
            default:{
                System.out.println("default");
            }
        }
    }
}
