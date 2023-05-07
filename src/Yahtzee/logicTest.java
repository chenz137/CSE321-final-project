package Yahtzee;

import org.junit.Test;

import java.util.ArrayList;


public class logicTest {
    ArrayList<Dice> dice = new ArrayList<Dice>();
    Dice d1 = new Dice();
    Dice d2 = new Dice();
    Dice d3 = new Dice();
    Dice d4 = new Dice();
    Dice d5 = new Dice();

    public logicTest() {
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
    public void isOnesTest() {
        d1.setValue(1);
        d2.setValue(1);
        d3.setValue(1);
        d4.setValue(1);
        d5.setValue(1);
        assert logic.isOnes(dice) == 5;
    }

    @Test
    public void isTwos() {
        d1.setValue(2);
        d2.setValue(2);
        d3.setValue(2);
        d4.setValue(2);
        d5.setValue(2);
        assert logic.isTwos(dice) == 10;
    }

    @Test
    public void isThrees() {
        d1.setValue(3);
        d2.setValue(3);
        d3.setValue(3);
        d4.setValue(3);
        d5.setValue(3);
        assert logic.isThrees(dice) == 15;
    }

    @Test
    public void isFours() {
        d1.setValue(4);
        d2.setValue(4);
        d3.setValue(4);
        d4.setValue(4);
        d5.setValue(4);
        assert logic.isFours(dice) == 20;
    }

    @Test
    public void isFives() {
        d1.setValue(5);
        d2.setValue(5);
        d3.setValue(5);
        d4.setValue(5);
        d5.setValue(5);
        assert logic.isFives(dice) == 25;
    }

    @Test
    public void isSixes() {
        d1.setValue(6);
        d2.setValue(6);
        d3.setValue(6);
        d4.setValue(6);
        d5.setValue(6);
        assert logic.isSixes(dice) == 30;
    }

    @Test
    public void isBonus() {
        int upperScore = 63;
        assert logic.isBonus(upperScore) == 35;
        int upperScore2 = 62;
        assert logic.isBonus(upperScore2) == 0;
    }

    @Test
    public void isThreeOfAKind() {
        d1.setValue(1);
        d2.setValue(1);
        d3.setValue(1);
        d4.setValue(2);
        d5.setValue(3);
        assert logic.isThreeOfAKind(dice) == 8;
    }

    @Test
    public void isFourOfAKind() {
        d1.setValue(1);
        d2.setValue(1);
        d3.setValue(1);
        d4.setValue(1);
        d5.setValue(3);
        assert logic.isFourOfAKind(dice) == 7;
    }

    @Test
    public void isFullHouse() {
        d1.setValue(1);
        d2.setValue(1);
        d3.setValue(1);
        d4.setValue(2);
        d5.setValue(2);
        assert logic.isFullHouse(dice) == 25;
    }

    @Test
    public void isSmallStraight() {
        d1.setValue(1);
        d2.setValue(2);
        d3.setValue(3);
        d4.setValue(4);
        d5.setValue(5);
        assert logic.isSmallStraight(dice) == 30;
    }

    @Test
    public void isLargeStraight() {
        d1.setValue(2);
        d2.setValue(3);
        d3.setValue(4);
        d4.setValue(5);
        d5.setValue(6);
        assert logic.isLargeStraight(dice) == 40;
    }

    @Test
    public void isYahtzee() {
        d1.setValue(1);
        d2.setValue(1);
        d3.setValue(1);
        d4.setValue(1);
        d5.setValue(1);
        assert logic.isYahtzee(dice) == 50;
    }

    @Test
    public void isChance() {
        d1.setValue(1);
        d2.setValue(2);
        d3.setValue(3);
        d4.setValue(4);
        d5.setValue(5);
        assert logic.isChance(dice) == 15;
    }

    @Test
    public void isYahtzeeBonus() {
        logic.isYahtzeeBonus = true;
        assert logic.isYahtzeeBonus() == 100;
        logic.isYahtzeeBonus = false;
        assert logic.isYahtzeeBonus() == 0;
    }
}
