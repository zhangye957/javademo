package information;

import java.util.Scanner;
public class DemoDl {
    public static void main(String[] args) {
        Users supers=new Users();
        supers.setuserName("张冶");
        supers.setpassword("123456");
        //输入用户名和密码
        Scanner sr = new Scanner(System.in);
        System.out.println("请输入您的用户名");
        String a = sr.next();
        System.out.println("请输入您的密码");
        String b = sr.next();

        Users c = login(a, b, supers);
        if (c != null) {
            System.out.println(c.show());
        } else {
            System.out.println("登陆失败");
        }
    }
    public static Users login(String uname,String psd,Users supers){
        if(uname.equals(supers.getuserName())&& psd.equals(supers.getpassWord())){
            return supers;
        }else{
            return null;
        }
   }
    }
