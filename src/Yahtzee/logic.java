package Yahtzee;
import java.util.ArrayList;
import java.util.List;

public class logic {
    private static final int FIRST = 0;
    private static final int SECOND = 1;
    private static final int THIRD = 2;
    private static final int FOURTH = 3;
    private static final int FIFTH = 4;
    public static final int NUMBER_OF_DICE = 5;
    public boolean isYahtzeeBonus = false;


    //upper section
    //if the user has any 1's in the roll, they can add the total of the 1’s to their score.
    public int isOnes(ArrayList<Dice> dice) {
        int result = 0;
        for (int i = 0; i < NUMBER_OF_DICE; i++) {
            if (dice.get(i).getValue() == 1) {
                result += 1;
            }
        }
        return result;
    }

    //if the user has any 2's in the roll, they can add the total of the 2’s to their score.
    public int isTwos(ArrayList<Dice> dice) {
        int result = 0;
        for (int i = 0; i < NUMBER_OF_DICE; i++) {
            if (dice.get(i).getValue() == 2) {
                result += 2;
            }
        }
        return result;
    }

    //if the user has any 3's in the roll, they can add the total of the 3’s to their score.
    public int isThrees(ArrayList<Dice> dice) {
        int result = 0;
        for (int i = 0; i < NUMBER_OF_DICE; i++) {
            if (dice.get(i).getValue() == 3) {
                result += 3;
            }
        }
        return result;
    }

    //if the user has any 4's in the roll, they can add the total of the 4’s to their score.
    public int isFours(ArrayList<Dice> dice) {
        int result = 0;
        for (int i = 0; i < NUMBER_OF_DICE; i++) {
            if (dice.get(i).getValue() == 4) {
                result += 4;
            }
        }
        return result;
    }

    //if the user has any 5's in the roll, they can add the total of the 5’s to their score.
    public int isFives(ArrayList<Dice> dice) {
        int result = 0;
        for (int i = 0; i < NUMBER_OF_DICE; i++) {
            if (dice.get(i).getValue() == 5) {
                result += 5;
            }
        }
        return result;
    }

    //if the user has any 6's in the roll, they can add the total of the 6’s to their score.
    public int isSixes(ArrayList<Dice> dice) {
        int result = 0;
        for (int i = 0; i < NUMBER_OF_DICE; i++) {
            if (dice.get(i).getValue() == 6) {
                result += 6;
            }
        }
        return result;
    }

    // If the user has over 63 points in the upper section, then they receive a bonus of 35 points.
    public static int isBonus(int upperScore) {
        if (upperScore >= 63) {
            return 35;
        } else {
            return 0;
        }
    }


    //lower section
    // if the user has a 3 of a kind, return the total of all 5 dice.
    public int isThreeOfAKind(ArrayList<Dice> dice) {
        List<Dice> copy = new ArrayList<Dice>(dice);
        copy.sort(Dice::compareTo);
        int result = 0;
        if (copy.get(FIRST).getValue() == copy.get(THIRD).getValue() ||
                copy.get(SECOND).getValue() == copy.get(FOURTH).getValue() ||
                copy.get(THIRD).getValue() == copy.get(FIFTH).getValue()) {
            for (int i = 0; i < NUMBER_OF_DICE; i++) {
                result += copy.get(i).getValue();
            }
        }
        return result;
    }

    // if the user has a 4 of a kind, return the total of all 5 dice.
    public int isFourOfAKind(ArrayList<Dice> dice) {
        List<Dice> copy = new ArrayList<Dice>(dice);
        copy.sort(Dice::compareTo);
        int result = 0;
        if (copy.get(FIRST).getValue() == copy.get(FOURTH).getValue() ||
                copy.get(SECOND).getValue() == copy.get(FIFTH).getValue()) {
            for (int i = 0; i < NUMBER_OF_DICE; i++) {
                result += copy.get(i).getValue();
            }
        }
        return result;
    }

    // if the user has a full house, return 25.
    public int isFullHouse(ArrayList<Dice> dice) {
        List<Dice> copy = new ArrayList<Dice>(dice);
        copy.sort(Dice::compareTo);
        int result = 0;
        if (copy.get(FIRST).getValue() == copy.get(THIRD).getValue() &&
                copy.get(THIRD).getValue() != copy.get(FOURTH).getValue() &&
                copy.get(FOURTH).getValue() == copy.get(FIFTH).getValue()) {
            result = 25;
        } else if (copy.get(FIRST).getValue() == copy.get(SECOND).getValue() &&
                copy.get(SECOND).getValue() != copy.get(THIRD).getValue() &&
                copy.get(THIRD).getValue() == copy.get(FIFTH).getValue()) {
            result = 25;
        }
        return result;
    }

    // if the user has a small straight, return 30.
    public int isSmallStraight(ArrayList<Dice> dice) {
        List<Dice> copy = new ArrayList<Dice>(dice);
        copy.sort(Dice::compareTo);
        int result = 0;
        if (copy.get(FIRST).getValue() == copy.get(SECOND).getValue() - 1 &&
                copy.get(SECOND).getValue() == copy.get(THIRD).getValue() - 1 &&
                copy.get(THIRD).getValue() == copy.get(FOURTH).getValue() - 1) {
            result = 30;
        } else if (copy.get(SECOND).getValue() == copy.get(THIRD).getValue() - 1 &&
                copy.get(THIRD).getValue() == copy.get(FOURTH).getValue() - 1 &&
                copy.get(FOURTH).getValue() == copy.get(FIFTH).getValue() - 1) {
            result = 30;
        }
        return result;
    }

    // if the user has a large straight, return 40.
    public int isLargeStraight(ArrayList<Dice> dice) {
        List<Dice> copy = new ArrayList<Dice>(dice);
        copy.sort(Dice::compareTo);
        int result = 0;
        if (copy.get(FIRST).getValue() == copy.get(SECOND).getValue() - 1 &&
                copy.get(SECOND).getValue() == copy.get(THIRD).getValue() - 1 &&
                copy.get(THIRD).getValue() == copy.get(FOURTH).getValue() - 1 &&
                copy.get(FOURTH).getValue() == copy.get(FIFTH).getValue() - 1) {
            result = 40;
        }
        return result;
    }

    // if the user has a yahtzee, return 50.
    public int isYahtzee(ArrayList<Dice> dice) {
        List<Dice> copy = new ArrayList<Dice>(dice);
        copy.sort(Dice::compareTo);
        int result = 0;
        if (copy.get(FIRST).getValue() == copy.get(FIFTH).getValue()) {
            result = 50;
        }
        isYahtzeeBonus = true;
        return result;
    }

    // if the user has a chance, return the total of all 5 dice.
    public int isChance(ArrayList<Dice> dice) {
        List<Dice> copy = new ArrayList<Dice>(dice);
        copy.sort(Dice::compareTo);
        int result = 0;
        for (int i = 0; i < NUMBER_OF_DICE; i++) {
            result += copy.get(i).getValue();
        }
        return result;
    }

    //if the user scored a Yahtzee previously, they will receive a 100 point bonus per Yahtzee scored.
    public int isYahtzeeBonus() {
        if (isYahtzeeBonus) {
            return 100;
        } else {
            return 0;
        }
    }
}
