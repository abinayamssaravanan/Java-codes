Write a program to print all the even numbers in the given range.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Even {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
