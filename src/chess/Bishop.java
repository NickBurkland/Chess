package chess;

import java.util.ArrayList;

public class Bishop extends GamePiece {

	public Bishop(Location location, Team team, GamePiece[][] pieces) {
		super(location, team, "B", pieces);
	}

	public void move(Location l) {

	}

	public ArrayList<Location> getMovements() {
		return null;
	}

}
