import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int odd = 0;

        for (int i = 0; odd < n; i ++) {
            if (i % 2 > 0) {
                odd += 1;
                sum += i;
                System.out.println(i);

            }
        }
        System.out.printf("Sum: %d", sum);

    }
}
