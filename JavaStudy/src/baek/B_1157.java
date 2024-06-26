package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B_1157 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		String word = br.readLine();
		
		for (int i = 0; i < word.length(); ++i) {
			if ('a' <= word.charAt(i) && word.charAt(i) <= 'z') {
				arr[word.charAt(i) - 97]++;
			} else {
				arr[word.charAt(i) - 65]++;
			}
		}
		int max = -1;
		char ch = '?';
		for (int i = 0; i < 26; ++i) {
			
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			}
			 else if (arr[i] == max) {
					ch = '?';
				}
		}
		System.out.print(ch);
	}
}


