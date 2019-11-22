package adf;

import sun.awt.geom.AreaOp;

import java.util.Scanner;
public class zs {
    public static void main(String[] args) {
        Scanner ss =new Scanner(System.in);
                int t = ss.nextInt();
                int a=1;
        for(a=1;a<10;a++){
            if(t/a==1||t/a==t){
                System.out.println("质数");
            }

//            else {
//                System.out.println("不是");
//            }

        }
    }
}
