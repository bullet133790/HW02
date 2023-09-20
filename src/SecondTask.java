import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your height (m)");
        double height = scanner.nextDouble();
        System.out.println("what is your weight (kg)");
        double weight = scanner.nextDouble();



        double Bmi  = weight / (height * height);
        System.out.println("Your Bmi is : " + Bmi );



    }

}
