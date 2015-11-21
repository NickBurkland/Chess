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

		peices[0][0]=new Rook(new Location(0,0),Team.WHITE, peices);
		peices[7][0]=new Rook(new Location(7,0),Team.WHITE, peices);
		peices[0][7]=new Rook(new Location(0,7),Team.BLACK, peices);
		peices[7][7]=new Rook(new Location(7,7),Team.BLACK, peices);
		
		peices[1][0]=new Knight(new Location(1,0),Team.WHITE, peices);
		peices[6][0]=new Knight(new Location(6,0),Team.WHITE, peices);
		peices[1][7]=new Knight(new Location(1,7),Team.BLACK, peices);
		peices[6][7]=new Knight(new Location(6,7),Team.BLACK, peices);
		
		peices[2][0]=new Bishop(new Location(2,0),Team.WHITE, peices);
		peices[5][0]=new Bishop(new Location(5,0),Team.WHITE, peices);
		peices[2][7]=new Bishop(new Location(2,7),Team.BLACK, peices);
		peices[5][7]=new Bishop(new Location(5,7),Team.BLACK, peices);
		
		peices[3][0]=new Queen(new Location(3,0),Team.WHITE, peices);
		peices[3][7]=new Queen(new Location(3,7),Team.BLACK, peices);
		
		peices[4][0]=new King(new Location(4,0),Team.WHITE, peices);
		peices[4][7]=new King(new Location(4,7),Team.BLACK, peices);
		
		for(int x = 0; x < peices.length; x++){
			peices[x][1]= new Pawn(new Location(x,1),Team.WHITE, peices);
			peices[x][6]= new Pawn(new Location(x,6),Team.BLACK, peices);
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
