
import java.util.Scanner;

public class ReverseStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();



        while (!word.equals("end")){
            StringBuilder reverse = new StringBuilder();
            for (int index = word.length() -1; index >= 0 ; index--) {
                reverse.append(word.charAt(index));
            }

            System.out.printf("%s = %s%n", word, reverse);
            word = scanner.nextLine();

        }

    }
}


