import java.util.Scanner;

public class MidEXAM2_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double journeyPrice = Double.parseDouble(scanner.nextLine());
        int mounts = Integer.parseInt(scanner.nextLine());
        double myMoney= 0 ;
        double percent = journeyPrice * 0.25;

        for (int i = 1; i <= mounts; i++) {
            double bonus = myMoney *0.25;
            if(i % 4 == 0) {
                myMoney+= bonus ;
            }
            if(i % 2 == 1 && i >= 2 ){
                myMoney -= myMoney* 0.16 ;
            }
            myMoney+= percent;

        }
        if(myMoney >= journeyPrice){
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.",myMoney - journeyPrice);
        }else {
            double more = journeyPrice- myMoney;
            System.out.printf("Sorry. You need %.2flv. more.", more);
        }
    }
}
