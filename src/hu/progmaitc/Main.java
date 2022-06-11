package hu.progmaitc;

import hu.progmaitc.match.Match;
import hu.progmaitc.match.Normal;
import hu.progmaitc.match.Penalty;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

                Scanner scanner = new Scanner(System.in);
                int userInput = scanner.nextInt();
                scanner.nextLine();


                try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("selected. csv")))) {

                    for (Match match : matches) {
                        if (match.getYear() == userInput) {
                            writer.println(match);
                        }
                    }

                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
