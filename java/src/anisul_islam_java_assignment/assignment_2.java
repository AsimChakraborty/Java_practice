///*
// * Assignment-2 (User Input)
// * step 1: create a class called Product
// * step 2: create a main method
// * step 3: declare variables: id, title, price, description, category
// * step 4: get user input for each variables
//* step 5: print the variables
// */
package anisul_islam_java_assignment;
import java.util.Scanner;
public class assignment_2 {
    public static void main(String[]args){
        int id;
        String title,price, description, category;
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter your id:");
        id=abc.nextInt();
        System.out.println("Enter your title:");
        title=abc.nextLine();
        System.out.println("Enter your price:");
        price=abc.nextLine();
        System.out.println("Enter your description:");
        description=abc.nextLine();
        System.out.println("Enter your category:");
        category=abc.next();
        System.out.println("your id:"+id+"your title"+title+"your price"+price+"your description"+description+"category"+category);
    }
}
