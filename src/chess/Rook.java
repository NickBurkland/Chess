package chess;

import java.util.ArrayList;

public class Rook extends GamePiece {

	public Rook(Location location, Team team) {
		super(location, team);
		
	}
	
	public void move(Location l) {

	}

	public ArrayList<Location> getMovements() {
		ArrayList<Location>  moves = new ArrayList<Location>();
		
		for(int i=1; i<8; i++) {
			int n = location+i;
			int e = location
			
			if()
		}
		return moves;
	}

}
