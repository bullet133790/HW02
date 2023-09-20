import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of seconds : ");
        int seconds = scanner.nextInt();
        int hours = seconds / 3600;
        int seconds1 = seconds % 3600;
        int minutes = seconds1 / 60 ;
        int seconds2 = seconds1 % 60 ;


        System.out.println(("HH:MM:SS: " +hours+":"+minutes+":"+seconds2));

    }
}
