import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int countSymbols= Integer.parseInt(scanner.nextLine());
            int sum = 0;

        for (int i = 0; i <countSymbols ; i++) {
            char symbols = scanner.nextLine().charAt(0);
            sum+= symbols;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
