package logical;

public class stairCase {
	public static void main(String[] args) {
	
	
	String[][] array = new String[6][6];
	int index_sc = 5;
	//i = row, j = column
	for (int i = 0; i < 6; i++) {

		for (int j = 5; j >= 0; j--) {	
			if(j>=index_sc){
			array[i][j] = "#";		
		}else{
			array[i][j] = " ";	
	}
}
		index_sc--;
}
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[i][j]);
		}
		System.out.println();
	}
}
}
