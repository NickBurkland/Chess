package chess;

public abstract class GamePiece {
    protected Location location;
    protected boolean alive = true;
    protected Team team;
    protected String image;
    protected GamePeice[];
	
    public GamePiece(Location location, Team team, String image, GamePeice[] peices) {
	super();
	this.location = location;
	this.team = team;
	this.image = image;
	this.peices = peieces;
    }
	
    public abstract void move(Location l);
	
    public abstract Location[] getMovements();
	
    public Team getTeam() {
	return team;
    }
	
    public void kill() {
	alive = false;
    }

    public String getImage(){
	return image;
    }
}
