import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] str = new String[N];
		for(int i=0; i<N; i++) {
			str[i] = sc.next();
		}
		for(int i=0; i<N; i++) {
			if(str[i].length()>=6 && str[i].length()<=9) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}
}