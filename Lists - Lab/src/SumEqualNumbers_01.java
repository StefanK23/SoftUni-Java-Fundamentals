import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class SumEqualNumbers_01 {
    public static <list> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Double> items = Arrays.stream(input.split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());


        for (int i = 0; i < items.size() - 1; i++) {

            if (items.get(i).equals(items.get(i + 1))) {
                double sum = items.get(i) + items.get(i + 1);
                items.set(i, sum);
                items.remove(i + 1);
                i = -1;
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (Double item : items) {
            System.out.print(decimalFormat.format(item) + " ");
        }


    }


}

