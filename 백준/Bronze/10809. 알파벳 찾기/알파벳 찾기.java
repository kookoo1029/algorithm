import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26]; // 알파벳 배열을 -1로 초기화 시키자
		for(int i=0; i<26; i++) {
			arr[i]=-1;
		}
		String s = sc.nextLine();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i); // c에는 문자가 하나씩 들어감
			if(arr[c-'a']==-1) { // 알파벳이 처음 등장하는 위치를 뽑아야 하기 때문
				arr[c-'a'] = i; // a는 97, b는 98 ... 
			}
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}