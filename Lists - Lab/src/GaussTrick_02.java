import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> items = Arrays.stream(scanner.nextLine().split("\\s+"))
                          .map(Integer::parseInt)
                          .collect(Collectors.toList());

        for (int i = 0; i <  items.size()  ; i++) {
            if( i == items.size() -1 ){
                break;
            }
            items.set(i, items.get(i) + items.get(items.size()- 1));
            items.remove(items.size() -1 );


        }
        for (Integer item : items) {
            System.out.print(item + " ");
        }
    }
}
