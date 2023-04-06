import java.util.Scanner;
public class Marks {
    public static void main(String[]args){
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter a num:");
        int num=myobj.nextInt();
        if(num <=49){
            System.out.println("Fail");
        }
        else if(num >50 && num<=60){
            System.out.println("your num is D ");
        }
        else if(num >=60 && num <=70){
            System.out.println("Your number is C ");
        }
        else if (num >=70 && num <=80){
            System.out.println("your number is B ");
        }
        else if(num >=80 && num <=90){
            System.out.println("your number is A ");
        }
        else if (num >=90 && num <=100){
            System.out.println("your nuber is A+");
        }
        else{
            System.out.println("Invaild number");
        }
    }
}
