import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());

        int studentWithMaxBonus = Integer.MIN_VALUE;
        int maxAtt = Integer.MIN_VALUE;



        for (int i = 0; i < studentsCount; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());

            double totalBonus =  Math.ceil((1.0 * attendances / lecturesCount) * (5 + initialBonus));
                if(totalBonus >= studentWithMaxBonus){
                    studentWithMaxBonus = (int) totalBonus;
                    maxAtt = attendances;
                }
        }
        System.out.printf("Max Bonus: %d.%n",studentWithMaxBonus);
        System.out.printf("The student has attended %d lectures.",maxAtt);
    }
}
