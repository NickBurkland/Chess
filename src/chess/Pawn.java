package chess;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pawn extends GamePiece{
	public Pawn(Location location, Team team, GamePiece [] pieces){
		super(location, team, "P", pieces);
	}

	public ArrayList<Location> getMovements() {
		ArrayList<Location> locations = new ArrayList<Location>();
		switch(team.ordinal()) {
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
		return locations;
	}

	public void move(Location location){
		if(getMovements().contains(location))
			super.location = location;
		else
			JOptionPane.showMessageDialog(null, "Illegal Move");
	}
}
