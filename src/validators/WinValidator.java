package validators;

import java.util.Objects;

public class WinValidator {

    public static void validateWin(int number, int random) {
        if (Objects.equals(number, random)) {
            System.out.println("Congratulations, you win!");
        }
    }

}
