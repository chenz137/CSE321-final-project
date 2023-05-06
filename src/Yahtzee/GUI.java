package Yahtzee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class GUI {
	public static Dice dice1 = new Dice();
	public static Dice dice2 = new Dice();
	public static Dice dice3 = new Dice();
	public static Dice dice4 = new Dice();
	public static Dice dice5 = new Dice();
	public static int notice = -1;
	public static Map<String, Integer> scoreMap = new HashMap<>();

	public static JLabel noticeLabel = new JLabel("");

	public static void main(String args[]) {
		scoreMap.put("Ones", 0);
		scoreMap.put("Twos", 0);
		scoreMap.put("Threes", 0);
		scoreMap.put("Fours", 0);
		scoreMap.put("Fives", 0);
		scoreMap.put("Sixes", 0);
		scoreMap.put("Three of a Kind", 0);
		scoreMap.put("Four of a Kind", 0);
		scoreMap.put("Full House", 0);
		scoreMap.put("Small Straight", 0);
		scoreMap.put("Large Straight", 0);
		scoreMap.put("Yahtzee", 0);
		scoreMap.put("Chance", 0);

		startgame();
	}

	public static void startgame() {
		JFrame frame = new JFrame("Yahtzee");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 600);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.WHITE);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1000, 600);
		panel.setLayout(null);
		JLabel label = new JLabel("<html><p style='font-size:30px'> " + "Welcome to Yahtzee" + "</p></html>");
		label.setBounds(300, 100, 600, 100);

		JButton stratGame = new JButton();
		stratGame.setBounds(400, 300, 200, 50);
		stratGame.setText("Start Game");
		stratGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.repaint();
				makeGameBoard();
				frame.setVisible(false);
			}
		});

		panel.add(label);
		panel.add(stratGame);
		frame.add(panel);
	}

	public static void makeGameBoard() {
		//notice label
		noticeLabel.setBounds(350,400,500,30);
		noticeLabel.setBackground(Color.WHITE);
		
		// score board
		ArrayList <Dice> numList = new ArrayList<Dice>();

		//scoreCard button
		JButton isOnesButton = new JButton();
		isOnesButton.setBounds(50,450,150,50);
		isOnesButton.setText("Ones = 0");
		isOnesButton.setOpaque(false);
		isOnesButton.setContentAreaFilled(false);
		isOnesButton.setBorderPainted(false);
		isOnesButton.setFocusPainted(false);
		isOnesButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isOnesButton.setText("Ones = " + ScoreCard.Instance.getIsOnes());
				isOnesButton.setBackground(Color.LIGHT_GRAY);
				isOnesButton.setEnabled(false);
				isOnesButton.setOpaque(true);
				isOnesButton.setContentAreaFilled(true);
				isOnesButton.setBorderPainted(true);
				scoreMap.put("Ones", ScoreCard.Instance.getIsOnes());
			}
		});

		JButton isTwosButton = new JButton();
		isTwosButton.setBounds(200,450,150,50);
		isTwosButton.setText("Twos = 0");
		isTwosButton.setOpaque(false);
		isTwosButton.setContentAreaFilled(false);
		isTwosButton.setBorderPainted(false);
		isTwosButton.setFocusPainted(false);
		isTwosButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isTwosButton.setText("Twos = " + ScoreCard.Instance.getIsTwos());
				isTwosButton.setBackground(Color.LIGHT_GRAY);
				isTwosButton.setEnabled(false);
				isTwosButton.setOpaque(true);
				isTwosButton.setContentAreaFilled(true);
				isTwosButton.setBorderPainted(true);
				scoreMap.put("Twos", ScoreCard.Instance.getIsTwos());
			}
		});

		JButton isThreesButton = new JButton();
		isThreesButton.setBounds(350,450,150,50);
		isThreesButton.setText("Threes = 0");
		isThreesButton.setOpaque(false);
		isThreesButton.setContentAreaFilled(false);
		isThreesButton.setBorderPainted(false);
		isThreesButton.setFocusPainted(false);
		isThreesButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isThreesButton.setText("Threes = " + ScoreCard.Instance.getIsThrees());
				isThreesButton.setBackground(Color.LIGHT_GRAY);
				isThreesButton.setEnabled(false);
				isThreesButton.setOpaque(true);
				isThreesButton.setContentAreaFilled(true);
				isThreesButton.setBorderPainted(true);
				scoreMap.put("Threes", ScoreCard.Instance.getIsThrees());
			}
		});

		JButton isFoursButton = new JButton();
		isFoursButton.setBounds(500,450,150,50);
		isFoursButton.setText("Fours = 0");
		isFoursButton.setOpaque(false);
		isFoursButton.setContentAreaFilled(false);
		isFoursButton.setBorderPainted(false);
		isFoursButton.setFocusPainted(false);
		isFoursButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isFoursButton.setText("Fours = " + ScoreCard.Instance.getIsFours());
				isFoursButton.setBackground(Color.LIGHT_GRAY);
				isFoursButton.setEnabled(false);
				isFoursButton.setOpaque(true);
				isFoursButton.setContentAreaFilled(true);
				isFoursButton.setBorderPainted(true);
				scoreMap.put("Fours", ScoreCard.Instance.getIsFours());
			}
		});

		JButton isFivesButton = new JButton();
		isFivesButton.setBounds(650,450,150,50);
		isFivesButton.setText("Fives = 0");
		isFivesButton.setOpaque(false);
		isFivesButton.setContentAreaFilled(false);
		isFivesButton.setBorderPainted(false);
		isFivesButton.setFocusPainted(false);
		isFivesButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isFivesButton.setText("Fives = " + ScoreCard.Instance.getIsFives());
				isFivesButton.setBackground(Color.LIGHT_GRAY);
				isFivesButton.setEnabled(false);
				isFivesButton.setOpaque(true);
				isFivesButton.setContentAreaFilled(true);
				isFivesButton.setBorderPainted(true);
				scoreMap.put("Fives", ScoreCard.Instance.getIsFives());
			}
		});

		JButton isSixesButton = new JButton();
		isSixesButton.setBounds(800,450,150,50);
		isSixesButton.setText("Sixes = 0");
		isSixesButton.setOpaque(false);
		isSixesButton.setContentAreaFilled(false);
		isSixesButton.setBorderPainted(false);
		isSixesButton.setFocusPainted(false);
		isSixesButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isSixesButton.setText("Sixes = " + ScoreCard.Instance.getIsSixes());
				isSixesButton.setBackground(Color.LIGHT_GRAY);
				isSixesButton.setEnabled(false);
				isSixesButton.setOpaque(true);
				isSixesButton.setContentAreaFilled(true);
				isSixesButton.setBorderPainted(true);
				scoreMap.put("Sixes", ScoreCard.Instance.getIsSixes());
			}
		});

		JButton isThreeOfAKindButton = new JButton();
		isThreeOfAKindButton.setBounds(70,550,200,50);
		isThreeOfAKindButton.setText("Three of a kind = 0");
		isThreeOfAKindButton.setOpaque(false);
		isThreeOfAKindButton.setContentAreaFilled(false);
		isThreeOfAKindButton.setBorderPainted(false);
		isThreeOfAKindButton.setFocusPainted(false);
		isThreeOfAKindButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isThreeOfAKindButton.setText("Three of a kind = " + ScoreCard.Instance.getIsThreeOfAKind());
				isThreeOfAKindButton.setBackground(Color.LIGHT_GRAY);
				isThreeOfAKindButton.setEnabled(false);
				isThreeOfAKindButton.setOpaque(true);
				isThreeOfAKindButton.setContentAreaFilled(true);
				isThreeOfAKindButton.setBorderPainted(true);
				scoreMap.put("Three of a kind", ScoreCard.Instance.getIsThreeOfAKind());
			}
		});

		JButton isFourOfAKindButton = new JButton();
		isFourOfAKindButton.setBounds(290,550,200,50);
		isFourOfAKindButton.setText("Four of a kind = 0");
		isFourOfAKindButton.setOpaque(false);
		isFourOfAKindButton.setContentAreaFilled(false);
		isFourOfAKindButton.setBorderPainted(false);
		isFourOfAKindButton.setFocusPainted(false);
		isFourOfAKindButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isFourOfAKindButton.setText("Four of a kind = " + ScoreCard.Instance.getIsFourOfAKind());
				isFourOfAKindButton.setBackground(Color.LIGHT_GRAY);
				isFourOfAKindButton.setEnabled(false);
				isFourOfAKindButton.setOpaque(true);
				isFourOfAKindButton.setContentAreaFilled(true);
				isFourOfAKindButton.setBorderPainted(true);
				scoreMap.put("Four of a kind", ScoreCard.Instance.getIsFourOfAKind());
			}
		});

		JButton isFullHouseButton = new JButton();
		isFullHouseButton.setBounds(490,550,200,50);
		isFullHouseButton.setText("Full House = 0");
		isFullHouseButton.setOpaque(false);
		isFullHouseButton.setContentAreaFilled(false);
		isFullHouseButton.setBorderPainted(false);
		isFullHouseButton.setFocusPainted(false);
		isFullHouseButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isFullHouseButton.setText("Full House = " + ScoreCard.Instance.getIsFullHouse());
				isFullHouseButton.setBackground(Color.LIGHT_GRAY);
				isFullHouseButton.setEnabled(false);
				isFullHouseButton.setOpaque(true);
				isFullHouseButton.setContentAreaFilled(true);
				isFullHouseButton.setBorderPainted(true);
				scoreMap.put("Full House", ScoreCard.Instance.getIsFullHouse());
			}
		});

		JButton isSmallStraightButton = new JButton();
		isSmallStraightButton.setBounds(690,550,200,50);
		isSmallStraightButton.setText("Small Straight = 0");
		isSmallStraightButton.setOpaque(false);
		isSmallStraightButton.setContentAreaFilled(false);
		isSmallStraightButton.setBorderPainted(false);
		isSmallStraightButton.setFocusPainted(false);
		isSmallStraightButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isSmallStraightButton.setText("Small Straight = " + ScoreCard.Instance.getIsSmallStraight());
				isSmallStraightButton.setBackground(Color.LIGHT_GRAY);
				isSmallStraightButton.setEnabled(false);
				isSmallStraightButton.setOpaque(true);
				isSmallStraightButton.setContentAreaFilled(true);
				isSmallStraightButton.setBorderPainted(true);
				scoreMap.put("Small Straight", ScoreCard.Instance.getIsSmallStraight());
			}
		});

		JButton isLargeStraightButton = new JButton();
		isLargeStraightButton.setBounds(70,650,200,50);
		isLargeStraightButton.setText("Large Straight = 0");
		isLargeStraightButton.setOpaque(false);
		isLargeStraightButton.setContentAreaFilled(false);
		isLargeStraightButton.setBorderPainted(false);
		isLargeStraightButton.setFocusPainted(false);
		isLargeStraightButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isLargeStraightButton.setText("Large Straight = " + ScoreCard.Instance.getIsLargeStraight());
				isLargeStraightButton.setBackground(Color.LIGHT_GRAY);
				isLargeStraightButton.setEnabled(false);
				isLargeStraightButton.setOpaque(true);
				isLargeStraightButton.setContentAreaFilled(true);
				isLargeStraightButton.setBorderPainted(true);
				scoreMap.put("Large Straight", ScoreCard.Instance.getIsLargeStraight());
			}
		});

		JButton isYahtzeeButton = new JButton();
		isYahtzeeButton.setBounds(290,650,200,50);
		isYahtzeeButton.setText("Yahtzee = 0");
		isYahtzeeButton.setOpaque(false);
		isYahtzeeButton.setContentAreaFilled(false);
		isYahtzeeButton.setBorderPainted(false);
		isYahtzeeButton.setFocusPainted(false);
		isYahtzeeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isYahtzeeButton.setText("Yahtzee = " + ScoreCard.Instance.getIsYahtzee());
				isYahtzeeButton.setBackground(Color.LIGHT_GRAY);
				isYahtzeeButton.setEnabled(false);
				isYahtzeeButton.setOpaque(true);
				isYahtzeeButton.setContentAreaFilled(true);
				isYahtzeeButton.setBorderPainted(true);
				logic.isYahtzeeBonus = true;
				scoreMap.put("Yahtzee", ScoreCard.Instance.getIsYahtzee());
			}
		});

		JButton isChanceButton = new JButton();
		isChanceButton.setBounds(490,650,200,50);
		isChanceButton.setText("Chance = 0");
		isChanceButton.setOpaque(false);
		isChanceButton.setContentAreaFilled(false);
		isChanceButton.setBorderPainted(false);
		isChanceButton.setFocusPainted(false);
		isChanceButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isChanceButton.setText("Chance = " + ScoreCard.Instance.getIsChance());
				isChanceButton.setBackground(Color.LIGHT_GRAY);
				isChanceButton.setEnabled(false);
				isChanceButton.setOpaque(true);
				isChanceButton.setContentAreaFilled(true);
				isChanceButton.setBorderPainted(true);
				scoreMap.put("Chance", ScoreCard.Instance.getIsChance());
			}
		});
		
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

		JLabel round = new JLabel("<html><p style='font-size:20px'>" + ScoreCard.Instance.getGameRound() + "</p></html>");
		round.setBounds(450,150,200,40);

		//Roll Button
		JButton roll = new JButton("Roll!");
		roll.setBounds(430,350,150,40);
		roll.setFocusPainted(false);
		roll.setBackground(Color.CYAN);
		roll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dice1.roll();
				dice2.roll();
				dice3.roll();
				dice4.roll();
				dice5.roll();

				numList.clear();
				numList.add(dice1);
				numList.add(dice2);
				numList.add(dice3);
				numList.add(dice4);
				numList.add(dice5);

				if (notice % 3 == 0) {
					noticeLabel.setText("<html><p style='font-size:15px'> This is the last roll in this round! </p></html>");
					dice1.unHold();
					dice2.unHold();
					dice3.unHold();
					dice4.unHold();
					dice5.unHold();
					roll.setText("Start Next Round!");
					notice = 1;
				}
				else {
					noticeLabel.setText("");
					roll.setText("Roll!");
					notice++;
				}

				ScoreCard.Instance.Round();
				round.setText("<html><p style='font-size:20px'>" + ScoreCard.Instance.getGameRound() + "</p></html>");

				ScoreCard.Instance.scoreCheck(numList);

				if (scoreMap.get("Ones") != 0) {
					isOnesButton.setText("Ones = " + scoreMap.get("Ones"));
				} else {
					isOnesButton.setText("Ones = " + ScoreCard.Instance.getIsOnes());
				}
				if (scoreMap.get("Twos") != 0) {
					isTwosButton.setText("Twos = " + scoreMap.get("Twos"));
				} else {
					isTwosButton.setText("Twos = " + ScoreCard.Instance.getIsTwos());
				}
				if (scoreMap.get("Threes") != 0) {
					isThreesButton.setText("Threes = " + scoreMap.get("Threes"));
				} else {
					isThreesButton.setText("Threes = " + ScoreCard.Instance.getIsThrees());
				}
				if (scoreMap.get("Fours") != 0) {
					isFoursButton.setText("Fours = " + scoreMap.get("Fours"));
				} else {
					isFoursButton.setText("Fours = " + ScoreCard.Instance.getIsFours());
				}
				if (scoreMap.get("Fives") != 0) {
					isFivesButton.setText("Fives = " + scoreMap.get("Fives"));
				} else {
					isFivesButton.setText("Fives = " + ScoreCard.Instance.getIsFives());
				}
				if (scoreMap.get("Sixes") != 0) {
					isSixesButton.setText("Sixes = " + scoreMap.get("Sixes"));
				} else {
					isSixesButton.setText("Sixes = " + ScoreCard.Instance.getIsSixes());
				}
				if (scoreMap.get("Three of a Kind") != 0) {
					isThreeOfAKindButton.setText("Three of a Kind = " + scoreMap.get("Three of a Kind"));
				} else {
					isThreeOfAKindButton.setText("Three of a Kind = " + ScoreCard.Instance.getIsThreeOfAKind());
				}
				if (scoreMap.get("Four of a Kind") != 0) {
					isFourOfAKindButton.setText("Four of a Kind = " + scoreMap.get("Four of a Kind"));
				} else {
					isFourOfAKindButton.setText("Four of a Kind = " + ScoreCard.Instance.getIsFourOfAKind());
				}
				if (scoreMap.get("Full House") != 0) {
					isFullHouseButton.setText("Full House = " + scoreMap.get("Full House"));
				} else {
					isFullHouseButton.setText("Full House = " + ScoreCard.Instance.getIsFullHouse());
				}
				if (scoreMap.get("Small Straight") != 0) {
					isSmallStraightButton.setText("Small Straight = " + scoreMap.get("Small Straight"));
				} else {
					isSmallStraightButton.setText("Small Straight = " + ScoreCard.Instance.getIsSmallStraight());
				}
				if (scoreMap.get("Large Straight") != 0) {
					isLargeStraightButton.setText("Large Straight = " + scoreMap.get("Large Straight"));
				} else {
					isLargeStraightButton.setText("Large Straight = " + ScoreCard.Instance.getIsLargeStraight());
				}
				if (scoreMap.get("Yahtzee") != 0) {
					isYahtzeeButton.setText("Yahtzee = " + scoreMap.get("Yahtzee"));
				} else {
					isYahtzeeButton.setText("Yahtzee = " + ScoreCard.Instance.getIsYahtzee());
				}
				if (scoreMap.get("Chance") != 0) {
					isChanceButton.setText("Chance = " + scoreMap.get("Chance"));
				} else {
					isChanceButton.setText("Chance = " + ScoreCard.Instance.getIsChance());
				}


				if (ScoreCard.Instance.round == 14) {
					JFrame gameOver = new JFrame();
					JPanel gameOverPanel = new JPanel();
					gameOverPanel.setLayout(null);
					String end = " Game Over! Your score is : " + ScoreCard.Instance.getIsGrandTotal();
					JLabel over = new JLabel("<html><p style='font-size:30px'>  " + end + " </p></html>");
					over.setBounds(10, 200, 800, 300);


					JButton newGame = new JButton("Start New Game");
					newGame.setBounds(150, 400, 300, 100);
					gui.setVisible(false);
					newGame.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							ScoreCard.Instance.round = 1;
							makeGameBoard();
							gameOver.setVisible(false);
						}
					});

					gameOverPanel.add(over);
					gameOverPanel.add(newGame);
					gameOver.add(gameOverPanel);
					gameOver.setSize(600, 800);
					gameOver.setResizable(false);
					gameOver.setLocationRelativeTo(gui);
					gameOver.setVisible(true);
					gameOver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}
		});


		//Add Elements
		gui.add(noticeLabel);
		gui.add(dice1.dice);
		gui.add(dice2.dice);
		gui.add(dice3.dice);
		gui.add(dice4.dice);
		gui.add(dice5.dice);
		gui.add(roll);
		gui.add(isOnesButton);
		gui.add(isTwosButton);
		gui.add(isThreesButton);
		gui.add(isFoursButton);
		gui.add(isFivesButton);
		gui.add(isSixesButton);
		gui.add(isThreeOfAKindButton);
		gui.add(isFourOfAKindButton);
		gui.add(isFullHouseButton);
		gui.add(isSmallStraightButton);
		gui.add(isLargeStraightButton);
		gui.add(isYahtzeeButton);
		gui.add(isChanceButton);


		//Make the Background
		JPanel p = new JPanel();
		p.setBackground(Color.LIGHT_GRAY);
		gui.add(yahtzee);
		gui.add(round);
		gui.add(p);
		
		gui.setSize(1000,1000);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setResizable(false);
		gui.setVisible(true);
	}
}
