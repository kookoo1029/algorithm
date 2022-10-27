import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		
		int N = Integer.parseInt(br.readLine()); // 반복횟수 입력
		
		for (int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); // 너가 입력하는 값을 끊을거야
			int a = Integer.parseInt(st.nextToken()); // 첫번째 입력값은 a에
			int b = Integer.parseInt(st.nextToken()); // 두번째 입력값은 b에
			bw.write(a+b+"\n");
		}

		br.close();
		bw.flush(); // 내부 버퍼의 내용을 파일에 writer
		bw.close();
	}
}