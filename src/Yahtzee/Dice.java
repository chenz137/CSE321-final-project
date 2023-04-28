package Yahtzee;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dice implements Comparable<Dice>{
	
	private int num;
	public boolean hold;
	public JPanel dice;
	private JButton button;
	private JLabel head;
	
	
	public Dice() {
		num = (int) ((Math.random() * 6) + 1);
		hold = false;
		
		makeGraphic();
	}
	
	public void makeGraphic() {	
		dice = new JPanel();
		dice.setBackground(Color.LIGHT_GRAY);
		dice.setLayout(null);
		dice.setSize(250,150);
		button = new JButton(num + "");
		button.setBounds(0,15,100,100);
		//button.setBorderPainted(false);
		head = new JLabel(" ");
		head.setBounds(21,0,70,20);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (hold) {
					unHold();
					head.setText(" ");
				}
				else {
					hold();
					head.setText("Held");
				}
				
			}
			
		});
		dice.add(head);
		dice.add(button);
	}
	
	public void hold() {hold = true;}
	
	public void unHold() {hold = false;}
	
	public int roll() {

		if(!hold) num = (int) ((Math.random() * 6) + 1);
		button.setText(num + "");
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

