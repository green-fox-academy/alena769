import java.util.Scanner;
public class MileToKmConverter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Miles to Kilometers convertor:");
        System.out.println("Write a distance to be converted:");
        double userInput1 = scanner.nextDouble();
        System.out.println(userInput1 * 1.609344);
    }
}
