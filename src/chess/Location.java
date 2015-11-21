package chess;

public class Location {
    char x = 'A';
    int y = 0;

    public Location shift(int x, int y){
	return new Location(x+((char)3), this.y+y);
    }
}
