package Yahtzee;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ScoreCardTest {

    ArrayList<Dice> dice = new ArrayList<Dice>();
    Dice d1 = new Dice();
    Dice d2 = new Dice();
    Dice d3 = new Dice();
    Dice d4 = new Dice();
    Dice d5 = new Dice();

    public ScoreCardTest() {
        setUp();
    }
    public void setUp() {
        dice.add(d1);
        dice.add(d2);
        dice.add(d3);
        dice.add(d4);
        dice.add(d5);
    }

    @Test
    public void scoreCheck() {
    }

    @Test
    public void round() {
    }

    @Test
    public void getIsUpperTotal() {
    }

    @Test
    public void getIsLowerTotal() {
    }

    @Test
    public void getIsGrandTotal() {
    }

    @Test
    public void getGameRound() {
    }

    @Test
    public void getIsOnes() {
    }

    @Test
    public void getIsTwos() {
    }

    @Test
    public void getIsThrees() {
    }

    @Test
    public void getIsFours() {
    }

    @Test
    public void getIsFives() {
    }

    @Test
    public void getIsSixes() {
    }

    @Test
    public void getIsThreeOfAKind() {
    }

    @Test
    public void getIsFourOfAKind() {
    }

    @Test
    public void getIsSmallStraight() {
    }

    @Test
    public void getIsLargeStraight() {
    }

    @Test
    public void getIsFullHouse() {
    }

    @Test
    public void getIsChance() {
    }

    @Test
    public void getIsYahtzee() {
    }
}