
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalIncome = 0;


        String regex = "^%(?<name>[A-Z][a-z]+)%([^%.$|]*)<(?<product>\\w+)>[^%.$|]*\\|(?<count>\\d+)\\|[^%.$|]*?(?<price>\\d+(\\.\\d+)*)\\$$";
        String input = scanner.nextLine();


        Pattern pattern = Pattern.compile(regex);


        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()){


              String name = matcher.group("name");
              String product = matcher.group("product");
              double quantity = Double.parseDouble(matcher.group("count"));
              double price = Double.parseDouble(matcher.group("price"));

        System.out.printf("%s: %s - %.2f%n", name, product, price * quantity);
        totalIncome += (quantity * price);

    }
            input = scanner.nextLine();

        }

        System.out.printf("Total income: %.2f",totalIncome);
    }
}
