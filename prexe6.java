import java.util.Scanner;
public class prexe6 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter maths score: ");
        int number = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter physics score: ");
        int number2 = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter chemistry score: ");
        int number3 = scanner3.nextInt();
        if(number>=40 && number2>=40 && number3>=40){
            System.out.println("You have passed the exam");
        }
        else{
            System.out.println("You have failed the exam");
        }
        System.out.println("Your net percentage is : " + (number + number2 + number3)/3 + "%");
        scanner1.close();
        scanner2.close();
        scanner3.close();
    }
}