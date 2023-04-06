import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner myobj= new Scanner(System.in);
        System.out.println("Enter num:");
        int num=myobj.nextInt();
        if(num%2==0){
            System.out.println("This is even number");
        }
        else{
            System.out.println("This is a odd");
        }
    }
}