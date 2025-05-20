package homework_02;

import java.util.ArrayList;

public class GameResults {
    private ArrayList<Game> games;

    public GameResults() {
        games = new ArrayList<>();
    }

    public void addGame(String home_team, String away_team, int score_home, int score_away) {
        Game game = new Game(home_team, away_team, score_home, score_away);
        games.add(game);
    }

    public void showResults(String team_name) {
        int wins = 0;
        int losses = 0;
        int draws = 0;

        for (Game game : games) {
            if (team_name.equalsIgnoreCase(game.getHome_team())) {
                if (game.getScore_home() > game.getScore_away()) {
                    wins++;
                } else if (game.getScore_home() < game.getScore_away()) {
                    losses++;
                } else {
                    draws++;
                }
            } else if (team_name.equalsIgnoreCase(game.getAway_team())) {
                if (game.getScore_away() > game.getScore_home()) {
                    wins++;
                } else if (game.getScore_away() < game.getScore_home()) {
                    losses++;
                } else {
                    draws++;
                }
            }
        }
        System.out.println("Performance for " + team_name + ":");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
    }
}
