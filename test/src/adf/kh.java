package adf;

import java.util.Scanner;

public class kh {
    public static void main (String[] args){
        Scanner nn = new Scanner(System.in);
                double n =nn.nextInt();
        double a=1;
        double s=0;
        double t=0;
        for(a=1;a<=n;a++){
            t=1/a;
            s=s+t;
        }
        System.out.println(s);
    }
}
