package chess;

public abstract class GamePeice {
    protected Location location;
    protected boolean alive = true;
    protected Team team;
    protected String image;
	
    public GamePeice(Location location, Team team, String image) {
	super();
	this.location = location;
	this.team = team;
	this.image = image;
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
