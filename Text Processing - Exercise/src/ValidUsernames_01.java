import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String[] usernames = text.split(", ");

        for (String username : usernames) {
            // ако е валиден го печатаме
            if(isValidUsername(username)){
                System.out.println(username);
            }

        }

    }

    static boolean isValidUsername(String username) {

        if (username.length() < 3 || username.length() > 16) {
return false;
        }
        for (int i = 0; i <= username.length() - 1; i++) {
            char currentSymbol = username.charAt(i);
            if(!Character.isLetterOrDigit(currentSymbol) && currentSymbol != '-'  && currentSymbol != '_') {
return false;
            }
        }
        return  true;
    }
}
