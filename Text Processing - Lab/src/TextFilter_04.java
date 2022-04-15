import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] forbiddenWords = scanner.nextLine().split(", ");
        String input = scanner.nextLine();

        for (String forbiddenWord : forbiddenWords) {
            if (input.contains(forbiddenWord)) {
             String wordOfStars = convertWordToSTar(forbiddenWord);
             input = input.replace(forbiddenWord , wordOfStars);
            }
        }
        System.out.println(input);

    }

    private static String convertWordToSTar(String forbiddenWord) {
        StringBuilder wordOFStars= new StringBuilder();

        wordOFStars.append("*".repeat(forbiddenWord.length()));
        return wordOFStars.toString();
    }
}
