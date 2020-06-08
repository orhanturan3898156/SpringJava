package Replits.If_Statements;

public class Replit44_BlackJack {
    /*
    in blackjack after the player asks to keep the house 4 things may happen.

1) if the card total is bigger then 21 the player busts.
2)if the house score is bigger then the player, the player loses .
3)if the player score is equal to the house then thers a draw.
4)if the player score is bigger then the house the player wins.

player and house scores are represented by  player and house int variables.
     */
    public static void main(String[] args) {

        int playerScore = 23;
        int houseScore = 9;
        String result = "";

        if (playerScore > 21) {
            result = "Busts";
        } else if (houseScore > playerScore) {
            result = "player Loses";
        } else if (playerScore == houseScore) {
            result = "Draw";
        } else if (playerScore > houseScore) {
            result = "player wins";
        }

        System.out.println(result);


    }
}
