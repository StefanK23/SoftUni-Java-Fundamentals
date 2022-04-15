import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

double totalPrice = 0;
double taxes = 0;
double priceWithoutTaxes = 0;
double sum =0;

String command = scanner.nextLine();

while (!command.equals("regular") && (!command.equals("special"))){
    double prices = Double.parseDouble(command);

    if(prices < 0) {
        System.out.println("Invalid price!");
    }else {
        totalPrice+= prices;
        sum = totalPrice * 1.2;
        taxes =  sum - totalPrice;
        priceWithoutTaxes = sum - taxes;

    }


    command= scanner.nextLine();
}
        if(sum == 0){
            System.out.println("Invalid order!");
        }else if(command.equals("special")){
            sum*= 0.9;
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n",taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$",sum);
        }else if(command.equals("regular")){
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n",taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$",sum);
        }
}



    }

