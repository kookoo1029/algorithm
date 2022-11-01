import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String jh = sc.nextLine();
		String hos = sc.nextLine();
		
		if(jh.length()>=hos.length()) {
			System.out.println("go");
		}else {
			System.out.println("no");
		}
	}
}