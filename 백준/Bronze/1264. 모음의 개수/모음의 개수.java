import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			int sum = 0;
			String s = sc.nextLine();
			if(s.equals("#")) break;
			for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u'|| 
						c=='A' || c=='E' ||c=='I' ||c=='O' ||c=='U'	) {
					sum++;
				}
			}
			System.out.println(sum);
		}
	}
}