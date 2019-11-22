package sl;

import java.util.Scanner;
public class sl8 {
    public static void main(String[] args) {
        int a,b=0;
        Scanner sr = new Scanner(System.in);
        a = sr.nextInt();
        for(;a>0;a=a/10){
            b=b+1;
        }
        System.out.println(b);
    }}
