package charGen;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//import javax.swing.text.*;
import javax.swing.AbstractAction;

public class gui3 {
	charGen charStart;
	JButton genB;
	JFrame main;
	JPanel pane;
	JPanel mainPane;

	String race;
	JLabel raceL;
	JTextField raceT;
	String job;
	JLabel jobL;
	JTextField jobT;
	String bg;
	JLabel bgL;
	JTextField bgT;
	String persona;
	JLabel personaL;
	JTextField personaT;
	String ideal;
	JLabel idealL;
	JTextField idealT;
	String bond;
	JLabel bondL;
	JTextField bondT;
	String flaw;
	JLabel flawL;
	JTextField flawT;

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

		pane = new JPanel(new GridLayout(0, 2));

		mainPane = new JPanel();
		mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.PAGE_AXIS));

		// Labels and Buttons

		// Generate Button
		genB = new JButton("Generate");
		genB.addActionListener(new ButtonAction("Action"));

		
		raceL = new JLabel("Race: ", JLabel.RIGHT);
		raceT = new JTextField(25);
		raceT.setEditable(false);

		jobL = new JLabel("Class: ", JLabel.RIGHT);
		jobT = new JTextField(25);
		jobT.setEditable(false);

		bgL = new JLabel("Background: ", JLabel.RIGHT);
		bgT = new JTextField(25);
		bgT.setEditable(false);
		
		personaL = new JLabel("Personality: ", JLabel.RIGHT);
		personaT = new JTextField(25);
		personaT.setEditable(false);
		
		idealL = new JLabel("Ideal: ", JLabel.RIGHT);
		idealT = new JTextField(25);
		idealT.setEditable(false);
		
		bondL = new JLabel("Bond: ", JLabel.RIGHT);
		bondT = new JTextField(25);
		bondT.setEditable(false);
		
		flawL = new JLabel("Flaw: ", JLabel.RIGHT);
		flawT = new JTextField(25);
		flawT.setEditable(false);
		
		pane.add(raceL);
		pane.add(raceT);
		pane.add(jobL);
		pane.add(jobT);
		pane.add(bgL);
		pane.add(bgT);
		pane.add(personaL);
		pane.add(personaT);
		pane.add(idealL);
		pane.add(idealT);
		pane.add(bondL);
		pane.add(bondT);
		pane.add(flawL);
		pane.add(flawT);



		mainPane.add(genB);
		mainPane.add(pane);
		main.setContentPane(mainPane);

		// Display the window.
		main.pack();
		main.setVisible(true);

	}

	public gui3() {
		charStart = new charGen();
		createGUI();
	}

	private class ButtonAction extends AbstractAction {
		public ButtonAction(String name) {
			super(name);
			// putValue(MNEMONIC_KEY, mnemonic);
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
				personaT.setText(persona);
				
				ideal = charStart.idealSel(bg);
				idealT.setText(ideal);
				
				bond = charStart.bondSel(bg);
				bondT.setText(bond);
				
				flaw = charStart.flawSel(bg);
				flawT.setText(flaw);
				
				
			}
		}

	}

	public void actionPerformed(ActionEvent e) {

	}

}
