package Yahtzee;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Logic_Test {
	final Dice one = one();
	final Dice two = two();
	final Dice three = three();
	final Dice four = four();
	final Dice five = five();
	final Dice six = six();
	
	public static Dice one() {
		Dice d = new Dice();
		while(true) {
			if(d.getValue() != 1) {
				d.roll();
			} else {
				return d;
			}
		}
	}
	public static Dice two() {
		Dice d = new Dice();
		while(true) {
			if(d.getValue() != 2) {
				d.roll();
			} else {
				return d;
			}
		}
	}
	public static Dice three() {
		Dice d = new Dice();
		while(true) {
			if(d.getValue() != 3) {
				d.roll();
			} else {
				return d;
			}
		}
	}
	public static Dice four() {
		Dice d = new Dice();
		while(true) {
			if(d.getValue() != 4) {
				d.roll();
			} else {
				return d;
			}
		}
	}
	public static Dice five() {
		Dice d = new Dice();
		while(true) {
			if(d.getValue() != 5) {
				d.roll();
			} else {
				return d;
			}
		}
	}	
	public static Dice six() {
		Dice d = new Dice();
		while(true) {
			if(d.getValue() != 6) {
				d.roll();
			} else {
				return d;
			}
		}
	}
	
	
	@Test
	public void test_IsOnes() {
		ArrayList<Dice> list = new ArrayList<Dice>();
		for(int i = 0; i < 5; i++) list.add(one);
		int score = logic.isOnes(list);
		assertTrue(score==5);
		
		list.clear();
		for(int i = 0; i < 5; i++) list.add(three);
		score = logic.isOnes(list);
		assertTrue(score==0);
		
		try {
			score = logic.isOnes(null);
			fail("Null Pointer Exception Expected");
		} catch (NullPointerException e) {
			
		}
	}
	
	@Test
	public void test_IsTwos() {
		ArrayList<Dice> list = new ArrayList<Dice>();
		for(int i = 0; i < 5; i++) list.add(two);
		int score = logic.isTwos(list);
		assertTrue(score==10);
		
		list.clear();
		for(int i = 0; i < 5; i++) list.add(three);
		score = logic.isTwos(list);
		assertTrue(score==0);
		
		try {
			score = logic.isTwos(null);
			fail("Null Pointer Exception Expected");
		} catch (NullPointerException e) {

		}
	}
	
	@Test
	public void test_IsThrees() {
		ArrayList<Dice> list = new ArrayList<Dice>();
		for(int i = 0; i < 5; i++) list.add(three);
		int score = logic.isThrees(list);
		assertTrue(score==15);
		
		list.clear();
		for(int i = 0; i < 5; i++) list.add(one);
		score = logic.isThrees(list);
		assertTrue(score==0);
		
		try {
			score = logic.isThrees(null);
			fail("Null Pointer Exception Expected");
		} catch (NullPointerException e) {
			
		}
	}
	
	@Test
	public void test_IsFours() {
		ArrayList<Dice> list = new ArrayList<Dice>();
		for(int i = 0; i < 5; i++) list.add(four);
		int score = logic.isFours(list);
		assertTrue(score==20);
		
		list.clear();
		for(int i = 0; i < 5; i++) list.add(one);
		score = logic.isFours(list);
		assertTrue(score==0);
		
		try {
			score = logic.isFours(null);
			fail("Null Pointer Exception Expected");
		} catch (NullPointerException e) {
			
		}
	}
	
	@Test
	public void test_IsFives() {
		ArrayList<Dice> list = new ArrayList<Dice>();
		for(int i = 0; i < 5; i++) list.add(five);
		int score = logic.isFives(list);
		assertTrue(score==25);
		
		list.clear();
		for(int i = 0; i < 5; i++) list.add(one);
		score = logic.isFives(list);
		assertTrue(score==0);
		
		try {
			score = logic.isFives(null);
			fail("Null Pointer Exception Expected");
		} catch (NullPointerException e) {
			
		}
	}
	
	@Test
	public void test_IsSixes() {
		ArrayList<Dice> list = new ArrayList<Dice>();
		for(int i = 0; i < 5; i++) list.add(six);
		int score = logic.isSixes(list);
		assertTrue(score==30);
		
		list.clear();
		for(int i = 0; i < 5; i++) list.add(one);
		score = logic.isSixes(list);
		assertTrue(score==0);
		
		try {
			score = logic.isSixes(null);
			fail("Null Pointer Exception Expected");
		} catch (NullPointerException e) {
			
		}
	}
	
	@Test
	public void test_IsBonus() {
		assertTrue(logic.isBonus(0) == 0);
		assertTrue(logic.isBonus(62) == 0);
		assertTrue(logic.isBonus(63) == 35);
		assertTrue(logic.isBonus(100) == 35);
	}
	
	@Test
	public void test_IsThreeOfAKind() {
		ArrayList<Dice> list = new ArrayList<Dice>();
		for(int i = 0; i < 5; i++) list.add(one);
		int score = logic.isThreeOfAKind(list);
		assertTrue(score==5);
		
		
		list.clear();
		list.add(one); list.add(one); list.add(one); list.add(five); list.add(four);
		score = logic.isThreeOfAKind(list);
		assertTrue(score==12);
		
		list.clear();
		list.add(one); list.add(one); list.add(five); list.add(four); list.add(one);
		score = logic.isThreeOfAKind(list);
		assertTrue(score==12);
		
		list.clear();
		list.add(one); list.add(five); list.add(one); list.add(four); list.add(one);
		score = logic.isThreeOfAKind(list);
		assertTrue(score==12);
		
		list.clear();
		list.add(one); list.add(five); list.add(two); list.add(four); list.add(one);
		score = logic.isThreeOfAKind(list);
		assertTrue(score==0);
		
		
		list.clear();
		list.add(one); list.add(two); list.add(one); list.add(five); list.add(four);
		score = logic.isThreeOfAKind(list);
		assertTrue(score==0);
		
		try {
			score = logic.isThreeOfAKind(null);
			fail("Null Pointer Exception Expected");
		} catch (NullPointerException e) {
			
		}
	}
	
	@Test
	public void test_IsFourOfAKind() {
		ArrayList<Dice> list = new ArrayList<Dice>();
		for(int i = 0; i < 5; i++) list.add(one);
		int score = logic.isFourOfAKind(list);
		assertTrue(score==5);
		
		list.clear();
		list.add(one); list.add(one); list.add(one); list.add(one); list.add(four);
		score = logic.isFourOfAKind(list);
		assertTrue(score==8);
		
		list.clear();
		list.add(one); list.add(one); list.add(one); list.add(four); list.add(one);
		score = logic.isFourOfAKind(list);
		assertTrue(score==8);
		
		list.clear();
		list.add(one); list.add(one); list.add(four); list.add(one); list.add(one);
		score = logic.isFourOfAKind(list);
		assertTrue(score==8);
		
		list.clear();
		list.add(one); list.add(two); list.add(four); list.add(one); list.add(one);
		score = logic.isFourOfAKind(list);
		assertTrue(score==0);
		
		list.clear();
		list.add(one); list.add(two); list.add(four); list.add(one); list.add(two);
		score = logic.isFourOfAKind(list);
		assertTrue(score==0);
		
		try {
			score = logic.isFourOfAKind(null);
			fail("Null Pointer Exception Expected");
		} catch (NullPointerException e) {
			
		}
	}
	
	public void test_IsFullHouse() {
		ArrayList<Dice> list = new ArrayList<Dice>();
		for(int i = 0; i < 5; i++) list.add(one);
		int score = logic.isFullHouse(list);
		assertTrue(score==0);
		
		list.clear();
		list.add(one); list.add(two); list.add(four); list.add(one); list.add(two);
		score = logic.isFullHouse(list);
		assertTrue(score==0);
		
		list.clear();
		list.add(one); list.add(two); list.add(one); list.add(one); list.add(two);
		score = logic.isFullHouse(list);
		assertTrue(score==25);
		
		try {
			score = logic.isFullHouse(null);
			fail("Null Pointer Exception Expected");
		} catch (NullPointerException e) {
			
		}
	}
	
	public void test_IsSmallStraight() {
		ArrayList<Dice> list = new ArrayList<Dice>();
		for(int i = 0; i < 5; i++) list.add(one);
		int score = logic.isSmallStraight(list);
		assertTrue(score==0);
		
		list.clear();
		list.add(one); list.add(two); list.add(four); list.add(one); list.add(two);
		score = logic.isSmallStraight(list);
		assertTrue(score==0);
		
		list.clear();
		list.add(one); list.add(two); list.add(one); list.add(one); list.add(two);
		score = logic.isSmallStraight(list);
		assertTrue(score==0);
		
		list.clear();
		list.add(one); list.add(two); list.add(three); list.add(one); list.add(two);
		score = logic.isSmallStraight(list);
		assertTrue(score==0);
		
		list.clear();
		list.add(one); list.add(two); list.add(three); list.add(four); list.add(two);
		score = logic.isSmallStraight(list);
		assertTrue(score==30);
		
		list.clear();
		list.add(two); list.add(three); list.add(four); list.add(two); list.add(one); 
		score = logic.isSmallStraight(list);
		assertTrue(score==30);
		
		try {
			score = logic.isSmallStraight(null);
			fail("Null Pointer Exception Expected");
		} catch (NullPointerException e) {
			
		}
	}
	
	@Test
	public void test_IsLargeStraight() {
		ArrayList<Dice> list = new ArrayList<Dice>();
		for(int i = 0; i < 5; i++) list.add(one);
		int score = logic.isLargeStraight(list);
		assertTrue(score==0);
		
		list.clear();
		list.add(one); list.add(two); list.add(four); list.add(one); list.add(two);
		score = logic.isLargeStraight(list);
		assertTrue(score==0);
		
		list.clear();
		list.add(one); list.add(two); list.add(one); list.add(one); list.add(two);
		score = logic.isLargeStraight(list);
		assertTrue(score==0);
		
		list.clear();
		list.add(one); list.add(two); list.add(three); list.add(one); list.add(two);
		score = logic.isLargeStraight(list);
		assertTrue(score==0);
		
		list.clear();
		list.add(one); list.add(two); list.add(three); list.add(four); list.add(two);
		score = logic.isLargeStraight(list);
		assertTrue(score==0);
		
		list.clear();
		list.add(two); list.add(three); list.add(four); list.add(five); list.add(one); 
		score = logic.isLargeStraight(list);
		assertTrue(score==40);
		
		list.clear();
		list.add(two); list.add(three); list.add(five); list.add(one); list.add(four);
		score = logic.isLargeStraight(list);
		assertTrue(score==40);
		
		try {
			score = logic.isLargeStraight(null);
			fail("Null Pointer Exception Expected");
		} catch (NullPointerException e) {
			
		}
	}
	
	@Test
	public void test_IsYahtzee() {
		ArrayList<Dice> list = new ArrayList<Dice>();
		for(int i = 0; i < 5; i++) list.add(two);
		int score = logic.isYahtzee(list);
		assertTrue(score==50);
		
		list.clear();
		for(int i = 0; i < 5; i++) list.add(three);
		score = logic.isYahtzee(list);
		assertTrue(score==50);
		
		list.clear();
		list.add(two); list.add(three); list.add(five); list.add(one); list.add(four);
		score = logic.isYahtzee(list);
		assertTrue(score==0);
		
		try {
			score = logic.isYahtzee(null);
			fail("Null Pointer Exception Expected");
		} catch (NullPointerException e) {
			
		}
	}
	
	@Test
	public void test_IsChance() {
		ArrayList<Dice> list = new ArrayList<Dice>();
		for(int i = 0; i < 5; i++) list.add(two);
		int score = logic.isChance(list);
		assertTrue(score==10);
		
		list.clear();
		for(int i = 0; i < 5; i++) list.add(three);
		score = logic.isChance(list);
		assertTrue(score==15);
		
		list.clear();
		list.add(two); list.add(three); list.add(five); list.add(one); list.add(four);
		score = logic.isChance(list);
		assertTrue(score==15);
		
		try {
			score = logic.isChance(null);
			fail("Null Pointer Exception Expected");
		} catch (NullPointerException e) {

		}
	}
}
