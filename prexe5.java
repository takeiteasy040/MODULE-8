import java.util.Scanner;
public class prexe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks scored: ");
        double marks = scanner.nextDouble();
        if(marks<0 || marks>100){
            System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
        }
        else{
            if (marks>=90){
                System.out.println("Grade A");
            }
            else if (marks>=75 && marks<90){
                System.out.println("Grade B");
            }
            else if (marks>=50 && marks<75){
                System.out.println("Grade C");
            }
            else{
                System.out.println("Grade D");
            }
        }
        scanner.close();
    }
}