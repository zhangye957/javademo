package lianxi.商品测试;

import java.util.Scanner;
public class sd {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        boolean k = true;
        wq f1 = new wq();
        wq f2 = new wq();
        wq f3 = new wq();
        f1.name = "灵剑";
        f1.jiage = "100";
        f1.color = "纯白色";
        f2.name = "光剑";
        f2.jiage = "200";
        f2.color = "金色";
        f3.name = "葬剑";
        f3.jiage = "300";
        f3.color = "血红色";
        wq[] arr = new wq[5];
        arr[0] = f1;
        arr[1] = f2;
        arr[2] = f3;
        while (k) {
        System.out.println("============");
        System.out.println("欢迎来到我的小店");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println("商品序号" + i + "商品名字：" + arr[i].name + "商品价格：" + arr[i].jiage + "商品颜色：" + arr[i].color);
            }
        }
        System.out.println("请选择商品");
            int m = sr.nextInt();
            if (m < arr.length && m >= 0) {
                System.out.println("商品序号" + m + "商品名字：" + arr[m].name + "商品价格：" + arr[m].jiage + "商品颜色：" + arr[m].color);
            } else {
                System.out.println("您选的商品+m+不存在");
            }
            System.out.println("是否继续拍卖，继续请输入1，不继续请输入不是1的数字");
            int l=sr.nextInt();
            if(l==1){
                k=true;
            }else{
                k=false;
            }
        }
    }
}