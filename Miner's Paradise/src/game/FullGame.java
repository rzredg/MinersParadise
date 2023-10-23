package game;
/*
 * Akaash Suresh
 * CSS 142 A
 *  
 * REQUIREMENTS: 
 * 1. Functional Decomposition: Uses multiple methods, all with comments 
 * 4. Branching with Selection Control Structures: Uses if/else's & switches
 * 5. File IO: Keeps a log of the results at the end of the game in a text file
 * 7. Using Multiple Classes: HW_Game, TitleScreenHandler, ChoiceHandler
 * 8. 1-D Arrays: Uses 1-D arrays as a data structure in the treasure methods
 * 10. Class Design using Constructors and Access Modifiers:
 *     Constructor is used, all instance variables are private with getters/setters
 */

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.io.*;

public class FullGame {
	
	private JFrame frame;
	private JPanel titlePanel, startButtonPanel, mainTextPanel, choiceButtonPanel;
	private JPanel playerPanel;
	private JLabel titleLabel, energyLabel, energyLabelNum, moneyLabel; 
	private JLabel moneyLabelNum;
	private Font titleFont = new Font("Serif", Font.BOLD, 64);
	private Font textFont = new Font("Monospace", Font.BOLD, 30);
	private Font digFont = new Font("Dialog", Font.BOLD, 64);
	private JButton playButton, digButton;
	private JTextArea mainTextArea;
	private Random rand = new Random();
	private int energy, money, randStage;
	private String stage;
	private TitleScreenHandler titleHandler = new TitleScreenHandler();
	private ChoiceHandler choiceHandler = new ChoiceHandler();
	
	//Methods to set and get every single instance variable for Requirement #10
	
	//returns frame
	public JFrame getFrame() {
		return frame;
	}
	
	//sets instance variable frame to the parameter frame
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	//returns titlePanel
	public JPanel getTitlePanel() {
		return titlePanel;
	}

	//sets instance variable titlePanel to the parameter titlePanel
	public void setTitlePanel(JPanel titlePanel) {
		this.titlePanel = titlePanel;
	}

	//returns startButtonPanel
	public JPanel getStartButtonPanel() {
		return startButtonPanel;
	}

	//sets instance variable startButtonPanel to the parameter startButtonPanel
	public void setStartButtonPanel(JPanel startButtonPanel) {
		this.startButtonPanel = startButtonPanel;
	}

	//returns mainTextPanel
	public JPanel getMainTextPanel() {
		return mainTextPanel;
	}

	//sets instance variable mainTextPanel to the parameter mainTextPanel
	public void setMainTextPanel(JPanel mainTextPanel) {
		this.mainTextPanel = mainTextPanel;
	}

	//returns choiceButtonPanel
	public JPanel getChoiceButtonPanel() {
		return choiceButtonPanel;
	}

	//sets instance variable choiceButtonPanel to the parameter choiceButtonPanel
	public void setChoiceButtonPanel(JPanel choiceButtonPanel) {
		this.choiceButtonPanel = choiceButtonPanel;
	}

	//returns playerPanel
	public JPanel getPlayerPanel() {
		return playerPanel;
	}

	//sets instance variable playerPanel to the parameter playerPanel
	public void setPlayerPanel(JPanel playerPanel) {
		this.playerPanel = playerPanel;
	}

	//returns titleLabel
	public JLabel getTitleLabel() {
		return titleLabel;
	}

	//sets instance variable titleLabel to the parameter titleLabel
	public void setTitleLabel(JLabel titleLabel) {
		this.titleLabel = titleLabel;
	}
	
	//returns energyLabel
	public JLabel getenergyLabel() {
		return energyLabel;
	}

	//sets instance variable energyLabel to the parameter energyLabel
	public void setenergyLabel(JLabel energyLabel) {
		this.energyLabel = energyLabel;
	}

	//returns energyLabelNum
	public JLabel getenergyLabelNum() {
		return energyLabelNum;
	}

	//sets instance variable energyLabelNum to the parameter energyLabelNum
	public void setenergyLabelNum(JLabel energyLabelNum) {
		this.energyLabelNum = energyLabelNum;
	}

	//returns moneyLabel
	public JLabel getMoneyLabel() {
		return moneyLabel;
	}

	//sets instance variable moneyLabel to the parameter moneyLabel
	public void setMoneyLabel(JLabel moneyLabel) {
		this.moneyLabel = moneyLabel;
	}

	//returns moneyLabelNum
	public JLabel getmoneyLabelNum() {
		return moneyLabelNum;
	}

	//sets instance variable moneyLabelNum to the parameter moneyLabelNum
	public void setmoneyLabelNum(JLabel moneyLabelNum) {
		this.moneyLabelNum = moneyLabelNum;
	}

	//returns titleFont
	public Font getTitleFont() {
		return titleFont;
	}

	//sets instance variable titleFont to the parameter titleFont
	public void setTitleFont(Font titleFont) {
		this.titleFont = titleFont;
	}

	//returns textFont
	public Font getTextFont() {
		return textFont;
	}

	//sets instance variable textFont to the parameter textFont
	public void setTextFont(Font textFont) {
		this.textFont = textFont;
	}

	//returns digFont
	public Font getDigFont() {
		return digFont;
	}

	//sets instance variable digFont to the parameter digFont
	public void setDigFont(Font digFont) {
		this.digFont = digFont;
	}

	//returns playButton
	public JButton getPlayButton() {
		return playButton;
	}

	//sets instance variable playButton to the parameter playButton
	public void setPlayButton(JButton playButton) {
		this.playButton = playButton;
	}

	//returns digButton
	public JButton getDigButton() {
		return digButton;
	}

	//sets instance variable digButton to the parameter digButton
	public void setDigButton(JButton digButton) {
		this.digButton = digButton;
	}

	//returns mainTextArea
	public JTextArea getMainTextArea() {
		return mainTextArea;
	}

	//sets instance variable mainTextArea to the parameter mainTextArea
	public void setMainTextArea(JTextArea mainTextArea) {
		this.mainTextArea = mainTextArea;
	}

	//returns energy
	public int getEnergy() {
		return energy;
	}

	//sets instance variable energy to the parameter energy
	public void setEnergy(int energy) {
		this.energy = energy;
	}

	//returns money
	public int getMoney() {
		return money;
	}

	//sets instance variable money to the parameter money
	public void setMoney(int money) {
		this.money = money;
	}

	//returns randStage
	public int getRandStage() {
		return randStage;
	}

	//sets instance variable randStage to the parameter randStage
	public void setRandStage(int randStage) {
		this.randStage = randStage;
	}

	//returns rand
	public Random getRand() {
		return rand;
	}

	//sets instance variable rand to the parameter rand
	public void setRand(Random rand) {
		this.rand = rand;
	}

	//returns stage
	public String getstage() {
		return stage;
	}

	//sets instance variable stage to the parameter stage
	public void setstage(String stage) {
		this.stage = stage;
	}

	//returns titleHandler
	public TitleScreenHandler getTitleHandler() {
		return titleHandler;
	}

	//sets instance variable titleHandler to the parameter titleHandler
	public void setTitleHandler(TitleScreenHandler titleHandler) {
		this.titleHandler = titleHandler;
	}
	
	//returns choiceHandler
	public ChoiceHandler getChoiceHandler() {
		return choiceHandler;
	}
	
	//sets instance variable choiceHandler to the parameter choiceHandler
	public void setChoiceHandler(ChoiceHandler choiceHandler) {
		this.choiceHandler = choiceHandler;
	}
	
	//Main method calls the HW_Game constructor
	public static void main(String[] args) {
		
		new FullGame();
		
	}
	
	//CONSTRUCTOR: Creates the main window and title screen for the game
	public FullGame() {
		frame = new JFrame();
		frame.setSize(1000, 800);
		frame.setTitle("Akaash's Clicker RPG");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.RED.darker().darker());
		frame.setLayout(null);
		frame.setLocationRelativeTo(null); //places window in center
		
		titlePanel = new JPanel();
		titlePanel.setBounds(175, 100, 600, 100);
		titlePanel.setBackground(Color.PINK.darker());
		frame.add(titlePanel);
		
		titleLabel = new JLabel("Miner's Paradise");
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setFont(titleFont);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(375, 500, 200, 100);
		startButtonPanel.setBackground(Color.RED);
		
		playButton = new JButton("PLAY");
		playButton.setBackground(Color.RED);
		playButton.setForeground(Color.WHITE);
		playButton.setFont(titleFont);
		playButton.addActionListener(titleHandler);
		playButton.setFocusPainted(false);
		
		startButtonPanel.add(playButton);
		titlePanel.add(titleLabel);
		frame.add(titlePanel);
		frame.add(startButtonPanel);
		
		frame.setVisible(true);
	}
	
	/* When called by the TitleScreenHandler class(occurs when 'PLAY' is clicked)
	   it creates the formatting for the main game, including the 'DIG' button */
	public void createGameScreen() {
		
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(200, 200, 600, 250);
		mainTextPanel.setBackground(Color.RED.darker().darker());
		frame.add(mainTextPanel);
		
		mainTextArea = new JTextArea("This is the main text area.");
		mainTextArea.setBounds(200, 200, 600, 250);
		mainTextArea.setBackground(Color.RED.darker().darker());
		mainTextArea.setForeground(Color.WHITE);
		mainTextArea.setFont(textFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(300, 450, 400, 200);
		choiceButtonPanel.setBackground(Color.RED.darker().darker());
		choiceButtonPanel.setLayout(new GridLayout(1, 1));
		frame.add(choiceButtonPanel);
		
		digButton = choiceButton("DIG");
		digButton.setActionCommand("dig"); 
	
		playerPanel = new JPanel();
		playerPanel.setBounds(175, 100, 700, 50);
		playerPanel.setBackground(Color.RED.darker().darker());
		playerPanel.setLayout(new GridLayout(1, 4));
		frame.add(playerPanel);
		
		createLabels();
		gameSetup();
	}
	
	//Creates the label, display, and format for the energy and money variables
	//Also breaks up the createGameScreen method into smaller chunks
	public void createLabels() {
		energyLabel = new JLabel("Energy:");
		energyLabel.setFont(textFont);
		energyLabel.setForeground(Color.WHITE);
		playerPanel.add(energyLabel);
		
		energyLabelNum = new JLabel();
		energyLabelNum.setFont(textFont);
		energyLabelNum.setForeground(Color.WHITE);
		playerPanel.add(energyLabelNum);
		
		moneyLabel = new JLabel("Money:");
		moneyLabel.setFont(textFont);
		moneyLabel.setForeground(Color.WHITE);
		playerPanel.add(moneyLabel);
		
		moneyLabelNum = new JLabel();
		moneyLabelNum.setFont(textFont);
		moneyLabelNum.setForeground(Color.WHITE);
		playerPanel.add(moneyLabelNum);
	}
	
	//Method that completely formats the 'DIG 'button, helps declutter code
	public JButton choiceButton(String text){
		JButton button;
        button = new JButton();
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFont(digFont);
        button.setText(text);
        button.setFocusPainted(false);
        button.addActionListener(choiceHandler); //activates ChoiceHandler class
        choiceButtonPanel.add(button);
        return button;
	}
	
	//Initializes main variables and sets their labels, then starts the game
	public void gameSetup() {
		 energy = 20;
		 money = 0;
		 moneyLabelNum.setText("$" + money);
		 energyLabelNum.setText(Integer.toString(energy));
		 surface();
	 }
	
	//Sets up the first stage of the game, the surface level
	public void surface() {
		 stage = "surface";
		 mainTextArea.setText("I'm at the surface of a mine, time to start digging!\n\n"
		 + "(Click the DIG button to progress)");
	}
	
	//Filler stage with no progress, hard-coded to be the stage right after surface
	public void nothing() {
		stage = "nothing";
		energy -= 1;
		energyLabelNum.setText(Integer.toString(energy));
		mainTextArea.setText("Doesn't look like there's anything here.\n"
				+ "I should dig deeper.");
	}
	
	//Gives players a challenge by taking away 3 energy and displays it on screen
	public void ouch() {
		stage = "ouch";
		energy -= 3;
		energyLabelNum.setText(Integer.toString(energy));
		mainTextArea.setText("OUCH! I slipped and fell on sharp rocks.\n"
				+ "I think I might have hit my head too.\n(-3 Energy)");
	}
	
	//A filler stage to make the game more balanced
	public void deeper() {
		stage = "deeper";
		energy -= 1;
		energyLabelNum.setText(Integer.toString(energy));
		mainTextArea.setText("I'm travelling deeper down the mine.\n"
				+ "Something smells kind of funny.");
	}
	
	//Another filler stage but with different text, adding depth to the game
	public void gravel() {
		stage = "gravel";
		energy -= 1;
		energyLabelNum.setText(Integer.toString(energy));
		mainTextArea.setText("Nothing here except sand and gravel.\n"
				+ "I should keep digging.");
	}
	
	/* The first treasure category, and also the least valuable one. 
	   Stores three different options in a 1-D array and picks one randomly.
	   The value of that option is then added to the money variable. */
	public void treasure1() {
		stage = "treasure1";	
		energy -= 1;
		energyLabelNum.setText(Integer.toString(energy));
		String[] treasureOptions = {"Clay", "Aluminum", "Lead"}; //1-D array
		int randTreasure = rand.nextInt(treasureOptions.length);
		String treasurePicked = "";
		
		for (int i = 0; i <= randTreasure; i++) {
			treasurePicked = treasureOptions[i]; 
		}
		
		if ("Clay".equals(treasurePicked)) {
			money += 5;
			mainTextArea.setText("You found Clay! \n\n"
					+ "(Can I even buy a sandwich with this?)");
		}
		else if ("Aluminum".equals(treasurePicked)) {
			money += 25;
			mainTextArea.setText("You found Aluminum! \n\n"
					+ "(At least it's a metal, but there's got to be better loot.)");
		}
		else if ("Lead".equals(treasurePicked)) {
			money += 50;
			mainTextArea.setText("You found Lead! \n\n"
					+ "(This won't poison me, right?)");
		}
		moneyLabelNum.setText("$" + money);

	}
	
	// The second treasure category, which is more valuable than the first. 
	// Follows same logic as the treasure1 method but with more possible money.
	public void treasure2() {
		stage = "treasure2";	
		energy -= 1;
		energyLabelNum.setText(Integer.toString(energy));
		String[] treasureOptions = {"Copper", "Zinc", "Nickel"}; //1-D array
		int randTreasure = rand.nextInt(treasureOptions.length);
		String treasurePicked = "";
		
		for (int i = 0; i <= randTreasure; i++) {
			treasurePicked = treasureOptions[i]; 
		}
		
		if ("Copper".equals(treasurePicked)) {
			money += 75;
			mainTextArea.setText("You found Copper! \n\n"
					+ "(I'm making some real progress now.)");
		}
		else if ("Zinc".equals(treasurePicked)) {
			money += 125;
			mainTextArea.setText("You found Zinc! \n\n"
					+ "(How do they put this stuff inside food?)");
		}
		else if ("Nickel".equals(treasurePicked)) {
			money += 200;
			mainTextArea.setText("You found Nickel!\n\n(Nickel for your thoughts?)");
		}
		moneyLabelNum.setText("$" + money);
	}
	
	// The third treasure category, which is more valuable than the second. 
	// Same logic as the other treasure methods but with more possible money.
	public void treasure3() {
		stage = "treasure3";
		energy -= 1;
		energyLabelNum.setText(Integer.toString(energy));
		String[] treasureOptions = {"Iron", "Platinum", "Gold"}; //1-D array
		int randTreasure = rand.nextInt(treasureOptions.length);
		String treasurePicked = "";
		
		for (int i = 0; i <= randTreasure; i++) {
			treasurePicked = treasureOptions[i]; 
		}
		
		if ("Iron".equals(treasurePicked)) {
			money += 300;
			mainTextArea.setText("You found Iron! \n\n"
					+ "(Well, this just cured my iron deficiency.)");
		}
		else if ("Platinum".equals(treasurePicked)) {
			money += 2000;
			mainTextArea.setText("You found Platinum!"
					+ "\n\n(This should sell for a HEFTY amount.)");
		}
		else if ("Gold".equals(treasurePicked)) {
			money += 5000;
			mainTextArea.setText("You found Gold!\n\n(GOLD. GOLD. GOLD. YES.)");
		}

		moneyLabelNum.setText("$" + money);
	}
	
	// The fourth treasure category, which is the rarest and most valuable one. 
	// Same logic as the other treasure methods but with more possible money.
	public void treasure4() {
		stage = "treasure4";
		energy -= 1;
		energyLabelNum.setText(Integer.toString(energy));
		String[] treasureOptions = {"Ruby", "Diamond", "Jadeite"}; //1-D array
		int randTreasure = rand.nextInt(treasureOptions.length);
		String treasurePicked = "";
		
		for (int i = 0; i <= randTreasure; i++) {
			treasurePicked = treasureOptions[i]; 
		}
		
		if ("Ruby".equals(treasurePicked)) {
			money += 10000;
			mainTextArea.setText("You found Ruby! \n\n"
					+ "(Someone's going to pay a premium for  this beauty.)");
		}
		else if ("Diamond".equals(treasurePicked)) {
			money += 30000;
			mainTextArea.setText("You found Diamonds! \n\n"
					+ "(DIAMONDS!!! I'm rich!!!!!)");
		}
		else if ("Jadeite".equals(treasurePicked)) {
			money += 50000;
			mainTextArea.setText("You found Jadeite! \n\n"
					+ "(How much could this ugly green rock be worth?)");
		}

		moneyLabelNum.setText("$" + money);
	}
	
	//Gives players an assist with a free turn and 3 extra energy and displays it
	public void rest() {
		stage = "rest";
		energy += 3;
		energyLabelNum.setText(Integer.toString(energy));
		mainTextArea.setText("This looks like a nice place to rest.\n\n"
				+ "(Ah, I needed that. I should get moving.)\n(+3 energy)");
	}
	
	/* When the energy variable is 0 or lower, this method is called in the
	   ChoiceHandler class, ending the game, setting up the end screen, 
	   and outputting the final result, on screen and in a file. */
	public void end() {
		stage = "end";
		
		PrintWriter outputStream = null;
		String moneyCollected = "You collected: $" + money;
		
		mainTextArea.setText("You ran out of energy! GAME OVER!\n"+moneyCollected
				+"\n\nYour winnings are stored in a text file.\nCan you do better?");
		digButton.setVisible(false);
		energyLabel.setVisible(false);
		energyLabelNum.setVisible(false);
		moneyLabel.setVisible(false);
		moneyLabelNum.setVisible(false);
		
		//Uses a try/catch block, writes the game result to a file and appends it
		try {
			outputStream = new PrintWriter(new FileOutputStream
					(new File("moneyCollectedLog.txt"), true));
			outputStream.println(moneyCollected);

		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		outputStream.close(); //closes PrintWriter stream after storing result
	}
	
	//Logic that randomizes outcomes, managed by a switch statement
	//Coded so that the "better" outcomes are less likely to occur 
	public void randomizeEvent() {
		
		randStage = rand.nextInt(20);
		
		switch (randStage) {
		case 0: ouch(); break;
		case 1: deeper(); break;
		case 2: treasure1(); break;
		case 3: treasure2(); break;
		case 4: treasure3(); break;
		case 5: treasure4(); break;   //Best outcome, % chance is 1/20
		case 6: gravel(); break;
		case 7: rest(); break;
		case 8: nothing(); break;
		case 9: treasure1(); break;
		case 10: deeper(); break;
		case 11: nothing(); break;
		case 12: gravel(); break;
		case 13: ouch(); break;
		case 14: rest(); break;
		case 15: treasure2(); break;
		case 16: treasure3(); break;
		case 17: treasure1(); break;
		case 18: treasure1(); break;
		case 19: treasure2(); break;
		
		}
	}
	
	//ActionListener class is used to perform a task when an action occurs
	//When the 'PLAY' button is pressed, the main game screen is set up
	public class TitleScreenHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			createGameScreen();
		}
	}
	
	/* ActionListener class is used to perform a task when an action occurs
	Uses a switch statement on stage, which has a set amount of cases it can be 
	Uses switch statements inside cases to do something when 'DIG' is clicked */
	public class ChoiceHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			String digClick = event.getActionCommand();
			
			switch(stage){
			
			case "surface":
				switch(digClick){
				case "dig": 
					nothing(); 
					break;
				}
				break;
				
			case "nothing":
				switch(digClick){
				case "dig":
					randStage = rand.nextInt(6);
					if(randStage == 0 || randStage == 1) {
						ouch();
					} 
					else if (randStage == 2 || randStage == 3 ) {
						deeper();
					}
					else if (randStage == 4 || randStage == 5) {
						treasure1();
					}
					if(energy < 1) {
						end();
					}
					break;
				}
				break;

			case "ouch":
				switch(digClick){
				case "dig": 
					randomizeEvent();
					if(energy < 1) {
						end();
					}
					break;
				}
				break;
				
			case "rest":
				switch(digClick){
				case "dig": 
					randomizeEvent();
					if(energy < 1) {
						end();
					}
					break;
				}
				break;
				
			case "deeper":
				switch(digClick){
				case "dig": 
					randomizeEvent();
					if(energy < 1) {
						end();
					}
					break;
				}
				break;
				
			case "treasure1":
				switch(digClick){
				case "dig": 
					randomizeEvent();
					if(energy < 1) {
						end();
					}
					break;
				}
				break;
				
			case "treasure2":
				switch(digClick){
				case "dig": 
					randomizeEvent(); 
					if(energy < 1) {
						end();
					}
					break;
				}
				break;
				
			case "treasure3":
				switch(digClick){
				case "dig": 
					randomizeEvent(); 
					if(energy < 1) {
						end();
					}
					break;
				}
				break;
				
			case "treasure4":
				switch(digClick){
				case "dig": 
					randomizeEvent(); 
					if(energy < 1) {
						end();
					}
					break;
				}
				break;
				
			case "gravel":
				switch(digClick){
				case "dig": 
					randomizeEvent(); 
					if(energy < 1) {
						end();
					}
					break;
				}
				break;
			}
			
		}
		
	}
	
}