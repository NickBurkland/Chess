package chess;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Knight extends GamePiece {

	public Knight(Location location, Team team, GamePiece[][] pieces) {
		super(location, team, "Kn", pieces);
	}

	public ArrayList<Location> getMovements() {
		ArrayList<Location> moves = new ArrayList<Location>();
		
		for(int i = -2; i <=2; i+=4){
			for(int j = -1; j <=1; j+=2){
				try{
					Location l = location.shift(i,j);
					if(pieces[l.getX()][l.getY()]==null || pieces[l.getX()][l.getY()].getTeam()==this.opp)
						moves.add(l);
				}catch(ArrayIndexOutOfBoundsException ex){/*Move is off Board*/}
				try{
					Location l = location.shift(j, i);
					if(pieces[l.getX()][l.getY()]==null || pieces[l.getX()][l.getY()].getTeam()==this.opp)
						moves.add(l);
			
				}catch(ArrayIndexOutOfBoundsException ex){/*Move is off Board*/}
			}
		}
		
		return moves;
	}

}
