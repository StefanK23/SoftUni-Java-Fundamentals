import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        String result = appendString( input,count);
        System.out.println(result);
    }

    private static String appendString(String input, int count) {
        StringBuilder repeatedString = new StringBuilder("");
        for (int i = 0; i < count; i++) {
            repeatedString.append(input);
        }

        return repeatedString.toString();
    }
}

