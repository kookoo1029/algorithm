import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		if(A-B>0) {
			System.out.println(A-B);
		}else {
			System.out.println((A-B)*-1);
		}
	}
}