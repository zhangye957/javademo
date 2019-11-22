package one;

import java.util.Scanner;
public class demo5 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int a=sr.nextInt();
        if(a/2==0){
            System.out.println("偶数");
        }else if(a/2!=0){
            System.out.println("奇数");
        }
    }
}
