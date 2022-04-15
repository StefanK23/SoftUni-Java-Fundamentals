import java.util.Arrays;
import java.util.Scanner;

public class Exam_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] items = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        int sumLeft = 0;    //if both sums are equal, print left
        int sumRight = 0;
        switch (type) {
            case "cheap":
                for (int i = 0; i < entryPoint; i++) { //breaking left, start from the entry point to account for shifting
                    if (items[i] < items[entryPoint]) {
                        sumLeft += items[i];
                    }
                }

                for (int i = entryPoint + 1; i < items.length; i++) { //breaking right
                    if (items[i] < items[entryPoint]) {
                        sumRight += items[i];
                    }
                }

                break;
            case "expensive":
                for (int i = 0; i < entryPoint; i++) { //breaking left, start from the entry point to account for shifting
                    if (items[i] >= items[entryPoint]) {
                        sumLeft += items[i];
                    }
                }

                for (int i = entryPoint + 1; i < items.length; i++) { //breaking right
                    if (items[i] >= items[entryPoint]) {
                        sumRight += items[i];
                    }
                }
        }

        if (sumLeft > sumRight) {
            System.out.printf("Left - %d", sumLeft);
        } else if (sumRight > sumLeft) {
            System.out.printf("Right - %d", sumRight);
        } else { //if equal, print left
            System.out.printf("Left - %d", sumLeft);
        }


    }
}

