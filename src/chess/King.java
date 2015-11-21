package chess;

import java.util.ArrayList;

public class King extends GamePiece {

	public King(Location location, Team team, GamePiece[] pieces) {
		super(location, team, "K", pieces);
	}

	public void move(Location l) {
		
	}

	public ArrayList<Location> getMovements() {
		return null;
	}

}
