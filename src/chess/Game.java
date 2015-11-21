package chess;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Game extends JPanel implements ActionListener {

	GamePiece[][] pieces = new GamePiece[8][8];
	JButton[][] board = new JButton[8][8];
	String name;
	
	
	
	public Game(String name) {
		this.setLayout(new GridLayout(8,8,0,0));
		for(int y=0; y<board.length; y++) {
			for(int x=0; x<board.length; x++) {
				board[x][y] = new JButton();
				this.add(board[x][y]);
				if(x%2 == y%2)
					board[x][y].setText("W");
//					board[x][y].setBackground(Color.WHITE);
				else
					board[x][y].setText("B");
//					board[x][y].setBackground(Color.BLACK);
				board[x][y].addActionListener(this);
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		for(int y=0; y<board.length; y++) {
			for(int x=0; x<board.length; x++) {
				if(e.getSource() == board[x][y]) {
					// TODO
				}
			}
		}
	}
}
