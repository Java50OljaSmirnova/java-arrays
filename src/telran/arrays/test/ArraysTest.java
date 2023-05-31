package telran.arrays.test;

import org.junit.jupiter.api.Test;

import telran.arrays.ArraysInt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class ArraysTest {
@Test
void initialTest() {
	int [] ar1 = {1, 2, 3};
	int [] ar2 = {1, 2, 3};
	int [] ar2_3 = ar2;
	assertFalse(ar1 == ar2);
	assertTrue(ar2 == ar2_3);
	assertArrayEquals(ar1, ar2);
	ar2_3[0] = 10;
	ar1[0] = 10;
	assertArrayEquals(ar1, ar2);
}
@Test
void copyOfIntTest() {
	int [] ar1 = {10, 5, 15};
	int [] expected1 = {10, 5, 15};
	int [] expected2 = {10, 5};
	int [] expected3 = {10, 5, 15, 0, 0};
	assertArrayEquals(expected1, Arrays.copyOf(ar1, 3));
	assertArrayEquals(expected2, Arrays.copyOf(ar1, 2));
	assertArrayEquals(expected3, Arrays.copyOf(ar1, 5));
}
@Test
void addNumberTest() {
	int [] ar1 = {10, 5, 15};
	int number = 20;
	int [] expected = {10, 5, 15, number};
	assertArrayEquals(expected, ArraysInt.addNumber(ar1, number));
}
@Test
void arraycopyTest() {
	int [] src = {1, 2, 3, 4, 5, 6, 7};
	int [] dest = {10, 20, 30, 40, 50, 60, 70};
	int [] expected = {10, 20, 30, 40, 1, 2, 3};
	System.arraycopy(src, 0, dest, 4, 3);
	assertArrayEquals(expected, dest);
}
@Test
void insertNumberTest() {
	int [] src = {1, 2, 3, 4, 5, 6, 7};
	int number = 20;
	int index = 3;
	int [] expected1 = {1, 2, 3, 20, 4, 5, 6, 7};
	assertArrayEquals(expected1, ArraysInt.insertNumber(src, index, number));
	number = 30;
	index = 0;
	int [] expected2 = {30, 1, 2, 3, 4, 5, 6, 7};
	assertArrayEquals(expected2, ArraysInt.insertNumber(src, index, number));
	number = 40;
	index = src.length;
	int [] expected3 = {1, 2, 3, 4, 5, 6, 7, 40};
	assertArrayEquals(expected3, ArraysInt.insertNumber(src, index, number));
	
}
@Test
void removeNumberTest() {
	int [] src = {1, 2, 3, 4, 5, 6, 7};
	int index = 3;
	int [] expected1 = {1, 2, 3, 5, 6, 7};
	assertArrayEquals(expected1, ArraysInt.removeNumber(src, index));
	index = 0;
	int [] expected2 = {2, 3, 4, 5, 6, 7};
	assertArrayEquals(expected2, ArraysInt.removeNumber(src, index));
	index = src.length - 1;
	int [] expected3 = {1, 2, 3, 4, 5, 6};
	assertArrayEquals(expected3, ArraysInt.removeNumber(src, index));
	
}
@Test
void binarySearchTest() {
	int [] src = {10, 20, 30, 40, 50, 60, 70};
	int key = 40;
	assertEquals(3, Arrays.binarySearch(src, key));
	key = 90;
	assertEquals(-8, Arrays.binarySearch(src, key));
	key = 0;
	assertEquals(-1, Arrays.binarySearch(src, key));
	key = 45;
	assertEquals(-5, Arrays.binarySearch(src, key));
	key = 25;
	assertTrue(Arrays.binarySearch(src, key) < 0);
	key = 10;
	assertFalse(Arrays.binarySearch(src, key) < 0);
}
@Test
void insertSortedTest() {
	int [] src = {10, 20, 30, 40, 1, 2, 3};
	Arrays.sort(src);
	int number = 5;
	int [] expected1 = {1, 2, 3, 5, 10, 20, 30, 40};
	assertArrayEquals(expected1, ArraysInt.insertNumberSorted(src, number));
	number = 30;
	int [] expected2 = {1, 2, 3, 10, 20, 30, 30, 40};
	assertArrayEquals(expected2, ArraysInt.insertNumberSorted(src, number));
	number = -3;
	int [] expected3 = {-3, 1, 2, 3, 10, 20, 30, 40};
	assertArrayEquals(expected3, ArraysInt.insertNumberSorted(src, number));
	number = 100;
	int [] expected4 = {1, 2, 3, 10, 20, 30, 40, 100};
	assertArrayEquals(expected4, ArraysInt.insertNumberSorted(src, number));
}
}
