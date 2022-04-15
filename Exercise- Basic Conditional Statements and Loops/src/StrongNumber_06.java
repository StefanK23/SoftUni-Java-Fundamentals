import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startnumber = number;
        int sumFact = 0;
        while (number != 0) {
            //1.Взимаме последната цифра
            int digit = number % 10;
            //2.Намираме факториела -> 5*4*3*2*1
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;

            }
            //3.Сумираме
            sumFact+= fact;

            //4.Премахваме последната цифра от числото.
            number /= 10;
        }
        if(sumFact == startnumber){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
