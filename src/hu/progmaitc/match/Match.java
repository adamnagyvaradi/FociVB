package hu.progmaitc.match;

public class Match {
    public int year;
    public String stage;
    public String date;
    public String team_a;
    public String team_b;
    public int goals_a;
    public int goals_b;

    public Match(){}

    public Match(int year, String stage, String date, String team_a, String team_b, int goals_a, int goals_b) {
        this.year = year;
        this.stage = stage;
        this.date = date;
        this.team_a = team_a;
        this.team_b = team_b;
        this.goals_a = goals_a;
        this.goals_b = goals_b;
    }

    public Match(String line){
        String[] data = line.split(";");
        this.year = Integer.parseInt(data[0]);
        this.stage = data[1];
        this.date = data[2];
        this.team_a = data[3];
        this.team_b = data[4];
        this.goals_a = Integer.parseInt(data[5]);
        this.goals_b = Integer.parseInt(data[6]);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeam_a() {
        return team_a;
    }

    public void setTeam_a(String team_a) {
        this.team_a = team_a;
    }

    public String getTeam_b() {
        return team_b;
    }

    public void setTeam_b(String team_b) {
        this.team_b = team_b;
    }

    public int getGoals_a() {
        return goals_a;
    }

    public void setGoals_a(int goals_a) {
        this.goals_a = goals_a;
    }

    public int getGoals_b() {
        return goals_b;
    }

    public void setGoals_b(int goals_b) {
        this.goals_b = goals_b;
    }

    public String getWinner(){
        return "no winner";
    }

}
