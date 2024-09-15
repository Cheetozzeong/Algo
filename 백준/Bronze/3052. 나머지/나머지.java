import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] mod = new boolean[43];
        int cnt =0;
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            mod[M%42] = true;
        }

        for (int i = 0; i < 43; i++) {
            if(mod[i]) cnt++;
        }
        System.out.print(cnt);
    }
}
