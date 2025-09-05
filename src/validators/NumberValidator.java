package validators;

public class NumberValidator {

    public static void validate(int number, int random) {
        if (number <= random) {
            System.out.println("Higher!");
        }
        else {
            System.out.println("Lower!");
        }
    }

}
