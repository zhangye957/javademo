package sl;

import java.util.Scanner;
public class sl12 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int age=sr.nextInt();
        if(age>=18) {
            System.out.println("恭喜您以成年");
        }else if(age<18){
            System.out.println("您未成年");
        }

    }
}
