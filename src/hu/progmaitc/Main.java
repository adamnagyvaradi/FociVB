package hu.progmaitc;

import hu.progmaitc.match.Match;
import hu.progmaitc.match.Normal;
import hu.progmaitc.match.Penalty;

import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        try {
            List<Match> matches = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Prometheus\\IdeaProjects\\WorldCup\\matches_all.csv"))) {
                String line;
                line = reader.readLine();

                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(";");

                    if (data.length > 7) {
                        Penalty penalty = new Penalty(line);
                        matches.add(penalty);
                    } else {
                        Normal normal = new Normal(line);
                        matches.add(normal);
                    }

                }
                System.out.println("Number of matches: " + matches.size());

                Scanner scanner = new Scanner(System.in);
                int userInput;
                do {
                    System.out.println("Year of world cup");
                    userInput = scanner.nextInt();
                    scanner.nextLine();
                } while (userInput != 2010 && userInput != 2014 && userInput != 2018);



                try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("selected.csv")))) {

                    for (Match match : matches) {
                        if (match.getYear() == userInput) {
                            writer.println(match);
                        }
                    }

                }

                int max = 0;
                int counter = 0;
                Map<String, Integer> totalGoals = new TreeMap<>();

                for (Match match : matches){

                    if (match.getYear() == userInput){
                        int differance = Math.abs(match.getGoals_a() - match.getGoals_b());
                        if (differance > max){
                            max = differance;
                        }
                        String bet = match.getTeam_a();
                        String winner = match.getWinner();
                        if (bet.equalsIgnoreCase(winner)){
                            counter++;
                        }
                        int oldGoals = totalGoals.getOrDefault(match.getStage(), 0);
                        totalGoals.put(match.getStage(), oldGoals + match.getGoals_a() + match.getGoals_b());

                    }
                }





                System.out.println("2. Maximum goal diffference: " + max);
                System.out.println("3. The player ha won " + counter + " bets.");
                for (String var : totalGoals.keySet()){
                    System.out.println(var + ": " + totalGoals.get(var));
                }



            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
