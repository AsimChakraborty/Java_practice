package anisul_islam_java_assignment;

import java.util.Scanner;

public class assignment_3 {
    public static void main(String[]args){
        // Create a program to calculate installment amount for per month


                try (Scanner input = new Scanner(System.in)) {
                    int phonePrice = 1800; // 1800 euros
                    int numberOfInstallment, installmentPerMonth;

                    System.out.print("Number of installments? ");
                    // get number of installments from user
                    numberOfInstallment=input.nextInt();

                    installmentPerMonth=phonePrice/numberOfInstallment;
                    // calculate  installment amount for per month


                    System.out.println("Monthly installment Amount: "+installmentPerMonth + " euros");
                }

            }
        }

