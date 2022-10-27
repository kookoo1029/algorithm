import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp = N;
		int count = 0;
		
		while(true) {
			int a = temp/10;
			int b = temp%10;
			int c = b*10 + (a+b)%10;
			count++;
			if(c==N) {
				break;
			}
			temp = c;
		}
		System.out.println(count);
	}
}