package Yahtzee;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ScoreCard_Test {
	public ScoreCard score;
	public static ArrayList<Dice> testList = list();
	
	public static ArrayList<Dice> list() {
		ArrayList<Dice> list = new ArrayList<Dice>();
		for(int i=0; i < 5; i++) list.add(new Dice());
		return list;
	}
	
	@Test
	public void test_ScoreCheck() {
		score = new ScoreCard();
		try {
			score.scoreCheck(testList);
		} catch (Exception e) {
			fail("Exception Found");
		}
		try {
			score.scoreCheck(null);
			fail("Null Pointer Exception Expected");
		} catch (NullPointerException e) {
			
		}
	}
	
	@Test
	public void test_Round() {
		score = new ScoreCard();
		for(int i = 1; i < 40; i++) {
			assertFalse(score.Round());
		}
		assertTrue(score.Round());
		
	}
}
