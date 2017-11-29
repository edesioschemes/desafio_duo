package br.com.projuris;

public class TesteArray {

	public static void main(String[] args) {
		
		int firstArray[] = {4,9,3,7,8,3,7,1};
		int secondArray[] = {3,7};
		
		MyFindArray myFindArray = new MyFindArray();
		int result = myFindArray.findArray(firstArray, secondArray);

		System.out.println(result);
		
	}

}
