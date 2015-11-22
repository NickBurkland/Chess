package chess;

public class Location {
    int x = 0;
    int y = 0;

    public Location(int x, int y){
    	this.x = x;
    	this.y = y;
    }

    public Location shift(int x, int y){
    	return new Location(this.x+x,this.y+y);
    }
	
    public int getX() {
    	return x;
    }
	
    public int getY() {
    	return y;
    }
    
    @Override
    public String toString() {
    	return new String((x+1) + " " + (y+1));
    }
    
    @Override
    public  boolean equals(Object o){
    	Location l = (Location)o;
    	return l.x==x&&l.y==y;
    }
}
