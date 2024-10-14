import java.util.Random;
import java.util.Scanner;

public class DieRollar {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                boolean continueRolling = true;

                while (continueRolling) {
                    int rollCount = 0;
                    System.out.printf("%-5s %-5s %-5s %-5s %-5s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
                    System.out.println("----------------------------------------------------------");

                    while (true) {
                        rollCount++;
                        int die1 = random.nextInt(6) + 1;
                        int die2 = random.nextInt(6) + 1;
                        int die3 = random.nextInt(6) + 1;
                        int sum = die1 + die2 + die3;

                        System.out.printf("%-5d %-5d %-5d %-5d %-5d%n", rollCount, die1, die2, die3, sum);

                        // Check for a triple
                        if (die1 == die2 && die2 == die3) {
                            break;
                        }
                    }

                    System.out.print("Do you want to roll the die again? (yes/no): ");
                    String response = scanner.next();
                    if (!response.equalsIgnoreCase("yes")) {
                        continueRolling = false;
                    }
                }

                scanner.close();
            }
        }
