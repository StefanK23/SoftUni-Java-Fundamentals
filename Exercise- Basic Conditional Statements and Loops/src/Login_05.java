import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() -1; i >= 0 ; i--) {
            char currentSymbol = username.charAt(i);
            password += currentSymbol;
        }

        String command = scanner.nextLine();
        int count = 0;
        while (!command.equals(password)) {

            count++;
            if(count == 4 ){
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            command= scanner.nextLine();
        }
        if(command.equals(password)){
            System.out.printf("User %s logged in.", username);
        }




    }
}
