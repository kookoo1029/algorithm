import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = 2001;
		int B = 2001;
		for(int i=0; i<3; i++) {
			int value = sc.nextInt();
			if(value<A) { // 최소값 구하기
				A = value;
			}
		}
		for(int i=0; i<2; i++) {
			int value = sc.nextInt();
			if(value<B) {
				B = value;
			}
		}
		System.out.println(A+B-50);
	}
}