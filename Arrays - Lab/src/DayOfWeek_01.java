import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daysOfWeek = {
                "Monday", "Tuesday", "Wednesday", "Thursday" ,
                "Friday" , "Saturday" , "Sunday"
        }      ;
        int days = Integer.parseInt(scanner.nextLine());
        if(days >= 1  && days <= 7){
            System.out.println(daysOfWeek[days -1]);


        }else

        System.out.println("Invalid day!");
    }
}
