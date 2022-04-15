import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int power = Integer.parseInt(scanner.nextLine());
         int distance = Integer.parseInt(scanner.nextLine());
         int exhaustedFactor = Integer.parseInt(scanner.nextLine());
        int countPokedTargets = 0;
        double half = power /2.0;
          while (power >= distance) {
              power = power - distance;
              countPokedTargets++;

              if(power == half){
                  if(exhaustedFactor >0){
                      power /= exhaustedFactor;
                  }


              }
          }
        System.out.println(power);
        System.out.println(countPokedTargets);
    }
}
