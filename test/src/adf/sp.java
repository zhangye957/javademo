package adf;

import java.util.Scanner;
public class sp {
    public static void main(String[] args) {
        boolean key=true;
        Scanner sr=new Scanner(System.in);
        lj f1= new lj();
        lj f2= new lj();
        lj f3= new lj();
        f1.sname="多宝阁";
        f1.wq="灵剑";
        f1.scolor='紫';
        f1.gongneng = "御剑";
        f1.show= "拍卖";
        f2.sname="多宝阁";
        f2.wq="灵剑";
        f2.scolor='黑';
        f2.gongneng = "御剑";
        f2.show= "拍卖";
        f3.sname="多宝阁";
        f3.wq="灵剑";
        f3.scolor='银';
        f3.gongneng = "御剑";
        f3.show= "拍卖";
        lj[] arr=new lj[3];
        arr[0]=f1;
        arr[1]=f2;
        arr[2]=f3;

        while (key){
            System.out.println("++++++++++++");
            System.out.println("欢迎来到多宝阁");
            System.out.println("请选择以下珍宝：");
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=null){
                    System.out.println("珍宝序号:"+i+"  珍宝名称:"+arr[i].sname+"  珍宝颜色:"+arr[i].scolor+"  珍宝功能:"
                            +arr[i].gongneng+"  珍宝拍卖:"+arr[i].show);
                }
            }
            System.out.println("请选择想要拍买的珍宝：");
            int k=sr.nextInt();
            if(k<arr.length&&k>=0){
                System.out.println("珍宝序号:"+k+"  珍宝名称:"+arr[k].sname+"  珍宝颜色:"+arr[k].scolor+"  珍宝功能:"
                        +arr[k].gongneng+"  珍宝拍卖:"+arr[k].show);
            }else{
                System.out.println("您选择的珍宝"+k+"不存在");
            }
            System.out.println("是否继续拍卖，继续请输入1，不继续请输入不是1的数字");
            int jk = sr.nextInt();
            if(jk==1){
                key=true;
            }else{
                key=false;
            }
        }
    }
}
