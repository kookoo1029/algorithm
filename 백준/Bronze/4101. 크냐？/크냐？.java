import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = "";
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0 && b==0) {
				break;
			}
			s +=  a>b ? "Yes" + "\n" : "No" + "\n";
		}
		System.out.println(s);
	}
}