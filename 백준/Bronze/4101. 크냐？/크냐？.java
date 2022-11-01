import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
        	//StringTokenizer 선언을  while 밖으로 빼면 오류남. 공백 단위로 읽을 수 있는 라인을 while문안에서 반복적으로 추가해야하기 때문
        	StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
        	int a = Integer.parseInt(st.nextToken()); 
        	int b = Integer.parseInt(st.nextToken()); 
        	if(a==0 && b==0) {
        		break;
        	}
        	sb.append(a>b ? "Yes" + "\n" :"No" + "\n");
        }
        System.out.println(sb);
    }
}