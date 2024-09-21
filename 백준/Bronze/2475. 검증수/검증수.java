import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = (int)(Math.pow(Double.parseDouble(st.nextToken()),2)+
                (Math.pow(Double.parseDouble(st.nextToken()),2))+
                (Math.pow(Double.parseDouble(st.nextToken()),2))+
                (Math.pow(Double.parseDouble(st.nextToken()),2))+
                (Math.pow(Double.parseDouble(st.nextToken()),2)))%10;
        System.out.println(a);
    }
}