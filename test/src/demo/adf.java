package demo;

import java.util.Scanner;
public class adf {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int x=sr.nextInt();
        int y=sr.nextInt();
        pxsbx(x,y);
    }
    public static void pxsbx(int a,int b){
        for(int i=0;i<=a;i++){
            for(int j=1;j<=(b-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<=(a+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

