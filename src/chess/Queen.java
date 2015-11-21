package chess;

import java.util.ArrayList;

public class Queen extends GamePiece {

	public Queen(Location location, Team team, GamePiece[] pieces) {
		super(location, team, "Q", pieces);
	}

	public void move(Location l) {

	}

	public ArrayList<Location> getMovements() {
		return null;
	}

}
