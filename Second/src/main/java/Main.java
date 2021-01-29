import java.util.Scanner;

public class Main {
    public static final int FINISH_WORK = 3;

    public static void main(String[] args) {
        String enteredName;
        String referenceName = "Вячеслав";
        int check = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter name: ");
            enteredName = scanner.next();
            if (!enteredName.equals(referenceName)) {
                System.out.println("Нет такого имени");
            } else {
                System.out.println("Привет, " + enteredName);
                check = FINISH_WORK;
            }
        } while (check != FINISH_WORK);
        scanner.close();
    }
}
