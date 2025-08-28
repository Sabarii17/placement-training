import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner (System.in);
        String st=s.nextLine();
        String b="";
        for(int i=0;i<st.length();i++){
           char c=st.charAt(i);
            if(Character.isDigit(c))
            b=b+c;
        }if(b.length()==0)System.out.print(0);
        else System.out.print(b);
    }
}
