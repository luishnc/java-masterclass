package com.luis;

public class Main {

    public static void main(String[] args) {
	FootballPlayer joe = new FootballPlayer("Joe");
	BaseballPlayer vivian = new BaseballPlayer("Vivian");
	SoccerPlayer luis = new SoccerPlayer("Luis");

	Team<FootballPlayer> saoPauloFc = new Team<>("Sao Paulo FC");
	//saoPauloFc.addPlayer(luis);
	//saoPauloFc.addPlayer(vivian);
	saoPauloFc.addPlayer(joe);

        System.out.println(saoPauloFc.numPlayers());


        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Bus");
        baseballTeam.addPlayer(vivian);

        Team<SoccerPlayer> brokenTeam = new Team<>("Broken");
        brokenTeam.addPlayer(luis);

		Team<FootballPlayer> palmeiras = new Team<>("Palmeiras");
		FootballPlayer valdivia = new FootballPlayer("Valdivia");
		palmeiras.addPlayer(valdivia);

		saoPauloFc.matchResult(palmeiras,10,5);

		//saoPauloFc.matchResult(baseballTeam,1,1);
		System.out.println("Rankings");
		System.out.println(saoPauloFc.getName() + ": " + saoPauloFc.ranking());
		System.out.println(palmeiras.getName() + ": " + palmeiras.ranking());

		System.out.println(saoPauloFc.compareTo(palmeiras));
		System.out.println(palmeiras.compareTo(saoPauloFc));






    }


}
