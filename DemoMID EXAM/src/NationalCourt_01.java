import java.util.Scanner;

public class NationalCourt_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int peopleCount = Integer.parseInt(scanner.nextLine());
        int countHours = 0;

        while (peopleCount > 0) {

            int oneHour = first + second + third;
            peopleCount -= oneHour;
            countHours++;

            if (countHours % 4 == 0) {
                countHours++;
            }

        }
        System.out.printf("Time needed: %dh.", countHours);
    }
}
