import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();
		if(A/C>B/D) {
			if(A%C>0) {
				System.out.println(L-(A/C+1));
			}else {
				System.out.println(L-A/C);
			}
		}else if(A/C<B/D) {
			if(B%D>0) {
				System.out.println(L-(B/D+1));
			}else {
				System.out.println(L-B/D);
			}
		}else {
			if(A%C!=0 || B%D!=0) {
				System.out.println(L-(A/C+1));
			}else {
				System.out.println(L-A/C);
			}
		}
	}
}