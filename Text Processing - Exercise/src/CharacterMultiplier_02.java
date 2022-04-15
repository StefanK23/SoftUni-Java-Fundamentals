import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int sum = 0;
        char[] arrOne = input[0].toCharArray();
        char[] arrTwo = input[1].toCharArray();

        for (int i = 0; i < Math.max(arrOne.length, arrTwo.length); i++) {
            if (i < arrOne.length && i < arrTwo.length) {
                sum += arrOne[i] * arrTwo[i];

            } else if (i < arrOne.length && i >= arrTwo.length) {
                sum += arrOne[i];
            } else if (i >= arrOne.length) {
                sum += arrTwo[i];

            }

        }
        System.out.println(sum);

    }
}
