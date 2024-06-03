package ATMProject;

import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 5644;;

    public void checkPin() {
        System.out.println("Enter your PIN: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.println("Enter a Valid PIN");
            checkPin();
        }
    }

    public void menu() {
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        // Here input will be taken and the code will run according to the input as an integer
     
        int option = sc.nextInt();

        // If user clicks 1, then call the checkBalance function, likewise the rest of the conditions
   
        if (option == 1) {
            checkBalance();
        } else if (option == 2) {
            withDrawMoney();
        } else if (option == 3) {
            depositMoney();
        } else if (option == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice");

        }
    }

    public void checkBalance() {
        System.out.println("Your Balance is: " + Balance);
        // We will call the menu function again as the user can choose other options after balance check
        menu();
    }

    public void withDrawMoney() {
        // If the balance of the user is less than the withdrawn money then we will print insufficient funds, and if the balance is equal to greater than withdrawal money then money will be withdrawn and the ntered amount will be subtracted from the balance
 

        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat(); // Entered amount will be stored in amount variable

        if(amount > Balance) {
            System.out.println("Insufficient funds");
        } else {
            Balance = Balance - amount;
            System.out.println("Money withdrawn successfully");
        }
        menu(); //calling menu function again since user may use other options as well
    }

    public void depositMoney() {

        // The entered amount will be taken in the amount variable and will be added into the Balance property of our ATM class
         
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money deposited successfully");
        menu();
    }
}

public class Main {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkPin();

    }
}