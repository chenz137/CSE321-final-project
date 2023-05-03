package Yahtzee;

import java.util.ArrayList;
import java.util.Map;

public class ScoreCard {
    public static ScoreCard Instance = new ScoreCard();
    private int isOnes = 0;
    private int isTwos = 0;
    private int isThrees = 0;
    private int isFours = 0;
    private int isFives = 0;
    private int isSixes = 0;
    private int isThreeOfAKind = 0;
    private int isFourOfAKind = 0;
    private int isFullHouse = 0;
    private int isSmallStraight = 0;
    private int isLargeStraight = 0;
    private int isYahtzee = 0;
    private int isChance = 0;
    private int YahtzeeBonus = 0;
    private int isUpperTotal = 0;
    public int round = 1;
    public int count = 0;
    boolean gameOver = false;

    public void scoreCheck(ArrayList <Dice> numList){
        isOnes = logic.isOnes(numList);
        isTwos = logic.isTwos(numList);
        isThrees = logic.isThrees(numList);
        isFours = logic.isFours(numList);
        isFives = logic.isFives(numList);
        isSixes = logic.isSixes(numList);
        isThreeOfAKind = logic.isThreeOfAKind(numList);
        isFourOfAKind = logic.isFourOfAKind(numList);
        isFullHouse = logic.isFullHouse(numList);
        isSmallStraight = logic.isSmallStraight(numList);
        isLargeStraight = logic.isLargeStraight(numList);
        isYahtzee = logic.isYahtzee(numList);
        isChance = logic.isChance(numList);
        YahtzeeBonus = logic.isYahtzeeBonus();
    }

    // The game lasts 13 rounds of rolling and scoring.
    public boolean Round() {
        count++;
        if (round <= 13) {
            if (count % 3 == 0) {
                round++;
            }
        }else {
                round = 1;
                gameOver = true;
            }
        return gameOver;
    }

    public int getIsUpperTotal(Map<String, Integer> finalscore) {
        int UpperTotal = finalscore.get("Ones") + finalscore.get("Twos") + finalscore.get("Threes") + finalscore.get("Fours") + finalscore.get("Fives") + finalscore.get("Sixes");
        int bonus = logic.isBonus(isUpperTotal);
        return UpperTotal + bonus;
    }

    public int getIsLowerTotal(Map<String, Integer> finalscore) {
        return finalscore.get("Three of a Kind") + finalscore.get("Four of a Kind") + finalscore.get("Full House") + finalscore.get("Small Straight") + finalscore.get("Large Straight") + finalscore.get("Yahtzee") + finalscore.get("Chance");
    }

    public int getIsGrandTotal() {
        return getIsUpperTotal(GUI.scoreMap) + getIsLowerTotal(GUI.scoreMap) + YahtzeeBonus;
    }

    public String getGameRound(){
        return "Round " + round;
    }

    public int getIsOnes() {
        return isOnes;
    }

    public int getIsTwos() {
        return isTwos;
    }

    public int getIsThrees() {
        return isThrees;
    }

    public int getIsFours() {
        return isFours;
    }

    public int getIsFives() {
        return isFives;
    }

    public int getIsSixes() {
        return isSixes;
    }

    public int getIsThreeOfAKind() {
        return isThreeOfAKind;
    }

    public int getIsFourOfAKind() {
        return isFourOfAKind;
    }

    public int getIsSmallStraight() {
        return isSmallStraight;
    }

    public int getIsLargeStraight() {
        return isLargeStraight;
    }

    public int getIsFullHouse() {
        return isFullHouse;
    }

    public int getIsChance() {
        return isChance;
    }

    public int getIsYahtzee() {
        return isYahtzee;
    }
}
