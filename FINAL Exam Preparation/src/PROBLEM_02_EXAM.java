import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PROBLEM_02_EXAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int inputCount = Integer.parseInt(scanner.nextLine());

         String usernameRegex = "[U$]+(?<username>[A-Z][a-z]{2,})[U$]+[P@$]+(?<password>[A-Za-z]{5,}[0-9]+)[P@$]+";

        Pattern patternUsername = Pattern.compile(usernameRegex);
           int count = 0;


        for (int i = 0; i < inputCount ; i++) {
            String userNames = scanner.nextLine();
            Matcher matcher = patternUsername.matcher(userNames);
            if (matcher.find()){
                count++;
                String groupUsername = matcher.group("username");
                String groupPassword = matcher.group("password");

                System.out.println("Registration was successful");
                System.out.println("Username: " + groupUsername +", " + "Password: " + groupPassword);

            }else {
                System.out.println("Invalid username or password");
            }

        }
        System.out.println("Successful registrations: " + count);
    }
}
