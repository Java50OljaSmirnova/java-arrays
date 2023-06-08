package telran.arrays;

public class MatricesInt {
public static int[][] multiplyConstant(int[][]matrix, int constant){
	for(int i = 0; i < matrix.length; i++) {
		for(int j = 0; j < matrix[i].length; j++) {
			matrix[i][j] *= constant;
		}
	}
	return matrix;
}
public static int[] getColumn (int[][]matrix, int column) {
	int[] res = new int [matrix.length];
	for(int i = 0; i < matrix.length; i++) {
		res[i] = matrix[i][column];
	}
	return res;
}
public static int[][] transpMatrix(int[][]matrix){
	int row = matrix[0].length;
	int column = matrix.length;
	int[][] res = new int [row][column];
	for(int i = 0; i < row; i++) {
		for(int j = 0; j < column; j++) {
			res[i][j] = matrix[j][i];
		}
	}
	return res;
}
}