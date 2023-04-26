
public class Dice implements Comparable<Dice>{
	
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

	public int getValue() {
		return num;
	}

	@Override
	public int compareTo(Dice o) {
		return Integer.compare(this.getValue(), o.getValue());
	}

}
