import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger m = sc.nextBigInteger();
		BigInteger n = sc.nextBigInteger();

		System.out.println(m.divide(n));
		System.out.println(m.remainder(n));
	}
}