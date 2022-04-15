import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maxVolume = Double.MIN_VALUE;

        int countKegs = Integer.parseInt(scanner.nextLine());
        String maxModelKeg = "";
        for (int keg = 1; keg <= countKegs; keg++) {
            String model = scanner.nextLine();
            double raduis = Double.parseDouble(scanner.nextLine());
            int heigh = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(raduis, 2) * heigh;
            if(volume > maxVolume) {
                maxVolume = volume;
                maxModelKeg = model;
            }

        }
        System.out.println(maxModelKeg);

    }
}
