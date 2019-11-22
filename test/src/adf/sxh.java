package adf;

import java.util.Scanner;
public class sxh {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int a=sr.nextInt();
        int b,c,d;
        b=a/100;
        c=a/10%10;
        d=a%10;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        if((b*b*b)+(c*c*c)+(d*d*d)==a){
            System.out.println(a+"是水仙花");
        }else
        {
            System.out.println(a+"不是水仙花");
        }

    }
}
