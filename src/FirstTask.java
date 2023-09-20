import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what the height of the rectangle?");
        double height = scanner.nextDouble();
        System.out.println("what the wight of the rectangle?");
        double wight = scanner.nextDouble();

        double area = height * wight;
        System.out.println("Area of a rectangle is "  + area);


        double perimeter = 2 * (height + wight);
        System.out.println("Perimeter of a rectangle is " + perimeter);








    }
}
