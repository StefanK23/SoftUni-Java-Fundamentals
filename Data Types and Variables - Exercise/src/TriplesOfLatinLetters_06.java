import java.util.Scanner;

public class TriplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int symbol1 = 'a'; symbol1 < 'a' + n; symbol1++) {
            for (int symbol2 = 'a'; symbol2 < 'a' + n; symbol2++) {
                for (int symbol3 = 'a'; symbol3 < 'a' + n; symbol3++) {
                    System.out.printf("%c%c%c%n", symbol1, symbol2, symbol3);
                }
            }
        }
    }
}