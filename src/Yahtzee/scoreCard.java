package Yahtzee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class scoreCard {
    static int isOnes = 0;
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
    int isUpperTotal = 0;
    int isLowerTotal = 0;
    int isGrandTotal = 0;
    static int round = 1;

    // map to store the scorecard
    static Map <String, Integer> scoreCard = new HashMap<String, Integer>();
    public void scoreMap() {
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
        scoreCard.put("Grand Total", getIsGrandTotal());
    }


    public static void scoreCheck(){
        ArrayList <Dice> numList = Dice.diceValues();
        int Ones = logic.isOnes(numList);
        if (isOnes == 0) {
            scoreCard.put("Ones", Ones);
        }
        int Twos = logic.isTwos(numList);
        int Threes = logic.isThrees(numList);
        int Fours = logic.isFours(numList);
        int Fives = logic.isFives(numList);
        int Sixes = logic.isSixes(numList);
        int ThreeOfAKind = logic.isThreeOfAKind(numList);
        int FourOfAKind = logic.isFourOfAKind(numList);
        int FullHouse = logic.isFullHouse(numList);
        int SmallStraight = logic.isSmallStraight(numList);
        int LargeStraight = logic.isLargeStraight(numList);
        int Yahtzee = logic.isYahtzee(numList);
        int Chance = logic.isChance(numList);
        int YahtzeeBonus = logic.isYahtzeeBonus();
    }

    // The game lasts 13 rounds of rolling and scoring.
    public static boolean Round() {
        if (round < 13) {
            round++;
            return false;
        } else {
            round = 0;
            return true;
        }
    }

    public int getIsUpperTotal() {
        isUpperTotal = isOnes + isTwos + isThrees + isFours + isFives + isSixes;
        int bonus = logic.isBonus(isUpperTotal);
        return isUpperTotal + bonus;
    }

    public int getIsLowerTotal() {
        isLowerTotal = isThreeOfAKind + isFourOfAKind + isFullHouse + isSmallStraight + isLargeStraight + isYahtzee + isChance;
        return isLowerTotal;
    }

    public int getIsGrandTotal() {
        isGrandTotal = getIsUpperTotal() + getIsLowerTotal();
        scoreCard.put("Grand Total", isGrandTotal);
        return isGrandTotal;
    }

    public String getGameRound(){
        return "Round " + round;
    }

    // The player may re-roll any number of the 5 dice an additional 2 times per round, totaling to 3 dice rolls per round.
    // That is, you roll the dice and then choose to reroll a subset of dice a second time, then again for the third time.
    // When rerolling the dice in a round, you may reroll any subset of dice or all of the dice per reroll.
    // At the end of the 13th round, all the boxes which can be scored in must be filled. That is, all unscored boxes will be defaulted with a 0.



    // The player must score once in each category. That is, a player may not choose to skip scoring a category even if they can score 0 in all categories.
    // The player may score in any category at any time in the game, even if the player has not rolled the dice yet.


    public String toString() {
        String ret = "Ones=" + isOnes + "%n";
        ret += "Twos=" + isTwos + "%n";
        ret += "Threes=" + isThrees + "%n";
        ret += "Fours=" + isFours + "%n";
        ret += "Fives=" + isFives + "%n";
        ret += "Sixes=" + isSixes + "%n";
        ret += "Three Of A Kind=" + isThreeOfAKind + "%n";
        ret += "Four Of A Kind=" + isFourOfAKind + "%n";
        ret += "Full House=" + isFullHouse + "%n";
        ret += "Small Straight=" + isSmallStraight + "%n";
        ret += "Large Straight=" + isLargeStraight + "%n";
        ret += "Yahtzee=" + isYahtzee + "%n";
        ret += "Chance=" + isChance + "%n";
        return ret;
    }
}


