
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                          .map(Integer::parseInt)
                          .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split("\\s+");
            switch (command[0]){
                case "swap" :
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);
                    int firstElement = numbers.get(index1);
                    int secondElement = numbers.get(index2);
                    numbers.set(index1 , secondElement);
                    numbers.set(index2 , firstElement);
                    break;
                case "multiply":
                    int indexOne = Integer.parseInt(command[1]);
                    int indexTwo = Integer.parseInt(command[2]);

                    numbers.set(indexOne, numbers.get(indexOne) * numbers.get(indexTwo));

                    break;
                case "decrease" :
                    IntStream.range(0,  numbers.size()).forEach(i -> numbers.set(i,numbers.get(i) -1));
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.print(Arrays.toString(new List[]{numbers}).replaceAll("[\\[\\]]", ""));


    }
}
