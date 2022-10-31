import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 공백 단위로 읽을 수 있는 라인 추가
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " "); // 공백 단위로 읽을 수 있는 라인 또 추가
        
        for (int i = 0; i < N; i++) {
            int inputNums = Integer.parseInt(st.nextToken());
 
            if (inputNums < X) {
                bw.write(inputNums + " ");
            }
        }
		
        bw.flush();
        bw.close();
        br.close();
    }
}