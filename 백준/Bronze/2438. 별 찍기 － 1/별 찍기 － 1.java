import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		
		int N = Integer.parseInt(br.readLine()); // 반복횟수 입력
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=i; j++) {
				bw.write("*"); 
			}
			bw.write("\n");
		}

		br.close();
		bw.flush(); // 내부 버퍼의 내용을 파일에 writer
		bw.close();
	}
}