package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static telran.arrays.InterviewTasks.*;

class InterviewTest {

//	private static final int N_ELEMENTS = 1000;
	@Test
	void sortTest() {
		short[] src = getRandomArray(10);
		sort(src);
		testsorted(src);
		short [] array = {7, 1, 13, 15, 20};
		sort(array);
		testsorted(array);
	}
	private void testsorted(short[] src) {
		for(int i = 1; i < src.length; i++) {
			assertTrue(src[i-1] <= src[i]);
		}
		
	}
	private short[] getRandomArray(int length) {
		short[] arr = new short[length];
		for(int i = 0; i < length; i++) {
			arr[i] = (short)(Math.random() * Short.MAX_VALUE);
		}
		return arr;
	}
	@Test
	void getMaxWithNegativeTest() {
	short[] array = {1, 1, 1, -1, 20, 100, 200, 100 -100, -100, -20, -40, 80};
	short[] array1 = {-40, 1, -40, -6, 2, 3, 40};
	short[] array2 = {40, 1, 2, 3, 40, -30};
	assertEquals(100, getMaxWithNegativePresentation(array));
	assertEquals(40, getMaxWithNegativePresentation(array1));
	assertEquals(-1, getMaxWithNegativePresentation(array2));
	}

}
