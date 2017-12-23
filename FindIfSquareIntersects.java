

// This is for finding if two rectangles overlap given only the top left corner point values and the bottom right values of two rectangles


class Points{
	int x , y;

	public Points(int x, int y){
		this.x = x;
		this.y = y;


	}

}

public class solution(){

	Boolean FindIfOverlap(l1, l2, r1, r2){
		// The idea is to see if either of the following conditions are true. If either is true, then they are not overlaping.
		// 1) The bottoms are apart
		// 2) The sides are apart

		if(l1.y > r2.y || r1.y > r2.y ){
			return false;

		}
		if(l1.x > r2.x || r1.x > l2.x ){
			return false;
		}

		return true;
	}

	public static void Main(String args[]){
		Points l1 = new Points( 1, 2);
		Points l2 = new Points( 4, 6);
		Points r1 = new Points( 7, 9);
		Points r2 = new Points( 10, 11);

		System.out.println(FindIfOverlap(l1, l2, r1, r2))
		// Should return false

	}


}