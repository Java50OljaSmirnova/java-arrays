package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static telran.arrays.MatricesInt.*;

class MatricesTest {

	@Test
	void multiplyConstantTest() {
		int[][] src = {
				{1, 10, 20},
				{30, -10, 15}
		};
		int[][] expected = {
				{2, 20, 40},
				{60, -20, 30}
		};
		assertArrayEquals(expected, multiplyConstant(src, 2));
	}
	@Test
	void getColumnTest() {
		int[][] src = {{1, 10, 20},{30, -10, 15}};
		int[] expected = {1, 30};
		int[] expected1 = {10, -10};
		assertArrayEquals(expected, getColumn(src, 0));
		assertArrayEquals(expected1, getColumn(src, 1));
	}
	@Test
	void transpMatrixTest(){
		int[][] src = {{1, 10, 20},
				       {30, -10, 15}};
		int[][] expected = {
				{1, 30},
				{10, -10},
				{20, 15}
		};
		assertArrayEquals(expected, transpMatrix(src));
	}

}
