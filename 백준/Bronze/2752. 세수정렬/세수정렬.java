import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}