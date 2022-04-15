import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Delete":
                    int element = Integer.parseInt(command[1]);
                    numbers.removeAll(Arrays.asList(element));
                    break;
                case "Insert":
                    int insertElement = Integer.parseInt(command[1]);
                    int insertIndex = Integer.parseInt(command[2]);
                    numbers.add(insertIndex, insertElement);
                    break;


            }


            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
