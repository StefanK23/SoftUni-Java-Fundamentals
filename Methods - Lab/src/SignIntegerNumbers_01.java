import java.util.Scanner;

public class SignIntegerNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        checkNumber(number);
    }

    private static void checkNumber( int digit   ) {
        if (digit    > 0) {
            System.out.printf("The number %d is positive.",digit   );
        }else if (digit    < 0) {
            System.out.printf("The number %d is negative." , digit   );
        }else {
            System.out.printf("The number %s is zero.",digit   );
        }
    }
}














