package BongDa;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<FootballPlayer> players1 = new ArrayList<>();
		players1.add(new FootballPlayer("Player1", 25, "Address1", 175.5, 70.0, 50000));
		players1.add(new FootballPlayer("Player2", 28, "Address2", 180.0, 75.0, 60000));

		ArrayList<FootballPlayer> players2 = new ArrayList<>();
		players2.add(new FootballPlayer("Player3", 23, "Address3", 170.0, 68.0, 55000));
		players2.add(new FootballPlayer("Player4", 30, "Address4", 185.0, 80.0, 65000));

		ArrayList<FootballTeam> teams = new ArrayList<>();
		teams.add(new FootballTeam("Team1", 1000000, players1));
		teams.add(new FootballTeam("Team2", 1200000, players2));

		System.out.println("All Teams:");
		for (FootballTeam team : teams) {
			team.display();
			System.out.println("Average Age: " + team.avgAgeTeam());
			System.out.println();
		}

		ArrayList<FootballTeam> maxTeams = FootballTeam.findMaxValuesTeam(teams);
		System.out.println("Teams with the highest value:");
		for (FootballTeam team : maxTeams) {
			team.display();
			System.out.println();
		}

		ArrayList<FootballLeague> leagues = new ArrayList<>();
		leagues.add(new FootballLeague("League1", 2000000, teams));

		System.out.println("All Leagues:");
		for (FootballLeague league : leagues) {
			league.display();
			System.out.println();
		}

		ArrayList<FootballLeague> maxLeagues = FootballLeague.getMaxLeagueTeam(leagues);
		System.out.println("Leagues with the most teams:");
		for (FootballLeague league : maxLeagues) {
			league.display();
			System.out.println();
		}
	}
}
