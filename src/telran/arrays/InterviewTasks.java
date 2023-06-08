package telran.arrays;

public class InterviewTasks {
// O(N^2):
//	public static boolean isSumTwo(short [] array, short sum) {
//  //{1, 2, 5, 10, 20}
//	boolean res = false;
//	int i = 0;
//	while(i < array.length && !res) {
//		short num = (short)(sum - array[i]);
//		int j = i + 1;
//		while(j < array.length && !res) {
//			if(array[j] == num) {
//				res = true;
//			}
//			j++;
//		}
//		i++;
//	}
//	return false;
//}
// O(N)
	public static boolean isSumTwo(short [] array, short sum) {
    //array of positive numbers or 0
	boolean[] helper = new boolean [sum > 0 ? sum + 1 : Short.MAX_VALUE + 1];
	boolean res = false;
	int index = 0;
	while(index < array.length && !res){
		short num = (short)(sum - array[index]);
		if(num >= 0) {
			if(helper[num]) {
				res = true;
			} else {
				helper[array[index]] = true;
			}
		}
		index++;
	}
	return res;
	}
	
	public static void sort(short[] array) {
		int [] helper = new int [Short.MAX_VALUE];
		for(int i = 0; i < array.length; i++) {
			helper[array[i]]++;
		}
		int arIndex = 0;
		int helpIndex = 0;
		while(arIndex < array.length) {
			if(helper[helpIndex] == 0) {
				helpIndex++;
			} else {
				array[arIndex] = (short)helpIndex;
				arIndex++;
				helper[helpIndex]--;	
			}
		}
	}
	public static short getMaxWithNegativePresentation(short[] array) {
		short res = -1;
		int [] helper = new int [Short.MAX_VALUE];
		int indexEnd = helper.length - 1;
		int indexStart = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] != 0) {
					helper[Math.abs(array[i])] ++;
			}
		}
		while( indexEnd >= 0) {
			if(helper[indexEnd] > 1) {
				if(indexStart >= array.length) {
					indexStart = 0;
					indexEnd--;
				} else if(indexEnd + array[indexStart] == 0) {
					res = (short)indexEnd;
					break;
				} else {
					indexStart++;
				}
			} else {
				indexEnd--;
			}
		}
		return res;
	}

}
