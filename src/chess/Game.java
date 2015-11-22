package chess;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Game extends JPanel implements ActionListener {

	GamePiece[][] pieces = new GamePiece[8][8];
	JButton[][] board = new JButton[8][8];
	String name;
	GamePiece firstPiece;
		
	public Game(String name) {
		pieces[0][0]=new Rook(new Location(0,0),Team.WHITE, pieces);
		System.out.println(pieces[0][0].location);
		pieces[7][0]=new Rook(new Location(7,0),Team.WHITE, pieces);
		pieces[0][7]=new Rook(new Location(0,7),Team.BLACK, pieces);
		pieces[7][7]=new Rook(new Location(7,7),Team.BLACK, pieces);
		
		pieces[1][0]=new Knight(new Location(1,0),Team.WHITE, pieces);
		pieces[6][0]=new Knight(new Location(6,0),Team.WHITE, pieces);
		pieces[1][7]=new Knight(new Location(1,7),Team.BLACK, pieces);
		pieces[6][7]=new Knight(new Location(6,7),Team.BLACK, pieces);
		
		pieces[2][0]=new Bishop(new Location(2,0),Team.WHITE, pieces);
		pieces[5][0]=new Bishop(new Location(5,0),Team.WHITE, pieces);
		pieces[2][7]=new Bishop(new Location(2,7),Team.BLACK, pieces);
		pieces[5][7]=new Bishop(new Location(5,7),Team.BLACK, pieces);
		
		pieces[3][0]=new Queen(new Location(3,0),Team.WHITE, pieces);
		pieces[3][7]=new Queen(new Location(3,7),Team.BLACK, pieces);
		
		pieces[4][0]=new King(new Location(4,0),Team.WHITE, pieces);
		pieces[4][7]=new King(new Location(4,7),Team.BLACK, pieces);
		
		for(int x = 0; x < pieces.length; x++){
			pieces[x][1]= new Pawn(new Location(x,1),Team.WHITE, pieces);
			pieces[x][6]= new Pawn(new Location(x,6),Team.BLACK, pieces);
		}			
		
		this.setLayout(new GridLayout(8,8,0,0));
		
		for(int y=0; y<board.length; y++) {
			for(int x=0; x<board.length; x++) {
				board[x][y] = new JButton();
				this.add(board[x][y]);
				if(x%2 == y%2)
					board[x][y].setBackground(Color.WHITE);
				else
					board[x][y].setBackground(Color.BLACK);
				board[x][y].addActionListener(this);
				if(pieces[x][y] != null) 
					board[x][y].setText(pieces[x][y].getImage());
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		for(int y=0; y<board.length; y++) {
			for(int x=0; x<board.length; x++) {
				if(e.getSource() == board[x][y]) {
					System.out.println(x + ", " + y);
					if(firstPiece == null && pieces[x][y] != null) {
						firstPiece = pieces[x][y];
						System.out.println(pieces[x][y].getImage()+" "+pieces[x][y].location);
						ArrayList<Location> moves = firstPiece.getMovements();
						for(Location i : moves){
							System.out.println(i);
						}
					} else {
						board[firstPiece.location.getX()][firstPiece.location.getY()].setText("");
						System.out.println(firstPiece.image+" "+firstPiece.location);
						ArrayList<Location> moves = firstPiece.getMovements();
						System.out.println("Desired Move "+new Location(x,y));
						System.out.print("Possible Moves ");
						for(Location l: moves){
							System.out.print(l +" ");
						}
						
						System.out.println();
						
						firstPiece.move(new Location(x,y));
						System.out.println("Moved to "+firstPiece.location);
						board[firstPiece.location.getX()][firstPiece.location.getY()].setText(firstPiece.getImage());
						firstPiece = null;
					}
				}
			}
		}
	}
}
