package chess;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pawn extends GamePiece{
    public Pawn(Location location, Team team, GamePiece [][] pieces){
    	super(location, team, "P", pieces);
    }

    public ArrayList<Location> getMovements() {
	ArrayList<Location> locations = new ArrayList<Location>();
	switch(team.ordinal()) {
	case 1:	
	    //Move forward one square
	    Location lo = location.shift(0,1);
	   
	    if(pieces[lo.getX()][lo.getY()]==null){
		locations.add(lo);
		lo = location.shift(0,2);
		if(pieces[lo.getX()][lo.getY()]==null&&location.getY()==1)
		    locations.add(lo);
	    }

	    //kill piece diagonal right
	    lo =location.shift(1,1); 
	    if(lo.getX()<pieces.length&&pieces[lo.getX()][lo.getY()]!=null&&pieces[lo.getX()][lo.getY()].getTeam()==this.opp)
		locations.add(lo);
	
	    //kill piece diagonal left
	    lo =location.shift(-1,1); 
	    if(lo.getX()>=0&&pieces[lo.getX()][lo.getY()]!=null&&pieces[lo.getX()][lo.getY()].getTeam()==this.opp)
		locations.add(lo);	    
	    break;
	case 0:
	    //Move forward one square
	    Location o = location.shift(0,-1);
	    
	    if(pieces[o.getX()][o.getY()]==null){
		locations.add(o);
		lo = location.shift(0,-2);
		if(pieces[o.getX()][o.getY()]==null&&location.getY()==6)
		    locations.add(lo);
	    }
	    
	    //kill piece diagonal right
	    lo =location.shift(1,-1); 
	    if(lo.getX()<pieces.length&&pieces[lo.getX()][lo.getY()]!=null&&pieces[lo.getX()][lo.getY()].getTeam()==this.opp)
		locations.add(lo);
	    
	    //kill piece diagonal left
	    lo =location.shift(-1,-1); 
	    if(lo.getX()>0&&pieces[lo.getX()][lo.getY()]!=null&&pieces[lo.getX()][lo.getY()].getTeam()==this.opp)
		locations.add(lo);
	    break;
	}
	return locations;
    }

    public void move(Location location){
	if(getMovements().contains(location)){
	    this.location = location;
	    pieces[location.getX()][location.getY()]=this;
	}
	else
	    JOptionPane.showMessageDialog(null, "Illegal Move");
    }
}
