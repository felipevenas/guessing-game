import services.StatisticsService;
import validators.NumberValidator;
import validators.WinValidator;
import services.PrintBannerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        int randomNum = random.nextInt(100) + 1;
        int userNum = 0;

        PrintBannerService.printWelcomeBanner();

        while(userNum != randomNum) {
            System.out.print("Insert a number between 1 a 100: ");
            userNum = scanner.nextInt();
            numbers.add(userNum);
            NumberValidator.validate(userNum, randomNum);
            System.out.println();
        }

        WinValidator.validateWin(userNum, randomNum);
        System.out.println();
        StatisticsService.printStatistics(numbers);
        scanner.close();
    }
}