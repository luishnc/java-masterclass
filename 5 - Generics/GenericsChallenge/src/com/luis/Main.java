package com.luis;

public class Main {

    public static void main(String[] args) {
	    // ArrayList<Team> teams;
        // Collections.sort(teams);
        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.


        League<Team<FootballPlayer>> footballLeague = new League<>("Football");
        Team<FootballPlayer> spfc = new Team<>("Sao Paulo FC");
        Team<FootballPlayer> palmeiras = new Team<>("Palmeiras");

        spfc.matchResult(palmeiras,5,2);
        palmeiras.matchResult(spfc,5,2);
        palmeiras.matchResult(spfc,5,2);
        spfc.matchResult(palmeiras,5,2);
        spfc.matchResult(palmeiras,5,2);
        spfc.matchResult(spfc,5,2);

        footballLeague.add(spfc);
        footballLeague.add(palmeiras);

        footballLeague.showLeagueTable();
        























    }
}
