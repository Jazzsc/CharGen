package charGen;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

//import javax.swing.text.*;
import javax.swing.AbstractAction;
import javax.swing.border.Border;

public class gui3 implements ActionListener {
	charGen charStart;
	JButton genB;
	JFrame main;
	JPanel pane;
	JPanel mainPane;

	// Titles
	JLabel dnd;
	JLabel charDet;
	JLabel statsLabel;
	// Character
	JPanel charPane;
	JPanel racejobbg;
	JPanel statsPane;
	JPanel statsSpine;
	
	String race;
	JLabel raceL;
	JTextField raceT;
	String job;
	JLabel jobL;
	JTextField jobT;
	String bg;
	JLabel bgL;
	JTextField bgT;
	// JTextArea bgA;
	String persona;
	JLabel personaL;
	// JTextField personaT;
	JTextArea personaA;
	String ideal;
	JLabel idealL;
	// JTextField idealT;
	JTextArea idealA;
	String bond;
	JLabel bondL;
	// JTextField bondT;
	JTextArea bondA;
	String flaw;
	JLabel flawL;
	// JTextField flawT;
	JTextArea flawA;
	
	// Stats
	JLabel strL,dexL,conL,intL,wisL,chaL;
	JLabel[] statsL = {strL,dexL,conL,intL,wisL,chaL};
	JTextField strA,dexA,conA,intA,wisA,chaA;
	JTextField[] statsA = {strA,dexA,conA,intA,wisA,chaA};

	public static void main(String[] args) {
		// charStart = new charGen();
		// charStart.run();
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new gui3();
				// createGUI();
			}
		});
	}

	private void createGUI() {
		// Create and set up the window.
		main = new JFrame("D&D Character Generator");
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set up panels
		pane = new JPanel(new GridBagLayout());
		Border blackline = BorderFactory.createLineBorder(Color.black);
		pane.setBorder(blackline);

		mainPane = new JPanel();
		mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.PAGE_AXIS));
		
		
		charPane = new JPanel(new GridBagLayout());
		charPane.setBorder(blackline);
		GridBagConstraints c = new GridBagConstraints();
		
		racejobbg = new JPanel(new GridLayout(6, 1));
		racejobbg.setBorder(blackline);
		
		statsPane = new JPanel(new GridBagLayout());
		statsPane.setBorder(blackline);
		
		statsSpine = new JPanel();
		statsSpine.setLayout(new BoxLayout(statsSpine, BoxLayout.PAGE_AXIS));

		// Labels and Buttons

		// Generate Button
		genB = new JButton("Generate");
		genB.addActionListener(this);
		genB.setAlignmentX(Component.CENTER_ALIGNMENT);

		// textField = new JTextField(20);
		
		// Generate Title
		dnd = new JLabel("D&D Character Generator", JLabel.CENTER);
		dnd.setAlignmentX(Component.CENTER_ALIGNMENT);
		charDet = new JLabel("Character", JLabel.CENTER);
		charDet.setAlignmentX(Component.CENTER_ALIGNMENT);
		statsLabel = new JLabel("Stats", JLabel.CENTER);
		statsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		// Race Job BG
		raceL = new JLabel("Race", JLabel.CENTER);
		raceT = new JTextField(10);
		raceT.setEditable(false);
		raceT.setHorizontalAlignment(JTextField.CENTER);

		jobL = new JLabel("Class", JLabel.CENTER);
		jobT = new JTextField(10);
		jobT.setEditable(false);
		jobT.setHorizontalAlignment(JTextField.CENTER);

		bgL = new JLabel("Background", JLabel.CENTER);
		bgT = new JTextField(10);
		bgT.setEditable(false);
		bgT.setHorizontalAlignment(JTextField.CENTER);
		
		
		// Pane, Personality, Ideals, Bonds and Flaws
		personaL = new JLabel("Personality: ", JLabel.RIGHT);
		personaA = new JTextArea(2, 40);
		personaA.setEditable(false);
		personaA.setLineWrap(true);
		personaA.setWrapStyleWord(true);

		idealL = new JLabel("Ideal: ", JLabel.RIGHT);
		idealA = new JTextArea(2, 40);
		idealA.setEditable(false);
		idealA.setLineWrap(true);
		idealA.setWrapStyleWord(true);

		bondL = new JLabel("Bond: ", JLabel.RIGHT);
		bondA = new JTextArea(2, 40);
		bondA.setEditable(false);
		bondA.setLineWrap(true);
		bondA.setWrapStyleWord(true);

		flawL = new JLabel("Flaw: ", JLabel.RIGHT);
		flawA = new JTextArea(2, 40);
		flawA.setEditable(false);
		flawA.setLineWrap(true);
		flawA.setWrapStyleWord(true);
		
		// Stats
		
		String[] statsS = {"STR","DEX","CON","INT","WIS","CHA"};
		for (int i = 0; i < statsL.length; i++){
			statsL[i] = new JLabel(statsS[i]);
		}
		for (int i = 0; i < statsA.length; i++){
			statsA[i] = new JTextField(2);
			statsA[i].setEditable(false);
			statsA[i].setHorizontalAlignment(JTextField.CENTER);
		}

		
		
		// Adding Components
		racejobbg.add(raceL);
		racejobbg.add(raceT);
		racejobbg.add(jobL);
		racejobbg.add(jobT);
		racejobbg.add(bgL);
		racejobbg.add(bgT);
		
		c.ipadx = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		charPane.add(racejobbg,c);
		
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 2;
		charPane.add(pane, c);
				
		c.gridx = 0;
		c.gridy = 0;
		pane.add(personaL, c);
		c.gridx = 1;
		c.gridy = 0;
		pane.add(personaA, c);
		c.gridx = 0;
		c.gridy = 1;
		pane.add(idealL, c);
		c.gridx = 1;
		c.gridy = 1;
		pane.add(idealA, c);
		c.gridx = 0;
		c.gridy = 2;
		pane.add(bondL, c);
		c.gridx = 1;
		c.gridy = 2;
		pane.add(bondA, c);
		c.gridx = 0;
		c.gridy = 3;
		pane.add(flawL, c);
		c.gridx = 1;
		c.gridy = 3;
		pane.add(flawA, c);
		
		c.gridx = 4;
		c.gridy = 0;
		c.gridwidth = 1;
		c.ipadx = 20;
		c.insets = new Insets(0,15,0,0); 
		charPane.add(statsSpine,c);
		c.insets = new Insets(0,0,0,0); 
		
		statsSpine.add(statsLabel);
		statsSpine.add(statsPane);

		c.ipadx = 10;
		c.gridx = 0;
		c.gridy = 0;
		
		/*
		int tempPos = 0;
		for (JLabel x:statsL){
			c.gridx = tempPos%2;
			c.gridy = tempPos/2;
			statsPane.add(x,c);
			tempPos++;
			
		}
		
		
		tempPos = 0;
		for (JTextField x:statsA){
			c.gridx = tempPos%2;
			c.gridy = tempPos/2+1;
			statsPane.add(x,c);
			tempPos++;
			
		}
		*/
		
		
		for (int i = 0; i<statsL.length; i++){
			c.gridx = i%2;
			if (i%2 == 0){
				c.gridy = i;
			} else{
				c.gridy = i-1;
			}
			statsPane.add(statsL[i],c);
			c.gridy = c.gridy + 1;
			statsPane.add(statsA[i],c);
			
		}
		
		

		
		
		

		mainPane.add(dnd);
		mainPane.add(charDet);
		mainPane.add(charPane);
		mainPane.add(genB);
		main.setContentPane(mainPane);

		// Display the window.
		main.pack();
		//main.setSize(699, 685);
		//main.setSize(699, 275);
		main.setSize(750, 275);
		main.setResizable(false);
		
		main.setVisible(true);

	}

	public gui3() {
		charStart = new charGen();
		createGUI();
	}

@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == genB) {
			// System.out.println("button pressed");
			race = charStart.raceSelect();
			raceT.setText(race);

			job = charStart.jobSelect();
			jobT.setText(job);

			bg = charStart.bgSelect(job);
			bgT.setText(bg);

			persona = charStart.personSelect(bg);
			personaA.setText(persona);

			ideal = charStart.idealSel(bg);
			idealA.setText(ideal);

			bond = charStart.bondSel(bg);
			bondA.setText(bond);

			flaw = charStart.flawSel(bg);
			flawA.setText(flaw);

		}
	}

}
