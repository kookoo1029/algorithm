import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int rem = 0;
		for(int i=0; i<s.length(); i++) {
			rem = (rem * 10 + (s.charAt(i)-'0')) % 20000303; // 나눗셈의 원리
		}
		System.out.println(rem);
	}
}