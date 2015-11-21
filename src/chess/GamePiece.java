package chess;

import java.util.ArrayList;

public abstract class GamePiece {
	protected Location location;
	protected boolean alive = true;
	protected Team team;
	Game game;
	
	public GamePiece(Location location, Team team, Game g) {
		super();
		this.location = location;
		this.team = team;
		game = g;
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
