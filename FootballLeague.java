package BongDa;

import java.util.ArrayList;

class FootballLeague {
	private String name;
	private long moneyBonus;
	private ArrayList<FootballTeam> teams;

	public FootballLeague() {
	}

	public FootballLeague(String name, long moneyBonus, ArrayList<FootballTeam> teams) {
		this.name = name;
		this.moneyBonus = moneyBonus;
		this.teams = teams;
	}

	public void display() {
		System.out.println("League Name: " + name);
		System.out.println("Money Bonus: " + moneyBonus);
		System.out.println("Teams:");

		for (FootballTeam team : teams) {
			team.display();
		}
	}

	public static ArrayList<FootballLeague> getMaxLeagueTeam(ArrayList<FootballLeague> leagues) {
		ArrayList<FootballLeague> maxLeagues = new ArrayList<>();
		int maxTeamCount = 0;

		for (FootballLeague league : leagues) {
			if (league.getTeams().size() > maxTeamCount) {
				maxTeamCount = league.getTeams().size();
			}
		}
		for (FootballLeague league : leagues) {
			if (league.getTeams().size() > maxTeamCount) {
				maxLeagues.add(league);
			}
		}
		return maxLeagues;
	}

	public String getName() {
		return name;
	}

	public long getMoneyBonus() {
		return moneyBonus;
	}

	public ArrayList<FootballTeam> getTeams() {
		return teams;
	}

}
