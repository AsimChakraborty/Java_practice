//Write a Java method to count all vowels in a string
package Problem_solving_4_4_23;
import java.util.Scanner;
public class Exercise_4 {
    public static void main(String args[]){
        int count = 0;
        System.out.println("Input the string :");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        for (int i=0 ; i<name.length(); i++){
            char ch = name.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                count ++;
            }
        }
        System.out.println("Number of  Vowels in the string: "+count);
    }
}
