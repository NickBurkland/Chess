package chess;

import java.util.ArrayList;

public abstract class GamePiece {
	protected Location location;
	protected boolean alive = true;
	protected Team team;
	
	public GamePiece(Location location, Team team) {
		super();
		this.location = location;
		this.team = team;
	}
	
	public abstract void move(Location l);
	
	public abstract ArrayList<Location> getMovements();
	
	public Team getTeam() {
		return team;
	}
	
	public void kill() {
		alive = false;
	}
}
