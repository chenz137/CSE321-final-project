package Yahtzee;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class GUI {
	public static Dice dice1;
	public static Dice dice2;
	public static Dice dice3;
	public static Dice dice4;
	public static Dice dice5;

	public static void main(String args[]) {
		makeGameBoard();
	}

	public static ArrayList<Dice> diceValues() {
		ArrayList <Dice> numList = new ArrayList<> ();
		numList.add(dice1);
		numList.add(dice2);
		numList.add(dice3);
		numList.add(dice4);
		numList.add(dice5);
		return numList;
	}
	
	public static void makeGameBoard() {
		// score board
		methods game = new methods();
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
		Dice dice1 = new Dice();
		dice1.dice.setLocation(255,700);
		
		Dice dice2 = new Dice();
		dice2.dice.setLocation(355,700);
		
		Dice dice3 = new Dice();
		dice3.dice.setLocation(455,700);
		
		Dice dice4 = new Dice();
		dice4.dice.setLocation(555,700);
		
		Dice dice5 = new Dice();
		dice5.dice.setLocation(655,700);

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
				dice1.roll();
				dice2.roll();
				dice3.roll();
				dice4.roll();
				dice5.roll();
			}
		});

		//Add Elements
		gui.add(dice1.dice);
		gui.add(dice2.dice);
		gui.add(dice3.dice);
		gui.add(dice4.dice);
		gui.add(dice5.dice);
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
