import java.util.LinkedHashMap;
        import java.util.Map;
        import java.util.Scanner;

public class NeedForSpeed_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carNumber = Integer.parseInt(scanner.nextLine());

        Map<String, int[]> cars = new LinkedHashMap<>();
        for (int i = 0; i < carNumber; i++) {
            String[] carInfo = scanner.nextLine().split("\\|");
            cars.put(carInfo[0], new int[2]);
            cars.get(carInfo[0])[0] += Integer.parseInt(carInfo[1]);
            cars.get(carInfo[0])[1] += Integer.parseInt(carInfo[2]);
        }
        String command;
        while (!"Stop".equals(command = scanner.nextLine())) {
            String[] type = command.split(" : ");
            String model = type[1];
            int number = Integer.parseInt(type[2]);
            switch (type[0]) {
                case "Drive":
                    int fuel = Integer.parseInt(type[3]);
                    if (cars.get(model)[1] < fuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        System.out.println(model + " driven for " + number + " kilometers. " + fuel + " liters of fuel consumed.");
                        cars.get(model)[0] += number;
                        cars.get(model)[1] -= fuel;
                        if (cars.get(model)[0] >= 100000) {
                            System.out.println("Time to sell the " + model + "!");
                            cars.remove(model);
                        }
                    }
                    break;
                case "Refuel":
                    int before = cars.get(model)[1];
                    if (before + number > 75) {
                        cars.get(model)[1] = 75;
                        number = 75 - before;
                    } else {
                        cars.get(model)[1] += number;
                    }
                    System.out.println(model + " refueled with " + number + " liters");
                    break;
                case "Revert":
                    int beforeKm = cars.get(model)[0];
                    if (beforeKm - number < 10000) {
                        cars.get(model)[0] = 10000;
                        break;
                    } else {
                        cars.get(model)[0] -= number;
                        System.out.println(model + " mileage decreased by " + number + " kilometers");
                    }
                    break;
            }
        }
        cars.entrySet().stream().sorted((a, b) -> {
            int result = Integer.compare(b.getValue()[0], a.getValue()[0]);
            if (result == 0) {
                result = a.getKey().compareTo(b.getKey());
            }
            return result;
        }).forEach(e -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                e.getKey(), e.getValue()[0], e.getValue()[1]));
    }
}
