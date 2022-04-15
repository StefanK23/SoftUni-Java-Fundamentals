import java.util.Scanner;

public class MoreExerciseDecryptingMessages_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());

        String sumMessega = "";

        for (int i = 0; i <lines ; i++) {
            char input = scanner.nextLine().charAt(0);
            int value = input + key;

            char message = (char)value;
            sumMessega += message;
        }
        System.out.println(sumMessega);
    }
}
