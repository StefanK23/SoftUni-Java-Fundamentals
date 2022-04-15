import java.util.Arrays;
import java.util.Scanner;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

          int waitingPeople = Integer.parseInt(scanner.nextLine());

       int []  wagons  =  Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

       int peopleOnTheCurrentWagon = 0;
       int peopleOnTheLift= 0;
       boolean noMorePeople = false;

        for (int i = 0; i < wagons.length ; i++) {
            while (wagons[i] < 4){
                wagons[i]++;
                peopleOnTheCurrentWagon++;
                if(peopleOnTheLift + peopleOnTheCurrentWagon == waitingPeople){
                    noMorePeople = true;
                    break;
                }
            }
            peopleOnTheLift+=peopleOnTheCurrentWagon;
            if(noMorePeople){
                break;
            }
            peopleOnTheCurrentWagon = 0;
        }
        if(waitingPeople > peopleOnTheLift) {
            System.out.printf("There isn't enough space! %d people in a queue!", waitingPeople - peopleOnTheLift);
            System.out.println(Arrays.toString(wagons) + " ");
        }else if( waitingPeople < 0 && peopleOnTheLift > waitingPeople) {
            System.out.printf("the lift has empty spots!");
        }
    }
}
