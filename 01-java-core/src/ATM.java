import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Menu driven ATM\n");
            System.out.println("1. balance");
            System.out.println("2. withdraw");
            System.out.println("3. deposit");
            System.out.println("4. exit...\n");
            
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Please collect your cash. Current balance: " + balance);
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposit successful. Current balance: " + balance);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("---------------------------");
        }
  
    }
}
