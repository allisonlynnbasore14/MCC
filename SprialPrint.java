
class SpiralPrint{

	public void spiralPrint(int a[][]){

		int i, firstRow = 0, lastRow = a.length(), firstColm = 0, lastColm = a[0].length;


		// The idea is that we print the first avalale row in the order of top,

		System.out.println(a[0][0]);

		while(firstRow > lastRow && firstColm < lastColm){

			// printing the firstRow
			for(i = 1; i < lastColm; i++){
				System.out.println(a[firstRow][i]);
			}

			firstRow ++;

			// printing the lastColm
			for(i = 1; i < lastRow; i++){
				System.out.println(a[i][lastColm]);
			}

			lastColm --;

			// printing the lastRow
			for(i = lastColm; i > firstColm; i--){
				System.out.println(a[lastRow][i]);
			}

			lastRow --;

			// printing the firstColm
			for(i = lastRow; i > firstRow; i--){
				System.out.println(a[i][firstColm]);
			}

			firstColm ++;

		}

	}

}