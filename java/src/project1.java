//import java.time.LocalTime;
//import java.util.Scanner;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//public class project1 {
//    public static void main(String[]args){
//        Scanner myobj=new Scanner(System.in);
//        System.out.println("--------------");
//        System.out.println(" Edu System ");
//        String reg= "reg";
//        String info="info";
//        String pay ="pay";
//        String result="result";
//        String exit ="exit";
//        String admin="admin";
//
//
//        System.out.println("This is reg page:" +reg);
//        System.out.println("This is info page:" +info);
//        System.out.println("This is pay page:" +pay);
//        System.out.println("This is result page:" +result);
//        System.out.println("This is exit page:" +exit);
//        System.out.println("This is a admin page:"+admin);
//
//        System.out.println("Enter your choice:");
//
//
//        String choice = myobj.nextLine();
//        if (choice.equals(reg)) {
//            System.out.println("registration page");
//            System.out.println("Enter your class:");
//            String c_lass = myobj.nextLine();
//            System.out.println("Enter your section:");
//            int section = myobj.nextInt();
//            System.out.println("You have registered  " + c_lass + ", section " + section);
//
//
//        } else if (choice.equals(info)) {
//            System.out.println("information page");
//            System.out.println("Enter your class:");
//            String c_lass = myobj.nextLine();
//            System.out.println("Enter your roll:");
//            int roll = myobj.nextInt();
//            System.out.println("You have study " + c_lass + " class,And your roll is  " + roll);
//            System.out.println("Enter your choice:");
//
//            // Prompt the user to enter a choice again
//            choice = myobj.nextLine();
//
//
//        } else if (choice.equals(pay)) {
//            System.out.println("payment page");
//            System.out.println("Enter Month:");
//            String time=myobj.nextLine();
//            System.out.println("Admission free month:"+time);
//            System.out.println("Enter Amount:");
//            int amount = myobj.nextInt();
//            System.out.println("your admission free:" +amount +"tk");
//
//            System.out.println("Enter time (hh:mm:ss): ");
//
//            Scanner myobjtest=new Scanner(System.in);
//            String timeInput=myobjtest.nextLine();
//            System.out.println("Enterd time (hh:mm:ss): "+timeInput);
//
//            System.out.println("Enter date (dd-M-yyyy):");
//            Scanner myobjtest1=new Scanner(System.in);
//            String dateInput=myobjtest1.nextLine();
//            System.out.println("Date is: "+dateInput);
//
//
//
//
//        } else if (choice.equals(result)) {
//            System.out.println("result page");
//
//        } else if (choice.equals(exit)) {
//            System.out.println("Thank you for using Edu System.");
//        }
//        else if (choice.equals(admin)){
//            System.out.println("This is a admin page");
//            System.out.println("Enter your Name:");
//            String name = myobj.nextLine();
//            System.out.println("Enter your Password:");
//            int pass = myobj.nextInt();
//            System.out.println("Your name is " + name + " ,password   " + pass);
//        }
//        else {
//            System.out.println("Invalid choice.try again.");
//        }
//
//    }
//}



import java.util.Scanner;

public class project1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("********");
            System.out.println("  MAIN MENU");
            System.out.println("********");
            System.out.println("1. Register");
            System.out.println("2. Information");
            System.out.println("3. Payment");
            System.out.println("4. Result");
            System.out.println("5. Exit");
            System.out.println("6. Admin");
            System.out.println("Enter your choice: ");

            choice = scanner.nextLine();

            switch (choice) {
                case "1":

                    System.out.println("REGISTRATION MENU");
                    System.out.println("Enter your class:");
                    String c_lass = scanner.nextLine();
                    System.out.println("Enter your section:");
                    int section = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("You have registered  " + c_lass + ", section " + section);
                    break;

                case "2":

                    System.out.println("INFORMATION MENU");
                    System.out.println("Enter your class:");
                    String classInfo = scanner.nextLine();
                    System.out.println("Enter your roll:");
                    int roll = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("You are studying " + classInfo + " class, and your roll is " + roll);
                    break;

                case "3":

                    System.out.println("PAYMENT MENU");
                    System.out.println("Enter Month:");
                    String month = scanner.nextLine();
                    System.out.println("Enter Balance:");
                    int balance = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Class:");
                    String classPay = scanner.nextLine();
                    System.out.println("Enter Section:");
                    int sectionPay = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Date (dd-M-yyyy):");
                    String date = scanner.nextLine();
                    System.out.println("Month: " + month + ", Balance: " + balance + ", Class: " + classPay + ", Section: " + sectionPay + ", Date: " + date);
                    break;

                case "4":

                    System.out.println("RESULT MENU");
                    break;

                case "5":

                    System.out.println("Thank you .");
                    break;

                case "6":
                    System.out.println("ADMIN MENU");
                    System.out.println("Enter your username:");
                    String username = scanner.nextLine();
                    System.out.println("Enter your password:");
                    String password = scanner.nextLine();
                    System.out.println("Username: " + username + ", Password: " + password);
                    break;

                default:
                    // Invalid choice
                    System.out.println("Invalid choice.");
                    break;
            }

            System.out.println("Press Enter to continue...");
            scanner.nextLine();

        } while (!choice.equals("5"));
    }
}
