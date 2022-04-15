import java.util.Scanner;

public class SnowBalls_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int numberOfSnowBalls = Integer.parseInt(scanner.nextLine());

         int MaxSnowBallshow = Integer.MIN_VALUE;
         int MaxSnowBalltime = Integer.MIN_VALUE;
         int MaxSnowBallQuality = Integer.MIN_VALUE;
         double MaxSnowValue = Integer.MIN_VALUE;

        for (int i = 0; i < numberOfSnowBalls ; i++) {

            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());

            double snowValue = Math.pow((snowBallSnow/snowBallTime), snowBallQuality);

            if(snowValue > MaxSnowValue) {
                MaxSnowBallshow = snowBallSnow;
                MaxSnowBalltime = snowBallTime;
                MaxSnowBallQuality = snowBallQuality;
                 MaxSnowValue = snowValue;


            }

        }
        System.out.printf("%d : %d = %.0f (%d)",MaxSnowBallshow, MaxSnowBalltime , MaxSnowValue, MaxSnowBallQuality);

    }
}
