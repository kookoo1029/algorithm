import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i); // scanner는 char를 받을 수 없음. string을 받고 char로 변환
			if(Character.isUpperCase(c)) {
				System.out.print(Character.toLowerCase(c));
			}else
				System.out.print(Character.toUpperCase(c));
		}
		
        br.close();
    }
}