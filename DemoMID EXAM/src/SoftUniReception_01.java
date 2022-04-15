import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployer = Integer.parseInt(scanner.nextLine());
        int secondEmployer = Integer.parseInt(scanner.nextLine());
        int thirdEmployer = Integer.parseInt(scanner.nextLine());

        int studentscount  = Integer.parseInt(scanner.nextLine());

        int workForOnehour = firstEmployer + secondEmployer +thirdEmployer;
        int hoursNeeded = 0;

        while  ( studentscount > 0 ) {
            studentscount -= workForOnehour;
            hoursNeeded++;

            if(hoursNeeded % 4 ==0) {
                hoursNeeded++;

            }

        }
        System.out.printf("Time needed: %dh.",hoursNeeded);
}
}
