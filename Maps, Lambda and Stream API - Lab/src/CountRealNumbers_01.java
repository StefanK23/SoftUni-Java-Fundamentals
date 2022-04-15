import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     double[] nums =  Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer>  numbers = new TreeMap<>();

        for (double number : nums) {
                if(!numbers.containsKey(number)) {
                    numbers.put(number, 1);
                }else {
                    int occurrence = numbers.get(number);
                    occurrence++;
                    numbers.put(number, occurrence);
                }
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.#######");
        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.printf("%s -> %d%n", decimalFormat.format(entry.getKey()),entry.getValue());
        }
        }
    }


