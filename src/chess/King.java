package chess;

import java.util.ArrayList;

public class King extends GamePiece {

	public King(Location location, Team team, GamePiece[][] pieces) {
		super(location, team, "K", pieces);
	}

	public ArrayList<Location> getMovements() {
			ArrayList<Location>  moves = new ArrayList<Location>();
		boolean mnw = true, msw=true, mse=true, mne=true, mn = true, me = true, mw = true, ms =true;

			Location nw = location.shift(-1,1);
			Location ne = location.shift(1, 1);
			Location sw = location.shift(-1,-1);
			Location se = location.shift(1,-1);			
			Location n = location.shift(0,1);
			Location e = location.shift(1, 0);
			Location s = location.shift(0,-1);
			Location w = location.shift(-1,0);

			try{
				if(mnw&&pieces[nw.getX()][nw.getY()]==null)
					moves.add(nw);
				else if(mnw&&pieces[nw.getX()][nw.getY()].getTeam()==opp){
					moves.add(nw);
					mnw=false;
				}
				else if(mnw){
					mnw = false;
				}
			}catch(ArrayIndexOutOfBoundsException ex){/*move is off board*/}

			try{
				if(mne&&pieces[ne.getX()][ne.getY()]==null)
					moves.add(ne);
				else if(mne&&pieces[ne.getX()][ne.getY()].getTeam()==opp){
					moves.add(ne);
					mne=false;
				}
				else if(mne){
					mne = false;
				}
			}catch(ArrayIndexOutOfBoundsException ex){/*move is off board*/}

			try{
				if(mse&&pieces[se.getX()][se.getY()]==null)
					moves.add(se);
				else if(mse&&pieces[se.getX()][se.getY()].getTeam()==opp){
					moves.add(se);
					mse=false;
				}
				else if(mse){
					mse = false;
				}
			}catch(ArrayIndexOutOfBoundsException ex){/*move is off board*/}

			try{
				if(msw&&pieces[sw.getX()][sw.getY()]==null)
					moves.add(sw);
				else if(msw&&pieces[sw.getX()][sw.getY()].getTeam()==opp){
					moves.add(sw);
					msw=false;
				}
				else if(msw){
					msw = false;
				}
			}catch(ArrayIndexOutOfBoundsException ex){/*move is off board*/}

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
		return moves;
	}

}
