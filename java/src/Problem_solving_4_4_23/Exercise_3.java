//Write a Java method to display the middle character of a string. Go to the editor
//Note: a) If the length of the string is odd there will be two middle characters.
//b) If the length of the string is even there will be one middle character.
//Test Data:
//Input a string: 350
//Expected Output:

package Problem_solving_4_4_23;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String name= abc.nextLine();
        if (name.length()%2 ==0){
            System.out.println("given string is even");
        }
        else{
            System.out.println("given string is odd");
        }
    }
}
