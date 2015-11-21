package chess;

public class Location {
    int x = 0;
    int y = 0;
    
    public Location(char x, int y) {
	this.x = (int)(x-'A');
	this.y = y;
    }

    public Location(int x, int y){
	this.x = x;
	this.y = y;
    }

    public Location shift(char x, int y){
    	return new Location((char)this.x+x, this.y+y);
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
    
    public String toString() {
    	return new String(x+1 + "" + y+1);
    }
}
