package chess;

import java.util.ArrayList;

public class Bishop extends GamePiece {

	public Bishop(Location location, Team team, GamePiece[][] pieces) {
		super(location, team, "B", pieces);
	}

	public ArrayList<Location> getMovements() {
		ArrayList<Location>  moves = new ArrayList<Location>();
		boolean mnw = true, msw=true, mse=true, mne=true;

		for(int i=1; i<8; i++) {
			Location nw = location.shift(-i,i);
			Location ne = location.shift(i, i);
			Location sw = location.shift(-i,-i);
			Location se = location.shift(i,-i);

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
		}
		return moves;
	}

}
