package chess;

import java.util.ArrayList;

public abstract class GamePiece {

protected Location location;
    protected boolean alive = true;
    protected Team team;
    protected String image;
    protected Team opp;

    protected GamePiece[][] pieces;
	
    public GamePiece(Location location, Team team, String image, GamePiece[][] pieces) {
		super();
		this.location = location;
		this.team = team;
		this.image = image;
		this.pieces = pieces;
		
		if(this.team == Team.BLACK)
		    this.opp = Team.WHITE;
		else
		    this.opp = Team.BLACK;

    }
	
    public abstract void move(Location l);
	
    public abstract ArrayList<Location> getMovements();
	
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
