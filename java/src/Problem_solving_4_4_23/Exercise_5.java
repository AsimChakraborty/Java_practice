package Problem_solving_4_4_23;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[]args){
        Scanner abc= new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String name= abc.nextLine();
        int count=0;
        for (int i = 0; i < name.length() - 1; i++)
        {
            if ((name.charAt(i) == ' ') && (name.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);
    }
}