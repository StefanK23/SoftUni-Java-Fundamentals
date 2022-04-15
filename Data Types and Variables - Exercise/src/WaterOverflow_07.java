import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int waterTank = 255;
       int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            int pouringLiters = Integer.parseInt(scanner.nextLine());
            waterTank -= pouringLiters;

            if(waterTank < 0 ){
                System.out.println("Insufficient capacity!");
                waterTank += pouringLiters;
            }


        }
        System.out.println(255 - waterTank);

    }
}
