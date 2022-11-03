import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println((int)(N*(1-0.22)));
		System.out.println((int)(N*(1-(1-0.8)*0.22)));
	}
}