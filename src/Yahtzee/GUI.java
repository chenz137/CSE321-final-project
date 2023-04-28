package Yahtzee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI {

	public static void main(String args[]) {
		makeGameBoard();
	}
	
	public static void makeGameBoard() {
		// score board
		scoreCard game = new scoreCard();
		String[] strs = game.toString().split("%n");
		GridLayout grid = new GridLayout(0,6);
		JPanel scoreCard = new JPanel();
		scoreCard.setLayout(grid);
		scoreCard.setBounds(30,100,950,400);
		for(String s: strs) {
			JLabel l = new JLabel(s);
			scoreCard.add(l);
		}
		scoreCard.setBackground(Color.LIGHT_GRAY);


		//Create Dice

		Yahtzee.scoreCard.dice1.dice.setLocation(255,700);
		Yahtzee.scoreCard.dice2.dice.setLocation(355,700);
		Yahtzee.scoreCard.dice3.dice.setLocation(455,700);
		Yahtzee.scoreCard.dice4.dice.setLocation(555,700);
		Yahtzee.scoreCard.dice5.dice.setLocation(655,700);

		JFrame gui = new JFrame("Yahtzee");
		gui.setBackground(Color.LIGHT_GRAY);
		
		JLabel yahtzee = new JLabel("<html><p style='font-size:20px'> Yahtzee </p></html>");
		yahtzee.setBounds(450,50,100,40);
		
		JLabel round = new JLabel("<html><p style='font-size:20px'>" + game.gameRound() + "</p></html>");
		round.setBounds(450,550,200,40);

		//Roll Button
		JButton roll = new JButton("Roll!");
		roll.setBounds(450,850,110,40);
		roll.setBackground(Color.CYAN);
		roll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Yahtzee.scoreCard.dice1.roll();
				Yahtzee.scoreCard.dice2.roll();
				Yahtzee.scoreCard.dice3.roll();
				Yahtzee.scoreCard.dice4.roll();
				Yahtzee.scoreCard.dice5.roll();
			}
		});

		//Add Elements
		gui.add(Yahtzee.scoreCard.dice1.dice);
		gui.add(Yahtzee.scoreCard.dice2.dice);
		gui.add(Yahtzee.scoreCard.dice3.dice);
		gui.add(Yahtzee.scoreCard.dice4.dice);
		gui.add(Yahtzee.scoreCard.dice5.dice);
		gui.add(roll);

		//Make the Background
		JPanel p = new JPanel();
		p.setBackground(Color.LIGHT_GRAY);
		gui.add(yahtzee);
		gui.add(scoreCard);
		gui.add(round);
		gui.add(p);
		gui.setSize(1000,1000);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setResizable(false);
		gui.setVisible(true);
		gui.setLocationRelativeTo(null);
	}
}
