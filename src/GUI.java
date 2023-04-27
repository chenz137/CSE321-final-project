import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GUI {
	public Dice dice1;
	public Dice dice2;
	public Dice dice3;
	public Dice dice4;
	public Dice dice5;
	
	public static void main(String args[]) {
		makeScoreBoard();
		makeGameBoard();
	}
	
	public static void makeScoreBoard() {
		JFrame gui = new JFrame("Score Board");
		JLabel scoreBoard = new JLabel("<html><p style='font-size:20px'> Score Board </p></html>");
		scoreBoard.setBounds(175,25,150,40);
		JPanel p = new JPanel();
		p.setBackground(Color.LIGHT_GRAY);
		
		ScoreCard game = new ScoreCard();
		String[] strs = game.toString().split("%n");
		
		GridLayout grid = new GridLayout(0,2);
		JPanel scoreCard = new JPanel();
		scoreCard.setLayout(grid);
		
		for(String s: strs) {
			JLabel l = new JLabel(s);
			scoreCard.add(l);
			
		}
		
		scoreCard.setBackground(Color.WHITE);
		
		
		scoreCard.setBounds(12,100,476,565);
		gui.add(scoreBoard);
		gui.add(scoreCard);
		gui.add(p);
		gui.setSize(500,700);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setResizable(false);
		gui.setVisible(true);

	}
	
	public static void makeGameBoard() {
		//Create Dice
		Dice dice1 = new Dice();
		dice1.dice.setLocation(60,110);
		
		Dice dice2 = new Dice();
		dice2.dice.setLocation(140,110);
		
		Dice dice3 = new Dice();
		dice3.dice.setLocation(220,110);
		
		Dice dice4 = new Dice();
		dice4.dice.setLocation(300,110);
		
		Dice dice5 = new Dice();
		dice5.dice.setLocation(380,110);
		
		
		
		JFrame gui = new JFrame("Yahtzee");
		gui.setBackground(Color.LIGHT_GRAY);
		
		JLabel yahtzee = new JLabel("<html><p style='font-size:20px'> Yahtzee </p></html>");
		yahtzee.setBounds(200,50,100,40);
		
		
		
		
		//Roll Button
		JButton roll = new JButton("Roll!");
		roll.setBounds(200,240,100,20);
		roll.setBackground(Color.CYAN);
		roll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dice1.roll();
				dice2.roll();
				dice3.roll();
				dice4.roll();
				dice5.roll();
			}
		});
		
		//Add Elements
		gui.add(yahtzee);
		gui.add(dice1.dice);
		gui.add(dice2.dice);
		gui.add(dice3.dice);
		gui.add(dice4.dice);
		gui.add(dice5.dice);
		gui.add(roll);
		
		//Make the Background
		JPanel p = new JPanel();
		p.setBackground(Color.LIGHT_GRAY);
		gui.add(p);
		gui.setSize(500,350);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setResizable(false);
		gui.setVisible(true);
		gui.setLocationRelativeTo(null);
	}
}
