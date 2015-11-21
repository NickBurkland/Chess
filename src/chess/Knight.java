package chess;

import java.util.ArrayList;

public class Knight extends GamePiece {

	public Knight(Location location, Team team, GamePiece[][] pieces) {
		super(location, team, "K", pieces);
	}

	public void move(Location l) {
		
	}

	public ArrayList<Location> getMovements() {
		ArrayList<Location> moves = new ArrayList<Location>();
		
		return moves;
	}

}
