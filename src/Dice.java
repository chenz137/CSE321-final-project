
public class Dice {
	
	private int num;
	public boolean hold;
	
	public Dice() {
		num = (int) ((Math.random() * 6) + 1);
		hold = false;
	}
	
	public void hold() {hold = true;}
	
	public void unHold() {hold = false;}
	
	public int roll() {
		if(!hold) num = (int) ((Math.random() * 6) + 1);
		return num;
	}
	
	public String toString() {
		return "" + num;
	}
}
