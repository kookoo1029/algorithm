import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		int e = sc.nextInt(), f = sc.nextInt(), g = sc.nextInt(), h = sc.nextInt();
		int sum1 = a+b+c+d;
		int sum2 = e+f+g+h;
		if(sum2>sum1) {
			System.out.println(sum2);
		}else {
			System.out.println(sum1);
		}
	}
}