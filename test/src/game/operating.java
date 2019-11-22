package game;

import java.util.Scanner;
public class operating {
    public static void main(String[] args) {

        //    程序初始化
        Scanner sr = new Scanner(System.in);
        information[] uarr = new information[100];
        Datas[] datas = new Datas[100];
        //创建不同种类的数据对象
        Datas d = new Datas("生肖", "鸡", "苏");
        datas[0]=d;
        Datas d2 = new Datas("生肖", "马", "顾");
        datas[1]=d2;
        Datas d3 = new Datas("生肖", "羊", "夏");
        datas[2]=d3;
        Datas d4 = new Datas("生肖", "兔", "陌");
        datas[3]=d4;
        Datas d5 = new Datas("生肖", "龙", "夜");
        datas[4]=d5;
        Datas d6 = new Datas("生肖", "鼠", "上官");
        datas[5]=d6;
        Datas d7 = new Datas("生肖", "猪", "慕");
        datas[6]=d7;
        Datas d8 = new Datas("生肖", "猴", "楚");
        datas[7]=d8;
        Datas d9 = new Datas("生肖", "蛇", "陆");
        datas[8]=d9;
        Datas d10 = new Datas("生肖", "狗", "程");
        datas[9]=d10;
        Datas d11 = new Datas("生肖", "牛", "浴");
        datas[10]=d11;
        Datas d12 = new Datas("生肖", "虎", "玉");
        datas[11]=d12;
        Datas d13 = new Datas("月份", "1月", "小");
        datas[12]=d13;
        Datas d14 = new Datas("月份", "2月", "棂");
        datas[13]=d14;
        Datas d15 = new Datas("月份", "3月", "玥");
        datas[14]=d15;
        Datas d16 = new Datas("月份", "4月", "浅");
        datas[15]=d16;
        Datas d17 = new Datas("月份", "5月", "瑾");
        datas[16]=d17;
        Datas d18 = new Datas("月份", "6月", "颜");
        datas[17]=d18;
        Datas d19 = new Datas("月份", "7月", "曦");
        datas[18]=d19;
        Datas d20 = new Datas("月份", "8月", "夭");
        datas[19]=d20;
        Datas d21 = new Datas("月份", "9月", "眠");
        datas[20]=d21;
        Datas d22 = new Datas("月份", "10月", "晴");
        datas[21]=d22;
        Datas d23 = new Datas("月份", "11月", "莹");
        datas[22]=d23;
        Datas d24 = new Datas("月份", "12月", "瑶");
        datas[23]=d24;
        Datas d25 = new Datas("星座", "白羊座", "浅");
        datas[24]=d25;
        Datas d26 = new Datas("星座", "金牛座", "姬");
        datas[25]=d26;
        Datas d27 = new Datas("星座", "巨蟹座", "盈");
        datas[26]=d27;
        Datas d28 = new Datas("星座", "天蝎座", "晞");
        datas[27]=d28;
        Datas d29 = new Datas("星座", "双子座", "儿");
        datas[28]=d29;
        Datas d30 = new Datas("星座", "射手座", "璃");
        datas[29]=d30;
        Datas d31 = new Datas("星座", "狮子座", "衣");
        datas[30]=d31;
        Datas d32 = new Datas("星座", "处女座", "仪");
        datas[31]=d32;
        Datas d33 = new Datas("星座", "天秤座", "之");
        datas[32]=d33;
        Datas d34 = new Datas("星座", "双鱼座", "绯");
        datas[33]=d34;
        Datas d35 = new Datas("星座", "水瓶座", "色");
        datas[34]=d35;
        Datas d36 = new Datas("星座", "魔羯座", "蓉");
        datas[35]=d36;
        boolean k=true;
        while(k) {
//            用户输入数据
            String sname = sr.next();
            int psd = sr.nextInt();
            String animal = sr.next();
            int month = sr.nextInt();
            String star = sr.next();

            int m = register(sname, psd, animal, month, star, uarr);
            if (m == 1) {
                System.out.println("注册成功");
            } else {
                System.out.println("注册失败");
            }
//            用户登录
            System.out.println("请登录");
            String sname2 = sr.next();
            int psd2 = sr.nextInt();
            int login = login(sname2, psd2, uarr);
            if (login == 1) {
                System.out.println("登录成功");
            } else {
                System.out.println("登录失败");
            }

//        开始测试

            System.out.println("请输入生肖、月份、星座");
            String animal2 = sr.next();
            String month2 = sr.next();
            String star2 = sr.next();
            String newName = startGame(animal2, month2, star2, datas);
            System.out.println("你前世的名字是:" + newName);

            System.out.println("是否继续输入，继续输入输入1，不继续输入输入除了1的数字");
            int fg=sr.nextInt();
            if(fg==1){
                System.out.println("请注册");
            }else{
                System.out.println("不继续输入输入除了1的数字");
                k=false;
            }
        }
    }
        //用户注册
        public static int register(String sname,int psd, String animal,int month,String star,information[] ua){
            // 创建一个用户对象
            information a=new information();
            // 给对象的属性赋值
            a.sname= sname;
            a.psd=psd;
            a.animal=animal;
            a.month=month;
            a.star=star;
            // 保存对象（在数组中的空的位置上保存）
            for(int i=0;i<ua.length;i++){
                if(ua[i]==null){
                    ua[i]=a;
                    return 1;
                }
            }
            return -1;
        }
        //用户登录
        public static int login(String sname,int psd,information[] ua){
        //非空判断
        //根据用户输入的内容查找对应的用户
        for(int i=0;i<ua.length;i++){
            if(ua[i]!=null){
               //比较从数组里拿出的用户的用户名和密码输入的用户和密码是否匹配
            if(ua[i].sname.equals(sname)&& ua[i].psd==psd){
                   return 1;
               }
            }
        }
        return -1;
    }
        //开始测试
        public static String startGame(String animal,String month,String star,Datas[]ds) {
          String newName="";

          for(int i=0;i<ds.length;i++){
              if(ds[i]!=null){
                  //生肖
                  if(ds[i].category.equals("生肖")){
                      if(ds[i].yz.equals(animal)){
                          newName=newName+ds[i].xz;
                      }
                  }
                  //月份
                  if(ds[i].category.equals("月份")){
                      if(ds[i].yz.equals(month)){
                          newName=newName+ds[i].xz;
                      }
                  }
                  //星座
                  if(ds[i].category.equals("星座")){
                      if(ds[i].yz.equals(star)){
                          newName=newName+ds[i].xz;
                      }
                  }
              }
          }
          return  newName;
    }

}