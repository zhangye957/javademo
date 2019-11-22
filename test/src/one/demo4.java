package one;

import java.util.Scanner;
public class demo4 {
    public static void main(String[] args){
        Scanner ss=new Scanner(System.in);
        int a=ss.nextInt();
        if(a>2&&a<6) {
            System.out.println("春天");
        } else if(a>5&&a<9){
            System.out.println(" 夏天");
        }else if(a>8&&a<12){
            System.out.println(" 秋天");
        }else if(a==12||a==1||a==2){
            System.out.println(" 冬天");
        }
        }
    }
