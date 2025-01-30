import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int balance = 100000; 
        int pin = 5757;     
        System.out.print("Enter PIN: ");
        int enteredPin = scanner.nextInt();
        if (enteredPin == pin) {
            int option;
            do {
                System.out.println("\nATM Menu:");
                System.out.println("1. Balance Enquiry");
                System.out.println("2. Cash Withdrawal");
                System.out.println("3. Show transaction list");
                System.out.println("4. Exit");
                System.out.print("Select option: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Balance: $" + balance);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        int withdraw = scanner.nextInt();
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Withdrawal successful! New balance: $" + balance);
                        } else {
                            System.out.println("Insufficient funds.");
                        }
                        break;
                    case 3:
                        System.out.print("enter account no: ");
                        pin = scanner.nextInt();
                        System.out.println("show balances.");
                        break;
                    case 4:
                        System.out.println("Thankyou!");
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            } while (option != 4);
        } else {
            System.out.println("Incorrect PIN.");
        }

        scanner.close();
    }
}
