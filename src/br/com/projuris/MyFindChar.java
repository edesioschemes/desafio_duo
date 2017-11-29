package br.com.projuris;

public class MyFindChar implements FindCharacter {

	@Override
	public char findChar(String word) {
		
		char charInString;
		String wordLowerCase = word.toLowerCase();
		
		for (int i = 0; i < word.length(); i++) {
			charInString = wordLowerCase.charAt(i);
			
			if (wordLowerCase.lastIndexOf(charInString) == wordLowerCase.indexOf(charInString)) {
				return charInString;
			}
		}
		
		
		return '\0';
	}

}
