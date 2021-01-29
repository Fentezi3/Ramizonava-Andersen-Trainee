import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String enteredNumbers;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a few numbers: ");
        enteredNumbers = scanner.nextLine();
        int[] numbersArray = Arrays.stream(enteredNumbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Numbers, what multiples of 3: ");
        for (int number : numbersArray) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
        scanner.close();
    }
}
