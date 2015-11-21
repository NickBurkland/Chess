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
	//EDGE OF BOARD
	int e = pieces.length-1;

	//Create Pawns
	for(int i = 0; i < pieces.length/2; i++){		
	    peices[i][1] = new Pawn(new Location(i,1), 0, peices);
	    pieces[pieces.length-1-i][1] = new Pawn(new Location(e-i,1),0, peices);
	    pieces[i][e-1] = new Pawn(new Location(i,e-1), 1,peices);
	    pieces[e-i][e-1] = new Pawn(new Location(e-i,e-1),1,peices);
	}

	//Create Rooks
	peices[0][0] = new Rook(new Location(0,0), 0, peices);
	pieces[e][0] = new Rook(new Location(e,0),0, peices);
	pieces[0][e] = new Rook(new Location(0,e), 1,peices);
	pieces[e][e] = new Rook(new Location(e,e),1,peices);

	//Creeate Knights
	peices[1][0] = new Knight(new Location(1,0), 0, peices);
	pieces[e-1][0] = new Knight(new Location(e-1,0),0, peices);
	pieces[1][e] = new Knight(new Location(1,e), 1,peices);
	pieces[e-1][e] = new Knight(new Location(e-1,e),1,peices);

	//Create Bishops
	peices[2][0] = new Bishop(new Location(2,0), 0, peices);
	pieces[e-2][0] = new Bishop(new Location(e-2,0),0, peices);
	pieces[2][e] = new Bishop(new Location(2,e), 1,peices);
	pieces[e-2][e] = new Bishop(new Location(e-2,e),1,peices);
	    
	//Create Queens
	peices[3][0] = new Queen(new Location(3,0), 0, peices);
	pieces[3][e] = new Queen(new Location(3,e), 1,peices);
	    
	//Create Kings
	peices[4][0] = new King(new Location(4,0), 0, peices);
	pieces[4][e] = new King(new Location(4,e), 1,peices);
	    
    }
	
    public void actionPerformed(ActionEvent e) {
	
    }

}
