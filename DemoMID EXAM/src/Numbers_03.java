import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> TopInts = new ArrayList<>();


        int sum = 0;
        int count = 0;
        for (Integer number : numbers) {
            sum += number;
            count++;
        }
        double average = 1.0 * sum / count;
        numbers.sort(Collections.reverseOrder());

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > average) {
                TopInts.add(numbers.get(i));
            }
            if (TopInts.size() <= 0) {
                System.out.println("No");
                return;
            }
        }
        int stop = 0;
        for (Integer num : TopInts) {
            if (num > average) {
                System.out.print(num + " ");
                stop++;
                if (stop == 5) {
                    break;
                }
            }
        }


    }
}

