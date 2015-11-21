package chess;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements ActionListener {

	Game g = new Game("game1");
	JPanel p = new JPanel(new BorderLayout());
	
	JMenuBar m = new JMenuBar();
		JMenu file = new JMenu("File");
			JMenuItem newF = new JMenuItem("New");
			JMenuItem openF = new JMenuItem("Open");
			JMenuItem saveF = new JMenuItem("Save");
			JMenuItem exitF = new JMenuItem("Exit");
		JMenu game = new JMenu("Game");
	
	public MainFrame() {
		setBounds(0,0,500,500);
		setTitle("Chess");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		this.setJMenuBar(m);
			m.add(file);
				file.add(newF);newF.addActionListener(this);
				file.add(openF);openF.addActionListener(this);
				file.add(saveF);saveF.addActionListener(this);
				file.addSeparator();
				file.add(exitF);exitF.addActionListener(this);
			m.add(game);
			
		this.add(p);
		p.add(g);
			
		revalidate();
	}
		
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		
		if(action.equals("New")) {
			
		} else if(action.equals("Open")) {
			
		} else if(action.equals("Save")) {
			
		} else if(action.equals("Exit")) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
