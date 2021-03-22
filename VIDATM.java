/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidatm;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class VIDATM {

    /**
     * @param args the command line arguments
     */
    
    /*
Write a program to simulate an ATM. Use a method that
returns nothing and passes the total balance as a parameter
to prompt the user using the following prompt:
Enter the number of your desired transaction type:
1. Balance
2. Deposit
3. Withdrawal
4. Quit
Create 3 separate methods for balance, deposit, and withdrawal
that return nothing and take the total balance as a parameter.
The balance method should output the current balance with 2
decimal places. The deposit and withdrawl methods should add or
subtract the amount provided by the user and output the new balance.
Each of these methods should contain a call to the original transaction
list method to continue prompting the user until they decide to quit the program.
*/

    public static void main(String[] args) {
        
        double totalbalance = 0;
        transactionType(totalBalance);
        
        
    } //end main
    
    /**
     * Outputs the user's total balance 
     * @param totalBalance user's current balance
     */
    
    
    public static void transactionType(double totalBalance)
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Enter the number of your desired transaction type: ");
        System.out.println("1. Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdrawal");
        System.out.println("4. Quit");
        System.out.println("-------------------------------------------------");
        
        int choice = scnr.nextInt();
        
        if(choice == 1)
        {
            balance(totalBalance);
            
        }
        
        else if(choice == 2)
        {
            deposit(totalBalance);
            
        }
        
        else if(choice == 3)
        {
            withdrawal(totalBalance);
        }
        else
        {
            System.out.println("Thank you for your transaction.");
        }

        
    }
    
    public static void balance(double totalBalance)
    {
        System.out.printf("Your balance is $%.2fn", totalBalance);
        transactionType(totalBalance);
    }
    
    /**
     * Allows the user to enter a deposit amount and update the total balance
     * @param totalBalance current balance
     */
    
    public static void deposit(double totalBalance)
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a deposist amount: ");
        double amount = scnr.nextDouble();
        totalBalance += amount; //totalBalance = totalBalance + amount
        System.out.printf("Your new balance is: $%.2f%n", totalBalance);
        transactionType(totalBalance);
    }
    
    /**
     * Allows the user to enter a withdrawal amount and updates the total balance
     * @param totalBalance user's current balance
     */
    
    public static void withdrawal(double totalBalance)
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a withdrawal amount: ");
        double amount = scnr.nextDouble();
        
        if(amount > totalBalance)
        {
            System.out.println("Amount exceeds Balance.");
        }
        else
        {
            totalBalance -= amount; //totalBalance = totalBalance - amount
            System.out.printf("Your new balance is $%.2f%n", totalBalance);
        }
        transactionType(totalBalance);
        
    }
    
}
