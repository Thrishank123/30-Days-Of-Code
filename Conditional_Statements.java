import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Conditional_Statements {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N%2 != 0){
        System.out.println("Weird");
    }else if ((N>=2 && N<=5) && (N%2==0))
    System.out.println("Not Weird");
    else if ((N>=6 && N<=20) &&N%2==0)
    System.out.println("Weird");
    else if (N%2 == 0 && N>20){
        System.out.println("Not Weird");
    }
        bufferedReader.close();
    }
}
