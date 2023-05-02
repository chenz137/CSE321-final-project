import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class GUI {
	
	public static int rollCount;
	public static Dice dice1 = new Dice();
	public static Dice dice2 = new Dice();
	public static Dice dice3 = new Dice();
	public static Dice dice4 = new Dice();
	public static Dice dice5 = new Dice();
	public ArrayList <Dice> numList;
	
	public static void main(String args[]) {
		makeGameBoard();
	}
	
	
	public static void makeGameBoard() {
		
		// score board
		rollCount=0;
		ScoreCard game = new ScoreCard();
		ArrayList <Dice> numList = new ArrayList<Dice>();
		String[] strs = game.toString().split("%n");
		GridLayout grid = new GridLayout(0,6);
		JPanel scoreCard = new JPanel();
		scoreCard.setLayout(grid);
		scoreCard.setBounds(50,400,950,400);
		for(String s: strs) {
			JLabel l = new JLabel(s);
			scoreCard.add(l);
		}
		scoreCard.setBackground(Color.LIGHT_GRAY);



		//Create Dice
		dice1.dice.setLocation(255,200);
		dice2.dice.setLocation(355,200);
		dice3.dice.setLocation(455,200);
		dice4.dice.setLocation(555,200);
		dice5.dice.setLocation(655,200);

		JFrame gui = new JFrame("Yahtzee");
		gui.setBackground(Color.LIGHT_GRAY);
		
		JLabel yahtzee = new JLabel("<html><p style='font-size:20px'> Yahtzee </p></html>");
		yahtzee.setBounds(450,50,100,40);

		JLabel round = new JLabel("<html><p style='font-size:20px'>" + game.getGameRound() + "</p></html>");
		round.setBounds(450,150,200,40);

		//Roll Button
		JButton roll = new JButton("Roll!");
		roll.setBounds(450,350,110,40);
		roll.setBackground(Color.CYAN);
		roll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dice1.roll();
				dice2.roll();
				dice3.roll();
				dice4.roll();
				dice5.roll();
				rollCount++;
				if(rollCount == 3) {
					numList.clear();
					numList.add(dice1);
					numList.add(dice2);
					numList.add(dice3);
					numList.add(dice4);
					numList.add(dice5);
					game.scoreCheck(numList);
					rollCount=0;
					if (game.Round()) {
						JFrame gameOver = new JFrame();
						JLabel over = new JLabel("<html><p style='font-size:60px'>GAME OVER</p></html>");
						gameOver.add(over);
						gameOver.setBounds(500,200,500,200);
						gameOver.setResizable(false);
						gameOver.setLocationRelativeTo(gui);
						gameOver.setVisible(true);
						gameOver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						gui.removeAll();
					}
					else {
					round.setText("<html><p style='font-size:20px'>" + game.getGameRound() + "</p></html>");
					scoreCard.removeAll();
					String[] strs = game.toString().split("%n");
					for(String s: strs) {
						JLabel l = new JLabel(s);
						scoreCard.add(l);
					}
					}
				}
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
		gui.add(round);
		gui.add(scoreCard);
		gui.add(p);
		
		gui.setSize(1000,1000);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setResizable(false);
		gui.setVisible(true);

	}
}
