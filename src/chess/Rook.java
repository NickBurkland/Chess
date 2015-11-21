package chess;

import java.util.ArrayList;

public class Rook extends GamePiece {

	public Rook(Location location, Team team, GamePiece[][] pieces) {
		super(location, team, "R", pieces);
		
	}
	
	public void move(Location l) {

	}

	public ArrayList<Location> getMovements() {
		ArrayList<Location>  moves = new ArrayList<Location>();
		
		for(int i=1; i<8; i++) {
			int n = location.getY()+i;
			int e = location.getX()+i;
			int s = location.getY()-i;
			int w = location.getX()-i;
			if(n>=0 && team!=pieces[location.getX()][location.getY()-n].getTeam());
		}
		return moves;
	}

}
