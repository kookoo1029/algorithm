import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println(max);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==max) {
				System.out.println(i+1);
			}
		}
		
        bw.flush();
        bw.close();
        br.close();
    }
}