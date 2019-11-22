package sl;

import java.util.Scanner;

public class sl14 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int age=sr.nextInt();
        if(age>=18&&age<=40){
            System.out.println("少年");
        }else if(age>40&&age<=60){
            System.out.println("中年");
        }else if(age>60){
            System.out.println("");
    }
    }
}
