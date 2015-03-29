import java.awt.*;
import java.awt.event.*;

public class gui extends Frame implements ActionListener, WindowListener{
	private Frame mainFrame;
	private Panel fillPanel;
	private Button btnGenerate;
	private TextField raceg;
	private TextField jobg;
	private TextField bgg;
	private TextArea persong;
	private TextArea idealg;
	private TextArea bondg;
	private TextArea flawg;
	private static charGen char1;
	private String race;
	private String job;
	private String bg;
	private String pers;
	private String ide;
	private String bond;
	private String flaw;

	public static void main(String[] args){
		new gui();
		char1 = new charGen();
	}

	public gui(){
		mainFrame = new Frame("D&D Character Generator");
		mainFrame.setSize(500,500);
		mainFrame.setLayout(new GridLayout(0,2));
		mainFrame.addWindowListener(this);
		fillPanel = new Panel();
		mainFrame.add(new Label("Generate your Character: "));
		btnGenerate = new Button("Generate");
		btnGenerate.addActionListener(this);
		mainFrame.add(btnGenerate);
		setTitle("D&D 5th Edition Character Generator");
		fillPanel.setLayout(new GridLayout(0,4));
		fillPanel.add(new Label("Race: "));
		raceg = new TextField(20);
		raceg.setEditable(false);
		fillPanel.add(raceg);
		fillPanel.add(new Label("Class: "));
		jobg = new TextField(20);
		jobg.setEditable(false);
		fillPanel.add(jobg);
		fillPanel.add(new Label("Background: "));
		bgg = new TextField(20);
		bgg.setEditable(false);
		fillPanel.add(bgg);
		fillPanel.add(new Label("Personality: "));
		persong = new TextArea("",5,20,TextArea.SCROLLBARS_NONE);
		persong.setEditable(false);
		fillPanel.add(persong);
		fillPanel.add(new Label("Ideal: "));
		idealg = new TextArea("",5,20,TextArea.SCROLLBARS_NONE);
		idealg.setEditable(false);
		fillPanel.add(idealg);
		fillPanel.add(new Label("Bond: "));
		bondg = new TextArea("",5,20,TextArea.SCROLLBARS_NONE);
		bondg.setEditable(false);
		fillPanel.add(bondg);
		fillPanel.add(new Label("Flaw: "));
		flawg = new TextArea("",5,20,TextArea.SCROLLBARS_NONE);
		flawg.setEditable(false);
		fillPanel.add(flawg);
		mainFrame.add(fillPanel);
		mainFrame.setVisible(true);
	}


	public void windowClosing(WindowEvent e) {
		System.exit(1);
	}
	public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btnGenerate){
			
			race = char1.raceSelect();
			raceg.setText(race);
			
			job = char1.jobSelect();
			jobg.setText(job);

			bg = char1.bgSelect(job);
			bgg.setText(bg);

			pers = char1.personSelect(bg);
			persong.setText(pers);

			ide = char1.idealSel(bg);
			idealg.setText(ide);

			bond = char1.bondSel(bg);
			bondg.setText(bond);

			flaw = char1.flawSel(bg);
			flawg.setText(flaw);

		}
	}
}