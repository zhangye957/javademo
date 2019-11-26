package information;

import java.util.Scanner;
public class fuwentest {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        fuwen hurt=new fuwen();
        int  a=sr.nextInt();
        int  b=sr.nextInt();
        hurt.setadHurt(a);
        hurt.setapHurt(b);
        System.out.println("物理攻击为："+hurt.getadHurt(a));
        System.out.println("法术攻击为："+hurt.getapHurt(b));
    }
}
