package information;

import java.util.Scanner;
public class ZhiShiTest {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        ZhiShi a=new ZhiShi();
        String x=sr.next();
        a.setName(x);
        System.out.println("名字为："+a.getName());
        String y=sr.next();
        a.setJb(y);
        System.out.println("级别为："+a.getJb());
        String z=sr.next();
        a.setLx(z);
        System.out.println("类型为："+a.getLx());
    }
}
