package academy.learnprogramming.com;

public class Main {

    public static void main(String[] args) {

        String playerName1 = "Luis";
        int scorePlayer1 = 1500;
        String playerName2 = "Vivian";
        int scorePlayer2 = 900;
        String playerName3 = "Ronaldo";
        int scorePlayer3 = 400;
        String playerName4 = "Pedro";
        int scorePlayer4 = 50;

        //Find positions
        int positionPlayer1 = calculateHighScorePosition(scorePlayer1);
        int positionPlayer2 = calculateHighScorePosition(scorePlayer2);
        int positionPlayer3 = calculateHighScorePosition(scorePlayer3);
        int positionPlayer4 = calculateHighScorePosition(scorePlayer4);

        displayHighScorePosition(playerName1,positionPlayer1);
        displayHighScorePosition(playerName2,positionPlayer2);
        displayHighScorePosition(playerName3,positionPlayer3);
        displayHighScorePosition(playerName4,positionPlayer4);




    }

    public static void displayHighScorePosition(String playerName, int position) {

        System.out.println(playerName +
                " managed to get into position " +
                position +
                " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {

            return 1;
        } else if (playerScore >= 500) {

            return 2;

        } else if (playerScore >= 100) {

            return 3;
        }

        return 4;
    }


}
