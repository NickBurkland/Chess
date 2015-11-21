package chess;

public abstract class GamePeice {
	protected Location location;
	protected boolean alive = true;
	protected Team team;
	
	public GamePeice(Location location, Team team) {
		super();
		this.location = location;
		this.team = team;
	}
	
	public abstract void move(Location l);
	
	public abstract Location[] getMovements();
	
	public Team getTeam() {
		return team;
	}
	
	public void kill() {
		alive = false;
	}
}
