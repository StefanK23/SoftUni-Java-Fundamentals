import java.util.Scanner;

public class Exam_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededExperience = Double.parseDouble(scanner.nextLine());
        int countOfBattles = Integer.parseInt(scanner.nextLine());
        int battleCount = 0;
        double experienceSum = 0.0;
        boolean IsFinal = false;

        for (int i = 0; i < countOfBattles; i++) {
            double experienceEarned = Double.parseDouble(scanner.nextLine());
            battleCount += 1;
            if (battleCount % 3 == 0 && battleCount % 15 != 0) {
                experienceEarned = experienceEarned + (experienceEarned * 0.15);
            } else if (battleCount % 5 == 0 && battleCount % 15 != 0) {
                experienceEarned = experienceEarned - (experienceEarned * 0.10);
            } else if (battleCount % 15 == 0) {
                experienceEarned = experienceEarned + (experienceEarned + 0.05);
            }
            experienceSum += experienceEarned;
            if (experienceSum >= neededExperience) {
                IsFinal = true;
                break;
            }
        }
        if (IsFinal) {
            System.out.printf("Player successfully collected his needed experience for %d battles.", battleCount);
        } else{
            double result = neededExperience - experienceSum;
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", result);
        }
    }
}



