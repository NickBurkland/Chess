package chess;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public abstract class GamePiece {

	protected Location location;
	protected Team team;
	protected String image;
	protected Team opp;
	protected GamePiece[][] pieces;

	public GamePiece(Location location, Team team, String image, GamePiece[][] pieces) {
		this.location = location;
		this.team = team;
		this.image = image;
		this.pieces = pieces;

		if(this.team == Team.BLACK)
			this.opp = Team.WHITE;
		else
			this.opp = Team.BLACK;

	}

	public void move(Location l){
		if(getMovements().contains(l)){
			pieces[location.getX()][location.getY()]=null;
			this.location = l;
			pieces[l.getX()][l.getY()]=this;
		}else
			JOptionPane.showMessageDialog(null, "Illegal Move");
	}

	public abstract ArrayList<Location> getMovements();

	public Team getTeam() {
		return team;
	}
	public String getImage(){
		return image;
	}
}
