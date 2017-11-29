package br.com.projuris;

public class TesteString {

	public static void main(String[] args) {
		MyFindChar myFindChar = new MyFindChar();
		
		String word = "Testando a String";
		
		char result = myFindChar.findChar(word);

		System.out.println(result);
	}

}
