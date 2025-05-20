package homework_02;

import java.util.Scanner;

public class GameMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameResults gameResults = new GameResults();
        int choice;

        do {
            System.out.println("1. Add Game.");
            System.out.println("2. Team Performance.");
            System.out.println("0. Exit.");
            System.out.println("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the home team: ");
                    String home_team = scanner.next();

                    System.out.println("Enter the name of the away team: ");
                    String away_team = scanner.next();

                    System.out.println("Enter the score of the home team: ");
                    int home_score = scanner.nextInt();

                    System.out.println("Enter the score of the away team: ");
                    int away_score = scanner.nextInt();

                    gameResults.addGame(home_team, away_team, home_score, away_score);
                    break;

                case 2:

                    System.out.println("Enter the name of a team: ");
                    String team_name = scanner.next();
                    gameResults.showResults(team_name);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;

            }
        } while (choice!= 0);
    }
}
