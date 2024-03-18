public class MethodChallenge {

    public static void main(String[] args) {

        int highScorePosition1 = calculateHighScorePosition(1500);
        displayHighScorePosition("Cesur", highScorePosition1);

        int highScorePosition2 = calculateHighScorePosition(1000);
        displayHighScorePosition("Bayram", highScorePosition2);

        int highScorePosition3 = calculateHighScorePosition(500);
        displayHighScorePosition("İslam", highScorePosition3);

        int highScorePosition4 = calculateHighScorePosition(100);
        displayHighScorePosition("Fatih", highScorePosition4);

        int highScorePosition5 = calculateHighScorePosition(25);
        displayHighScorePosition("Serif", highScorePosition5);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
