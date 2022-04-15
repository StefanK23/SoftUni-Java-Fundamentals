import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String numberRegex = "\\d";
        String emojiRegex = "(?<separator>[\\\\*:])\\1(?<emoji>[A-Z][a-z]{2,})\\1\\1";

        Pattern numberPattern = Pattern.compile(numberRegex);
        Matcher numberMatcher = numberPattern.matcher(input);

        List<Integer> numbersList = new ArrayList<>();
        while (numberMatcher.find()) {
            int number = Integer.parseInt(numberMatcher.group());
            numbersList.add(number);
        }
        long coolness = numbersList.stream().reduce(1, (a, b) -> a * b);
        System.out.printf("Cool threshold: %d%n", coolness);


        Pattern emojiPattern = Pattern.compile(emojiRegex);
        Matcher emojiMatcher = emojiPattern.matcher(input);

        List<String> CoolEmojis = new ArrayList<>();
        int countOfEmojis = 0;

        while (emojiMatcher.find()) {
            countOfEmojis++;
            String separator = emojiMatcher.group("separator");
            String emojiText = emojiMatcher.group("emoji");
            if (isEmojiCool(emojiText, coolness)) {
                String fullEmoji = separator + separator + emojiText + separator + separator;
                CoolEmojis.add(fullEmoji);
            }

        }
        System.out.printf("%d emojis found in the text. The cool ones are:", countOfEmojis);
        System.out.println();
        CoolEmojis.stream().forEach(System.out::println);
    }

    public static boolean isEmojiCool(String emojiText, long coolnessThreshold) {
        int emojiCoolness = 0;
        for (int i = 0; i < emojiText.length(); i++) {
            char emojichar = emojiText.charAt(i);
            emojiCoolness += emojichar;
        }
        boolean isCool = emojiCoolness >= coolnessThreshold;
        return isCool;
    }
}

