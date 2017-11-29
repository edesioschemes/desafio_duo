package br.com.projuris;

import java.util.Arrays;

public class MyFindArray implements FindArray {

	@Override
	public int findArray(int[] array, int[] subArray) {
		
		if (subArray.length > array.length) {
			return -1;
		}
		
		String firstArray = Arrays.toString(array).replaceAll("\\[|\\]|,|\\s", "");
		String secondArray = Arrays.toString(subArray).replaceAll("\\[|\\]|,|\\s", "");
		
		if (firstArray.contains(secondArray)) {
			return firstArray.lastIndexOf(secondArray);
		} else {
			return -1;
		}
		
	}

}
