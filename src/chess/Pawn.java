package chess;

import java.util.ArrayList;

public class Pawn extends GamePiece {
    public Pawn(Location location, Team team) {
    	super(location, team, "P");
    }

    public ArrayList<Location> getMovements() {
	switch(team) {
	    ArrayList<Location> locations = new ArrayList<Location>();
	case 0:
	    if(location.y==1){
		locations.add(location.shift(0,2));
		locations.add(location.shift(0,1));
	    }
	    else{
		locations.add(location.shift(0,1));
	    }
	    break;
	case 1:
	    if(location.y==6){
		locations.add(location.shift(0,-2));
		locations.add(location.shift(0,-1));
	    }
	    else{
		locations.add(location.shift(0,-1));
	    }
	    break;
	}    
    }
    
    public void move(Location location){
	if(getMovements().contains(location))
	    super.location = location;
	else
	    throw new IllegalMoveException();
    }
}
