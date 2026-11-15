import java.util.Scanner;
public class prexe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temprature in celcius: ");
        double temp = scanner.nextDouble();
        if (temp<10){
            System.out.println("wear a coat");
        }
        else if (temp>=10 && temp<=20){
            System.out.println("light jacket recommended");
        }
        else if (temp>20 && temp<=30){
            System.out.println("t-shirt weather");
        }
        else{
            System.out.println("stay indoors!");
        }
        scanner.close();
    }
}