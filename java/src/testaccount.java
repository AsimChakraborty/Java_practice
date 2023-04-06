import java.util.Scanner;

//create a class
class account{
    int account_id;
    String account_name;
    float amount;


//Method to initialize object



    void insert(int a,String n,float b){
        account_id=a;
        account_name=n;
        amount=b;
    }



//    deposit method



    void deposit(float b){
        amount=amount+b;
        System.out.println(b+"deposit");
    }



    //withdraw method



    void withdraw(float b){
        if(amount<b){
            System.out.println("Insufficient Balance");
        }else{
            amount=amount-b;
            System.out.println(b+" withdrawn");
        }
    }



///method to check the balance of the account
    void checkBalance(){System.out.println("Balance is: "+amount);}




    //method to display the values of an object
    void display(){System.out.println("your account id is "+account_id+ " account name "+account_name+" and amount "+amount);}
}



public class testaccount {
    public static  void main(String[]args){
//        account a1=new account();
//        a1.insert(832345,"Ankit",1000);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account ID: ");
        int account_id = scanner.nextInt();

        System.out.print("Enter account name: ");
        String account_name = scanner.next();

        System.out.print("Enter initial amount: ");
        float amount = scanner.nextFloat();

        account a1 = new account();
        a1.insert(account_id, account_name, amount);
        a1.display();
        a1.checkBalance();
        System.out.print("Enter deposit amount: ");
        float depositAmount = scanner.nextFloat();

        a1.deposit(depositAmount);
//        a1.deposit(40000);
        a1.checkBalance();
        System.out.println("Enter withdraw amount:");
        float withdrawAmount = scanner.nextFloat();
        a1.withdraw(withdrawAmount);
//        a1.withdraw(15000);
        a1.checkBalance();
    }
}
