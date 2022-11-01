import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long sum=0;
		for(int i=0; i<5; i++) {
			long N = sc.nextInt();
			sum += N*N;
		}
		System.out.println(sum%10);
	}
}