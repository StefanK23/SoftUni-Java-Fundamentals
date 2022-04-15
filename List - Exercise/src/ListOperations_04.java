import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] command = input.split("\\s+");
            if (command[0].equals("Add")) {
                int num = Integer.parseInt(command[1]);
                numbers.add(num);
            }
            if (command[0].equals("Insert")) {
                int insertNum = Integer.parseInt(command[1]);
                int insertIndex = Integer.parseInt(command[2]);
                if (isValidIndex(insertIndex, numbers.size())) {
                    numbers.add(insertIndex, insertNum);
                } else {
                    System.out.println("Invalid Index");
                }


            }
            if (command[0].equals("Remove")) {
                int removeIndex = Integer.parseInt(command[1]);
                if (isValidIndex(removeIndex, numbers.size())) {
                    numbers.remove(removeIndex);
                } else {
                    System.out.println("Invalid index");
                }


            }


            if (command[0].equals("Shift")) {
                String side = command[1];
                int countTimes = Integer.parseInt(command[2]);
                if (side.equals("left")) {
                    for (int i = 1; i <= countTimes; i++) {
                        int firstNumber = numbers.get(0);
                        numbers.remove(0);
                        numbers.add(firstNumber);
                    }


                } else if (side.equals("right")) {
                    for (int i = 1; i <= countTimes; i++) {
                        int lastNumber = numbers.get(numbers.size() - 1);
                        numbers.remove(numbers.size() - 1);
                        numbers.add(0, lastNumber);
                    }

                }
            }


            input = scanner.nextLine();

        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }


    }

    private static boolean isValidIndex(int insertIndex, int size) {
        return insertIndex >= 0 && insertIndex <= size ;
    }
}
