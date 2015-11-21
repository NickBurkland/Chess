package chess;

public abstract class GamePeice {
    protected Location location;
    protected boolean alive = true;
    protected Team team;
    protected String image;
    protected GamePeice[];
    protected Team opp;
	
    public GamePeice(Location location, Team team, String image, GamePeice[] peices) {
	super();
	this.location = location;
	this.team = team;
	this.image = image;
	this.peices = peieces;

	if(this.team == Team.BLACK)
	    this.opp = Team.WHITE;
	else
	    this.opp = Team.BLACK;
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
