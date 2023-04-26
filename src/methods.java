import java.util.HashMap;
import java.util.Map;

public class methods {
    int isOnes = 0;
    int isTwos = 0;
    int isThrees = 0;
    int isFours = 0;
    int isFives = 0;
    int isSixes = 0;
    int isThreeOfAKind = 0;
    int isFourOfAKind = 0;
    int isFullHouse = 0;
    int isSmallStraight = 0;
    int isLargeStraight = 0;
    int isYahtzee = 0;
    int isChance = 0;
    int isBonus = 0;
    int isUpperTotal = 0;
    int isLowerTotal = 0;
    int isGrandTotal = 0;
    int round = 0;

    // map to store the scorecard
    Map <String, Integer> scoreCard = new HashMap<String, Integer>();
    public void scoreCard() {
        scoreCard.put("Ones", isOnes);
        scoreCard.put("Twos", isTwos);
        scoreCard.put("Threes", isThrees);
        scoreCard.put("Fours", isFours);
        scoreCard.put("Fives", isFives);
        scoreCard.put("Sixes", isSixes);
        scoreCard.put("Three of a Kind", isThreeOfAKind);
        scoreCard.put("Four of a Kind", isFourOfAKind);
        scoreCard.put("Full House", isFullHouse);
        scoreCard.put("Small Straight", isSmallStraight);
        scoreCard.put("Large Straight", isLargeStraight);
        scoreCard.put("Yahtzee", isYahtzee);
        scoreCard.put("Chance", isChance);
        scoreCard.put("Grand Total", isGrandTotal);
    }

    // The game lasts 13 rounds of rolling and scoring.
    public boolean gameEnd() {
        if (round < 13) {
            round++;
            return false;
        } else {
            round = 0;
            return true;
        }
    }

    // The player may re-roll any number of the 5 dice an additional 2 times per round, totaling to 3 dice rolls per round.
    // That is, you roll the dice and then choose to reroll a subset of dice a second time, then again for the third time.
    // When rerolling the dice in a round, you may reroll any subset of dice or all of the dice per reroll.
    // At the end of the 13th round, all the boxes which can be scored in must be filled. That is, all unscored boxes will be defaulted with a 0.


    // The player must score once in each category. That is, a player may not choose to skip scoring a category even if they can score 0 in all categories.
    // The player may score in any category at any time in the game, even if the player has not rolled the dice yet.




}


