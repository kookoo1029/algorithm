import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		int sum = 0;
		for(int i=0; i<N; i++) {
			// charAt()는 아스키코드값을 반환. 입력받은 숫자를 반환하기 위해서는 -48또는 '0'을 해줘야 함
			sum += s.charAt(i)-'0'; 
		}
		System.out.println(sum);
	}
}