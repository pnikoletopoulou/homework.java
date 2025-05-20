package homework_02;

public class Game {
    private String home_team;
    private String away_team;
    private int score_home;
    private int score_away;

    public Game(String home_team, String away_team, int score_home, int score_away) {
        this.home_team = home_team;
        this.away_team = away_team;
        this.score_home = score_home;
        this.score_away = score_away;
    }

    public String getHome_team() {
        return home_team;
    }

    public String getAway_team() {
        return away_team;
    }

    public int getScore_home() {
        return score_home;
    }

    public int getScore_away() {
        return score_away;
    }
}
