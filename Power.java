program to find whether the given number is power of 2 or not.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Power {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=1;int flag=0;
        while(n>=p){
            if(n==p){
                flag=1;
            }
            p=p*2;
        }
        if(flag==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
