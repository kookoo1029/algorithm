import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int o = sc.nextInt();
		
		int m1 = (m+o)%60;
		int h1 = h+((m+o)/60);
		
		if(h1>=24) {
			h1=h1-24;
			System.out.println(h1 + " " + m1);
		}else {
			System.out.println(h1 + " " + m1);
		}
	}
}