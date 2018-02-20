package logical.logical1;

public class RepeatCharWithNumberMoreThanOne {
	public static void main(String[] args) {
		// String str = "abcddgggab"; //abcd2g3ab
		String str = "aaaaaaaabbbbbddoabb";
		char[] charA = str.toCharArray();
		int count = 1;
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < charA.length; i++) {
			if (i == 0) {
				output.append(charA[i]);
			}
			for (int j = i + 1; j < charA.length; j++) {
				if (charA[i] == charA[j]) {
					if (count == 1) {
						output.append(++count);
					} else {
						output.deleteCharAt(output.length() - 1);
						output.append(++count);
					}
					i = j;
				} else {
					output.append(charA[j]);
					count = 1;
					break;
				}
			}
		}
		System.out.println("input String : " + str);
		System.out.println("output String : " + output);
	}
}
