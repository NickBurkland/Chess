package chess;

import java.util.ArrayList;

public class Rook extends GamePiece {

	public Rook(Location location, Team team, GamePiece[][] pieces) {
		super(location, team, "R", pieces);

	}

	public void move(Location l) {

	}

	public ArrayList<Location> getMovements() {
		ArrayList<Location>  moves = new ArrayList<Location>();
		boolean mn = true, ms=true, me=true, mw=true;

		for(int i=1; i<8; i++) {
			Location n = location.shift(0,i);
			Location e = location.shift(i, 0);
			Location s = location.shift(0,-i);
			Location w = location.shift(-i,0);

			try{
				if(mn&&pieces[n.getX()][n.getY()]==null)
					moves.add(n);
				else if(mn&&pieces[n.getX()][n.getY()].getTeam()==opp){
					moves.add(n);
					mn=false;
				}
				else if(mn){
					mn = false;
				}
			}catch(ArrayIndexOutOfBoundsException ex){/*move is off board*/}

			try{
				if(ms&&pieces[s.getX()][s.getY()]==null)
					moves.add(s);
				else if(ms&&pieces[s.getX()][s.getY()].getTeam()==opp){
					moves.add(s);
					ms=false;
				}
				else if(ms){
					ms = false;
				}
			}catch(ArrayIndexOutOfBoundsException ex){/*move is off board*/}

			try{
				if(me&&pieces[e.getX()][e.getY()]==null)
					moves.add(e);
				else if(me&&pieces[e.getX()][e.getY()].getTeam()==opp){
					moves.add(e);
					me=false;
				}
				else if(me){
					me = false;
				}
			}catch(ArrayIndexOutOfBoundsException ex){/*move is off board*/}

			try{
				if(mw&&pieces[w.getX()][w.getY()]==null)
					moves.add(w);
				else if(mw&&pieces[w.getX()][w.getY()].getTeam()==opp){
					moves.add(w);
					mw=false;
				}
				else if(mw){
					mw = false;
				}
			}catch(ArrayIndexOutOfBoundsException ex){/*move is off board*/}
		}
		return moves;
	}

}
