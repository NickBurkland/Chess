package chess;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Game extends JPanel implements ActionListener {

	GamePeice[][] peices = new GamePeice[8][8];
	JButton[][] board = new JButton[8][8];
	String name;
	
	
	
	public Game(String name) {
		
	}
	
	public void actionPerformed(ActionEvent e) {
	
	}

}
