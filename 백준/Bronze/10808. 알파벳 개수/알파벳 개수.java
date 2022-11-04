import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
		String s = sc.next();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			arr[c-'a']++;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}