import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class BinaryNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        
        String b1 = Integer.toBinaryString(n);
        
        String arr[] = b1.split("0");
        
        Arrays.sort(arr);
        
        System.out.println(arr[arr.length-1].length());

        bufferedReader.close();
    }
}
