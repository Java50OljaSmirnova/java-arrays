package telran.arrays;

import java.util.Arrays;

public class ArraysInt {
public static int[] addNumber(int [] array, int number) {
	int[] res = Arrays.copyOf(array, array.length + 1);
	res[array.length] = number;
	return res;
}
public static int[] insertNumber(int[] array, int index, int number) {
	int [] res = new int[array.length + 1];
	System.arraycopy(array, 0, res, 0, index);
	res[index] = number;
	System.arraycopy(array, index, res, index + 1, array.length - index);
	return res;
}
public static int[] removeNumber(int[] array, int index) {
	int [] res = new int[array.length - 1];
	System.arraycopy(array, 0, res, 0, index);
	System.arraycopy(array, index + 1, res, index, res.length - index);
	return res;
}
public static int[] insertNumberSorted(int[] arraySorted, int number) {
	int index = Arrays.binarySearch(arraySorted, number);
	if (index < 0) {
		index = -index - 1;
	}
	return insertNumber(arraySorted, index, number);
}
public static int searchNumber(int[] array, int number) {
	int index = 0;
	while(index < array.length && array[index] != number) {
		index++;
	}
	return index < array.length ? index : -1;
}
public static int binarySearch (int [] array, int number) {
	int left = 0;
	int right = array.length - 1;
	int middle = right/ 2;
	while(left <= right && array[left] != number) {
		if(number <= array[middle]) {
			right = middle -1;
		} else {
			left = middle + 1;
		}
		middle = (left + right) / 2;
	}
	
	return left < array.length && array[left] == number ? left : -left-1;	
}
public static void quickSort(int[] array) {
	Arrays.sort(array); //O[N*LogN]
}
public static void bubbleSort(int[] array) {
	int length = array.length;
	boolean sorted = false;
	do {
		length--;
		sorted = true;
		for(int i = 0; i < length; i++) {
			if(array[i] > array[i+1]) {
				swap(array, i, i + 1);
				sorted = false;
			}
		}
	}while(!sorted);
}
private static void swap(int[] array, int i, int j) {
//	swap with no additional variable;
//	array[i] = array[i] + array[j];
//	array[j] = array[i] - array[j];
//	array[i] = array[i] - array[j];
	int tmp = array[i];
	array[i] = array[j];
	array[j] = tmp;
}
}
