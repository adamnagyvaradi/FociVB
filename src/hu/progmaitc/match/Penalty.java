package hu.progmaitc.match;

public class Penalty extends Match{
    public int penalties_a;
    public int penalties_b;

    public Penalty(String line) {
        String[] data = line.split(";");
        this.year = Integer.parseInt(data[0]);
        this.stage = data[1];
        this.date = data[2];
        this.team_a = data[3];
        this.team_b = data[4];
        this.goals_a = Integer.parseInt(data[5]);
        this.goals_b = Integer.parseInt(data[6]);
        this.penalties_a = Integer.parseInt(data[7]);
        this.penalties_b = Integer.parseInt(data[8]);
    }

    public int getPenalties_a() {
        return penalties_a;
    }

    public void setPenalties_a(int penalties_a) {
        this.penalties_a = penalties_a;
    }

    public int getPenalties_b() {
        return penalties_b;
    }

    public void setPenalties_b(int penalties_b) {
        this.penalties_b = penalties_b;
    }

    @Override
    public String getWinner() {
        if (getPenalties_a() > getPenalties_b()){
            return getTeam_a();
        } else {
            return getTeam_b();
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
                goals_b + ";" +
                penalties_a + ";" +
                penalties_b;
    }
}
