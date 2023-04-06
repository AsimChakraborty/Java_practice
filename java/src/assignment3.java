
import java.util.Scanner;

    public class assignment3{

        public static void main(String []args){
            Scanner abc=new Scanner(System.in);
            System.out.println("Enter your id:");
            int id =abc.nextInt();
            System.out.println("id number is:"+id);
            System.out.println("Enter  your price:");
            int price=abc.nextInt();
            System.out.println("price is:"+price);
            System.out.println("Enter the title:");
            String title=abc.nextLine();
            System.out.println("title is:"+title);

            System.out.println("Enter the description:");
            String des =abc.nextLine();
            System.out.println("des:"+des);
            System.out.println("Enter the category:");
            String cate =abc.nextLine();
            System.out.println("cate:"+cate);


        }
    }
