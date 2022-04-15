import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

          priceProduct(product, quantity);


    }

    private static void priceProduct(String product, int quantity) {
        double sum = 0;
        if(product.equals("coffee")){
            sum = quantity*1.50;
        }else if(product.equals("water")){
            sum= quantity* 1.00;
        }else if(product.equals("coke")){
            sum= quantity* 1.40;
        }else if(product.equals("snacks")){
            sum= quantity* 2.00;
        }
        System.out.printf("%.2f", sum);

    }
}
