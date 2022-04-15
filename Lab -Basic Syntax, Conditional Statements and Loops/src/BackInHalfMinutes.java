import java.util.Scanner;

public class BackInHalfMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int sumTime  = hours*60 +(minutes +30);

        hours= sumTime / 60;
        minutes = sumTime % 60;
        if(hours > 23){
            hours-= 24;
        }

        System.out.printf("%d:%02d",hours,minutes);
    }
}
