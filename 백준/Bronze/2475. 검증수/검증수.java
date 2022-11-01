import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long sum=0;
		for(int i=0; i<5; i++) {
			long N = sc.nextInt();
			sum += Math.pow(N, 2);
		}
		System.out.println(sum%10);
	}
}
