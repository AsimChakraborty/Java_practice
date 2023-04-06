package Problem_solving_4_4_23;

import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter any positive number:");
        int n= abc.nextInt();
        int count=0;

        for (int i=2;i<n;i++){
            if (n%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
