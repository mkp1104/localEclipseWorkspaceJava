package logical.logical1;

public class FirstUmatchedCharInString {
	public static void main(String[] args) {
		String str = "abcdeabcd";
		char firstUnmatchedChar;
		boolean isMatched = false;
		char[] charA = str.toCharArray();
		for (int i = 0; i < charA.length; i++) {
			for (int j = 1; j < charA.length; j++) {
				if(charA[i]==charA[j]){
					
					break;
				}
			}
			
			if(!isMatched){
				firstUnmatchedChar = charA[i];
				break;
			}
		}
		System.out.println("First Umatched Char in the String: " + firstUnmatchedChar);
	}
}
