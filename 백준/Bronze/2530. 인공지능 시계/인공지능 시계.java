import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt();
		int oven = sc.nextInt();
		int s1 = (s+oven)%60;
		int m1 = (m+(s+oven)/60)%60;
		int h1 = h + (m+(s+oven)/60)/60;
		if(h1>=24) {
			System.out.println(h1%24 + " " + m1 + " " + s1);
		}else {
			System.out.println(h1 + " " + m1 + " " + s1);
		}
	}
}