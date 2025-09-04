import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NumberValidator validator = new NumberValidator();

        Random random = new Random();
        int randomNum = random.nextInt(100);

        int userNum = 0;
        int userTryes = 0;

        System.out.println("===================================");
        System.out.println("========== GUESSING GAME ==========");
        System.out.println("===================================");

        System.out.println();

        while(userNum != randomNum) {
            System.out.print("DIGITE UM NÚMERO ENTRE [1] E [100]: ");
            userNum = scanner.nextInt();

            validator.numberValidator(userNum, randomNum);

            userTryes += userTryes + 1;
        }

        validator.winValidator(userNum, randomNum);

    }
}