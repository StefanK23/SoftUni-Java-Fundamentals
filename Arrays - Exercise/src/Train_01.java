import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagons = Integer.parseInt(scanner.nextLine());
        int [] peopleInWagons = new int[countWagons];
        for (int i = 0; i < countWagons ; i++) {
            peopleInWagons[i]= Integer.parseInt(scanner.nextLine());
        }
        int sum = 0;
        for (int people  : peopleInWagons) {
            System.out.print(people + " ");
            sum = sum + people;
        }
        System.out.println();
        System.out.println(sum );

    }
}
