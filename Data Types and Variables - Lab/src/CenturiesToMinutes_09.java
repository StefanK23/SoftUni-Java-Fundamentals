import java.util.Scanner;

public class CenturiesToMinutes_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());
        int years = centuries * 100;
        int days = (int)(365.2422 * years) ;
        int hours = 24 * days ;
        int minutes = 60 * hours;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",centuries,years,days,hours,minutes);
    }
}
