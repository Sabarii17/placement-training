import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String st=s.nextLine();
        int k=n%st.length();
        String r=st.substring(k)+st.substring(0,k);
        
        System.out.print(r);

    }
}
