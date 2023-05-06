package Yahtzee;

import static org.junit.Assert.*;
import org.junit.Test;



public class Dice_Test {
	private final int MAX_ROLL = 6;
	private final int MIN_ROLL = 1;
	Dice d;
	
	
	@Test
	public void test_Dice() {
		d = new Dice();
		if (d.getValue() < MIN_ROLL) fail("Initialized Dice Value Too Low");
		if (d.getValue() > MAX_ROLL) fail("Initialized Dice Value Too High");
		
		assertTrue(d.getValue() % 1 == 0.00);
		
		assertFalse(d.hold);
	}
	
	@Test
	public void test_Graphic() {
		d = new Dice();
		try {
			d.makeGraphic();
		} catch (Exception e) {
			fail("Exception Found");
		}
	}
	
	@Test
	public void test_Hold() {
		d = new Dice();
		d.hold();
		assertTrue(d.hold);
	}
	
	@Test
	public void test_UnHold() {
		d = new Dice();
		d.hold();
		d.unHold();
		assertFalse(d.hold);
	}
	
	@Test
	public void test_Roll() {
		d = new Dice();
		d.roll();
		if (d.getValue() < MIN_ROLL) fail("Initialized Dice Value Too Low");
		if (d.getValue() > MAX_ROLL) fail("Initialized Dice Value Too High");
		assertTrue(d.getValue() % 1 == 0.00);
		
	}
	
	@Test
	public void test_ToString() {
		d = new Dice();
		assertEquals(d.toString(), d.getValue() + "");
	}
	
	@Test
	public void test_CompareTo() {
		d = new Dice();
		Dice d2 = new Dice();
		int i = d.compareTo(d2);
		
		if(d.getValue() < d2.getValue()) assertEquals(i, -1);
		if(d.getValue() > d2.getValue()) assertEquals(i, 1);
		if(d.getValue() == d2.getValue()) assertEquals(i, 0);
		
		if (i < MIN_ROLL - MAX_ROLL) fail("");
		if (i > MAX_ROLL - MIN_ROLL) fail("");
		
		try {
			i = d.compareTo(null);
			fail("Null Pointer Exception Expected");
		} catch(NullPointerException e) {
			
		}
	}
	
}
