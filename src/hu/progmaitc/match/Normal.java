package hu.progmaitc.match;

public class Normal extends Match {

    public Normal(String line) {
        super(line);
    }

   @Override
    public String getWinner() {
        if(getGoals_a() > getGoals_b()){
            return getTeam_a();
        } else if (getGoals_a() < getGoals_b()){
            return getTeam_b();
        } else {
            return "No winner";
        }
    }

    @Override
    public String toString() {
        return "" + year + ";" +
                stage + ";" +
                date + ";" +
                team_a + ";" +
                team_b + ";" +
                goals_a + ";" +
                goals_b;
    }
}
