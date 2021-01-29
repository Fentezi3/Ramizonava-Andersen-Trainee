import java.util.Scanner;

public class Main {
    public static final int FINISH_WORK = 2;

    public static void main(String[] args) {
        int enteredNumber;
        int check = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter number > 7");
            enteredNumber = scanner.nextInt();
            if (enteredNumber <= 7) {
                System.out.println("Try again");
            } else {
                System.out.println("Привет");
                check = FINISH_WORK;
            }
        } while (check != FINISH_WORK);
        scanner.close();
    }
}
