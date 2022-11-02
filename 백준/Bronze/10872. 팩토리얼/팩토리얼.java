import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = factioral(N);
		System.out.println(sum);
	}
	
	public static int factioral(int N) { // 재귀함수
		if(N<=1) {
			return 1;
		}
		return N * factioral(N-1);
	}
}