import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scanner.nextLine();

        while (!input.equals("end ")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command) {
                case "Contains":
                    int number = Integer.parseInt(tokens[1]);
                    if (list.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (tokens[1].equals("even")) {
                        for (int i = 0; i < list.size(); i++) {
                            if (list.get(i) % 2 == 0) {
                                System.out.print(list.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (tokens[1].equals("odd")) {
                        for (int i = 0; i < list.size(); i++) {
                            if (list.get(i) % 2 == 1) {
                                System.out.print(list.get(i) + " ");
                            }
                        }
                    }
                    break;

                case "Get":
                    int sum = 0;
                    if (tokens[1].equals("sum")) {
                        for (int i = 0; i <= list.size() - 1; i++) {
                            sum += list.get(i);

                        }

                    }
                    System.out.println();
                    System.out.println(sum);
                    break;

                case "Filter":
                    String condition = tokens[1];
                    long numbers = Integer.parseInt(tokens[2]);
                    if (condition.equals(">=")) {
                        for (int i = 0; i < list.size(); i++) {
                            if (numbers <= list.get(i)) {

                                System.out.print(list.get(i) + " ");
                            }

                        }
                        System.out.println();
                    } else if (condition.equals("<=")) {
                        for (int i = 0; i < list.size(); i++) {
                            if ((numbers >= list.get(i))) {
                                System.out.print(list.get(i) + " ");

                            }

                        }
                        System.out.println();
                    } else if (condition.equals("<")) {
                        for (int i = 0; i < list.size(); i++) {
                            if ((numbers > list.get(i))) {

                                System.out.print(list.get(i) + " ");
                            }

                        }
                        System.out.println();
                    } else if (condition.equals(">")) {
                        for (int i = 0; i < list.size(); i++) {
                            if ((numbers < list.get(i))) {
                                System.out.print(list.get(i) + " ");
                            }

                        }
                        System.out.println();
                    }
                    break;
            }


            input = scanner.nextLine();
        }
    }
}