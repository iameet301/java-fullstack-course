import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Admin login");
        System.out.println("Enter 2 for Student login");
        int input = sc.nextInt();

        switch (input) {
        case 1:
            String username = "admin";
            String password = "admin123";

            System.out.println("Enter username");
            String usernameByUser = sc.next();
            System.out.println("Enter Password");
            String passwordByUser = sc.next();

            if (username.equals(usernameByUser)) {
                if (password.equals(passwordByUser)) {
                    System.out.println("Admin Login success");
                } else {
                    System.err.println("Invalid Password");
                }
            } else {
                System.err.println("Invalid username..");
            }
            break;
            
        case 2:
            String usernamel = "student";
            String passwordl = "student123";

            System.out.println("Enter username");
            String usernameByUser2 = sc.next();
            System.out.println("Enter Password");
            String passwordByUser2 = sc.next();

            if (usernamel.equals(usernameByUser2)) {
                if (passwordl.equals(passwordByUser2)) {
                    System.out.println("Student Login success");
                } else {
                    System.err.println("Invalid Password");
                }
            } else {
                System.err.println("Invalid username..");
            }
            
        }
    }
}
