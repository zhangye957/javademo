package lianxi.灵兽;

import java.util.Scanner;
public class ZhangXianSheng {
    static Zhang[] arr = new Zhang[100];
    static String[] ass = new String[5];
    static int[] aee = new int[5];
    static{
        ass[0]="java";
        ass[1]="峨眉";
        ass[2]="华山";
        ass[3]="朝廷";
        ass[4]="丐帮";
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名字");
        String h=sc.next();
        System.out.println("请在java   峨眉  华山  朝廷  丐帮 ");
        System.out.println("请输入门派");
        String h2=sc.next();
        System.out.println("请输入性别");
        String h3=sc.next();
        System.out.println("请输入年龄");
        int h4 = sc.nextInt();



        Zhang xc = new Zhang(h,h2,h3,h4);
        int u =jilu(xc,arr);

        int o =renshu(xc,ass,aee);
        if (o == 1){

        }else {
            System.out.println("你选择的这个门派人满了，请重新选择 ");
        }





        int i = denglu(new Zhang(h,h2,h3,h4));
        if (i==1){
            System.out.println("欢迎进入灵境");
        }else{
            System.out.println("你不能进入灵境");
        }
    }
    public static int denglu(Zhang a){
        if (a != null){
            if (a.l<10 || a.l>30){
                return -1;
            }
        }return 1;
    }
    public static int jilu(Zhang a,Zhang[] arr){

        for (int i = 0;i<arr.length;i++){
            if (arr[i] != null){
                if (arr[i].x.equals(a.x)){
                    return -1;
                }
            }
        }

        for (int i =0;i<arr.length;i++){
            if (arr[i] == null){
                arr[i]=a;
                return 1;
            }
        }return -1;
    }

    public static int renshu(Zhang a,String[] arr,int[] ass){
        if (a != null){
            for(int i=0;i<arr.length;i++){
                if (arr[i]!=null && arr[i].equals(a.a)){
                    if (ass[i] < 10){
                        ass[i]++;
                        return -1;
                    }
                }
            }
        }return 1;
    }
}