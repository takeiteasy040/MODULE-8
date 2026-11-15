import java.util.Scanner;
public class prexe3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner2.nextLine();
        if (username.equals("admin") && password.equals("password123")) {
            System.out.println("Login successful!");
        } 
        else {
            System.out.println("Incorrect credentials. Please try again.");
        }
        scanner1.close();
        scanner2.close();
    }
}