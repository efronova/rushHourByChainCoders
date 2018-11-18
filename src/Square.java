
public class Square {
	final private int SIZE = 50;
	
	private int x;
	private int y;
	
	public Square(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getSize() {
		return SIZE;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX( int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public Boolean hasCoordinate( int x, int y) {
		//check if the coordinate fits in the x direction
		if( ( x < this.x + SIZE) && ( x > this.x ) )
			//check if the coordinate fits in y direction
			if( ( y < this.y) && (y > this.y-SIZE ))
				return true;
		return false;
	}
}
