import java.util.Scanner;
public class Day1 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Hii .. Enter your Name: ");
        String user = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age =scanner.nextInt();
        System.out.print("How many years in the future: ");
        int yearFuture = scanner.nextInt();
        int futureAge = age + yearFuture;
        System.out.println("Hello" + user + "! In " + yearFuture + " years, you'll be: " + futureAge );
        scanner.close();
    }
}
