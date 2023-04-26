
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
	public Dice d1;
	public Dice d2;
	public Dice d3;
	public Dice d4;
	public Dice d5;
	
	public static void main(String args[]) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		
		JFrame gui = new JFrame("Yahtzee");
		gui.setBackground(Color.LIGHT_GRAY);
		
		JLabel yahtzee = new JLabel("<html><p style='font-size:20px'> Yahtzee </p></html>");
		yahtzee.setBounds(200,50,100,40);
		
		
		//Create First Dice
		JButton db1 = new JButton(d1.toString());
		db1.setBounds(60,130,60,60);
		
		//First Hold Function
		JLabel h1 = new JLabel();
		h1.setBounds(60,90,30,60);
		db1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (d1.hold) {
					d1.unHold();
					h1.setText("");
				}
				else {
					d1.hold();
					h1.setText("Held");
				}
				
			}
			
		});
		
		
		//Create Second Dice
		JButton db2 = new JButton(d2.toString());
		db2.setBounds(140,130,60,60);
		
		//Second Hold Function
		JLabel h2 = new JLabel();
		h2.setBounds(140,90,30,60);
		db2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (d2.hold) {
					d2.unHold();
					h2.setText("");
				}
				else {
					d2.hold();
					h2.setText("Held");
				}
				
			}
			
		});
		
		
		//Create Third Dice
		JButton db3 = new JButton(d3.toString());
		db3.setBounds(220,130,60,60);
		
		//Third Hold Function
		JLabel h3 = new JLabel();
		h3.setBounds(220,90,30,60);
		db3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (d3.hold) {
					d3.unHold();
					h3.setText("");
				}
				else {
					d3.hold();
					h3.setText("Held");
				}
				
			}
			
		});
		
		
		//Create the Fourth Dice
		JButton db4 = new JButton(d4.toString());
		db4.setBounds(300,130,60,60);
		
		//Fourth Hold Function
		JLabel h4 = new JLabel();
		h4.setBounds(300,90,30,60);
		db4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (d4.hold) {
					d4.unHold();
					h4.setText("");
				}
				else {
					d4.hold();
					h4.setText("Held");
				}
			}
			
		});
		
		
		//Create the Fifth Dice
		JButton db5 = new JButton(d5.toString());
		db5.setBounds(380,130,60,60);
		
		//Fifth Hold Function
		JLabel h5 = new JLabel();
		h5.setBounds(380,90,30,60);
		db5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (d5.hold) {
					d5.unHold();
					h5.setText("");
				}
				else {
					d5.hold();
					h5.setText("Held");
				}
				
			}
			
		});
		
		
		
		//Roll Button
		JButton roll = new JButton("Roll!");
		roll.setBounds(200,240,100,20);
		roll.setBackground(Color.CYAN);
		roll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				d1.roll();
				d2.roll();
				d3.roll();
				d4.roll();
				d5.roll();
				db1.setText(d1.toString());
				db2.setText(d2.toString());
				db3.setText(d3.toString());
				db4.setText(d4.toString());
				db5.setText(d5.toString());
			}
		});
		
		//Add Elements
		gui.add(yahtzee);
		gui.add(db1);
		gui.add(h1);
		gui.add(db2);
		gui.add(h2);
		gui.add(db3);
		gui.add(h3);
		gui.add(db4);
		gui.add(h4);
		gui.add(db5);
		gui.add(h5);
		gui.add(roll);
		
		//Make the Background
		JPanel p = new JPanel();
		p.setBackground(Color.LIGHT_GRAY);
		gui.add(p);
		gui.setSize(500,350);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setResizable(false);
		gui.setVisible(true);

	}
}
