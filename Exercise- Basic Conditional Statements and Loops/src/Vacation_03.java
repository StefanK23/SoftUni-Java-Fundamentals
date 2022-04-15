import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int personCount = Integer.parseInt(scanner.nextLine());
        String typeOfPersons = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0.0;
        double sum = 0.0;


        switch (typeOfPersons) {
            case "Students":
                if (dayOfWeek.equals("Friday")) {
                    price += 8.45;
                    sum = price * personCount;
                    if (personCount >= 30) {
                        sum *= 0.85;
                    }
                } else if (dayOfWeek.equals("Saturday")) {
                    price += 9.80;
                    sum = price * personCount;
                    if (personCount >= 30) {
                        sum *= 0.85;
                    }
                } else if (dayOfWeek.equals("Sunday")) {
                    price += 10.46;
                    sum = price * personCount;
                    if (personCount >= 30) {
                        sum *= 0.85;
                    }

                }
                break;
            case "Business":
                if (dayOfWeek.equals("Friday")) {
                    price += 10.90;
                } else if (dayOfWeek.equals("Saturday")) {
                    price += 15.60;
                }else if(dayOfWeek.equals("Sunday")){
                    price += 16;
                }
                sum = price * personCount;
                if(personCount >= 100) {
                    sum = price* (personCount - 10);
                }
                break;
            case "Regular" :
                if(dayOfWeek.equals("Friday")){
                    price += 15;
                }else if(dayOfWeek.equals("Saturday")){
                    price += 20;
                }else   if(dayOfWeek.equals("Sunday")){
                    price  += 22.50;
                }
                sum = price * personCount;
                if(personCount >= 10 && personCount <= 20) {
                    sum *= 0.95;
                }
                break;



        }
        System.out.printf("Total price: %.2f",sum);


    }
}
