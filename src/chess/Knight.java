package chess;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Knight extends GamePiece {

	public Knight(Location location, Team team, GamePiece[][] pieces) {
		super(location, team, "K", pieces);
	}

	public ArrayList<Location> getMovements() {
		ArrayList<Location> moves = new ArrayList<Location>();
		
		for(int i = -3; i <=3; i+=6){
			for(int j = -2; j <=2; j+=4){
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
