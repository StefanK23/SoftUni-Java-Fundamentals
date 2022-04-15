import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            int number= numbers.get(i);
            if (number < 0) {
                numbers.remove(i);
                i--;

            }
        }
        Collections.reverse(numbers);

        if(numbers.isEmpty()){
            System.out.println("empty");
        }else {
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}

