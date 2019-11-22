package one;

import  java.util.Scanner;
public class Four {
    public static void main(String[] args){
        Scanner ss= new Scanner(System.in);
        int x=ss.nextInt();
        int y=ss.nextInt();
        int c=(x>y)?x:y;
        System.out.println(c);
    }
}
