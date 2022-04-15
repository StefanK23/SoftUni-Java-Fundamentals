import java.util.Scanner;

public class PadawanEquipment_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double priceForSingleLightSaber = Double.parseDouble(scanner.nextLine());
        double priceForSingleRobe = Double.parseDouble(scanner.nextLine());
        double priceForSingleBelt = Double.parseDouble(scanner.nextLine());


        double LightSaberPRICE = Math.ceil(studentCount *1.1 )* priceForSingleLightSaber;
        double robePRICE = studentCount* priceForSingleRobe;
        int freeBelts  = studentCount/ 6;
        double beltPrice = (studentCount - freeBelts)* priceForSingleBelt;
        double totalMoney = beltPrice+ LightSaberPRICE+ robePRICE ;
        double neededMoney = totalMoney- budget;

        if(budget >= totalMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalMoney);
        }else   {
            System.out.printf("Ivan Cho will need %.2flv.", neededMoney);
        }



    }
}
