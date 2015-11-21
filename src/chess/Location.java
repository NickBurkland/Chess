package chess;

public class Location {
    char x = 'A';
    int y = 0;
    
    public Location(char x, int y) {
		this.x = x;
		this.y = y;
	}

	public Location shift(char x, int y){
    	return new Location((char)(x+((char)3)), this.y+y);
    }
	
	public int getX() {
		return (int)x;
	}
	
	public int getY() {
		return y;
	}
}
