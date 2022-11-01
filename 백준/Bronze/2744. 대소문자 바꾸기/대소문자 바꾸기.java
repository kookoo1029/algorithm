import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i); // scanner는 char를 받을 수 없음. string을 받고 char로 변환
			if(Character.isUpperCase(c)) {
				System.out.print(Character.toLowerCase(c));
			}else
				System.out.print(Character.toUpperCase(c));
		}
	}
}