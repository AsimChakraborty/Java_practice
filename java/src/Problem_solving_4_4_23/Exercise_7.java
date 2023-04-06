package Problem_solving_4_4_23;
import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num=abc.nextInt();
//      pentagonal formula Pn = n(3n - 1) / 2.
        for (int i = 1; i <= num; i++) {
            int pentagonal = i * (3 * i - 1) / 2;
            System.out.println(pentagonal + " ");
        }
        System.out.println();

        }
    }



