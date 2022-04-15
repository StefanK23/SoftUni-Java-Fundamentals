
import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        int counter = 0;
        while (!command.equals("End")) {
            int indexTarget = Integer.parseInt(command);
            if (indexTarget >= 0 && indexTarget < targets.length) {
                for (int i = 0; i < targets.length; i++) {
                    int temp = targets[indexTarget];
                    if (targets[i] != -1 && i != indexTarget) {
                        if (targets[i] > temp) {
                            targets[i] -= temp;
                        } else if (targets[i] <= temp) {
                            targets[i] += temp;
                        }
                    }
                }
                targets[indexTarget] = -1;
                counter++;
            }


            command = scanner.nextLine();


        }
        System.out.printf("Shot targets: %d -> " , counter ) ;
        for (int target : targets) {
            System.out.print( target + " ");
        }
    }
}
