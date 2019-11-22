package adf;

import java.util.Scanner;
public class qwe {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int ss=sr.nextInt();
        if(ss==1||ss==2){
            System.out.println("质");
            return;
        }
        int i=0,j=1;
        for(j=1;j<=ss;j++){
            if(ss%j==0){
                i++;
            }
            i++;
        }if(i==2){
            System.out.println("质");
        }else{
            System.out.println("不是");

        }
    }
}
