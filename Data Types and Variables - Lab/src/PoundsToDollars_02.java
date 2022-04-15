import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        double dollars= number * 1.31;
        System.out.printf("%.3f", dollars);
    }
}
