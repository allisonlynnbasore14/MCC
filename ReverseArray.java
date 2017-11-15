

class ReverseArray{

	public void reverseArray(int array1[], int startFocus, int endFocus){
		// This is going to be a recursive function that keeps calling itself and incrementing through
		// the array until the beginning focus meets the end focus
		if(startFocus >= endFocus){
			return;
			//Returning the recrusion only when the two focus numbers reach each other
		}

		int temp = array1[startFocus];
		array1[startFocus] = endFocus;
		array1[endFocus] = temp;
		// setting the end value to the beginning place
		// setting the beginning value to the end place
		reverseArray(array1, startFocus + 1, endFocus -1 );
		// call the funtion again
	}

	public void printArray(int array1[]){
		for(int i=0; i< array1.size(); i++){
			System.out.print(array1[i] + "  ");
			// printing out all the values in the array
		}
	}

	public static void Main(String[] args){
		int array1[] = {1,2,3,4,5,6,7,8};
		reverseArray(array1);
		printArray(array1);
	}



}