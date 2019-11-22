package game.zhouce;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class Ling {
    public static void main(String[] args) {
        boolean r=true;
    //程序初始化
        Scanner sr=new Scanner(System.in);
        System.out.println("请输入姓名，宗门，性别，年龄");
        String a1=sr.next();
        String a2=sr.next();
        String a3=sr.next();
        int a4=sr.nextInt();
        Ren f1=new Ren();
        Ren f2=new Ren();
        Ren f3=new Ren();
        Ren f4=new Ren();
        Ren f5=new Ren();
        int ad=renname(a1,a2,a3,a4);
        if(ad==1){
//            System.out.println("您好，欢迎进入灵境");
        }else{
            System.out.println("您没有资格进入灵境");
            return;
        }
//        f1.rname="张冶";
//        f1.rmp="逆河宗";
//        f1.rsex="男";
//        f1.rnl=21;
//        f2.rname="A";
//        f2.rmp="逆河宗";
//        f2.rsex="男";
//        f2.rnl=20;
//        f3.rname="B";
//        f3.rmp="逆河宗";
//        f3.rsex="男";
//        f3.rnl=19;
//        f4.rname="C";
//        f4.rmp="逆河宗";
//        f4.rsex="女";
//        f4.rnl=18;
//        f5.rname="D";
//        f5.rmp="逆河宗";
//        f5.rsex="女";
//        f5.rnl=9;
//        Ren[] arr= new Ren[5];
//        arr[0]=f1;
//        arr[1]=f2;
//        arr[2]=f3;
//        arr[3]=f4;
//        arr[4]=f5;
//        for(int j=0;j<arr.length;j++){
//            if(arr[j]!=null){
//                System.out.println("身份序号："+j+"   弟子姓名："+arr[j].rname+"       弟子门派："+arr[j].rmp+"   弟子性别："
//                        +arr[j].rsex +"   弟子年龄："+arr[j].rnl);
//            }
//        }
//        System.out.println("这位弟子您的身份是：");
//        int l=sr.nextInt();
//        if(arr[l].rnl==arr[4].rnl){
//            System.out.println("您的年龄不符合进入灵境的条件，禁止进入！");
//            return;
//        }
//        if(l<arr.length&&l>=0){
//            System.out.println("身份序号："+l+"   弟子姓名："+arr[l].rname+"       弟子门派："+arr[l].rmp+"   弟子性别："
//                    +arr[l].rsex +"   弟子年龄："+arr[l].rnl);
//        }else{
//            System.out.println("您选择的身份+l+不存在");
//        }
        LingShou d1=new LingShou();
        LingShou d2=new LingShou();
        LingShou d3=new LingShou();
        LingShou d4=new LingShou();
        LingShou d5=new LingShou();
        LingShou d6=new LingShou();
        LingShou d7=new LingShou();
        LingShou d8=new LingShou();
        LingShou d9=new LingShou();
        LingShou d10=new LingShou();
        d1.lsname="乌鸦";
        d1.lssx="飞行类";
        d1.lsnl=1;
        d1.lsdj="20级";
        d1.lsjn="在空中形态下会发出一道光袭击敌方";
        d2.lsname="灵兔";
        d2.lssx="陆地类";
        d2.lsnl=1;
        d2.lsdj="20级";
        d2.lsjn="突然间一跃踹向敌方";
        d3.lsname="狼王";
        d3.lssx="陆地类";
        d3.lsnl=2;
        d3.lsdj="30级";
        d3.lsjn="类似于狮吼功，敌方进入眩晕状态";
        d4.lsname="大鹏";
        d4.lssx="飞行类";
        d4.lsnl=2;
        d4.lsdj="30级";
        d4.lsjn="在空中形态下会召唤出飓风吹向敌方";
        d5.lsname="鹿仙";
        d5.lssx="陆地类";
        d5.lsnl=3;
        d5.lsdj="40级";
        d5.lsjn="被鹿仙盯上的生物会产生3到5秒的恐惧，鹿仙的主人移动速度加成20%";
        d6.lsname="深海巨鳄";
        d6.lssx="两栖类";
        d6.lsnl=3;
        d6.lsdj="40级";
        d6.lsjn="在陆地上近身搏斗咬住对方撕扯，在水里移动速度加成20%，伤害加成20%";
        d7.lsname="七彩蝴蝶";
        d7.lssx="飞行类";
        d7.lsnl=4;
        d7.lsdj="50级";
        d7.lsjn="在空中形态下会发出一声尖锐的鸣叫，四周1000米的虫类会陷入疯狂状态听从于七彩蝴蝶主人的命令";
        d8.lsname="山神";
        d8.lssx="陆地类";
        d8.lsnl=4;
        d8.lsdj="50级";
        d8.lsjn="山神进入战斗状态会将自己的体型变成山的大小，一拳之下敌方灰飞烟灭，弱点：由于体型太大，移动速度减少50%";
        d9.lsname="鲲鹏";
        d9.lssx="全能型";
        d9.lsnl=10;
        d9.lsdj="100级";
        d9.lsjn="即拥有着巨大的体型还拥有世间极速、力量，被鲲鹏盯上的猎物没有可以逃脱的，极速打击";
        d10.lsname="真龙";
        d10.lssx="全能型";
        d10.lsnl=10;
        d10.lsdj="100级";
        d10.lsjn="拥有着不死不坏的身躯，法术能力依然超群，近战还是远程少有敌手";
        LingShou[] srr=new LingShou[10];
        srr[0]=d1;
        srr[1]=d2;
        srr[2]=d3;
        srr[3]=d4;
        srr[4]=d5;
        srr[5]=d6;
        srr[6]=d7;
        srr[7]=d8;
        srr[8]=d9;
        srr[9]=d10;
        System.out.println("您好，欢迎进入灵境，请选择自己想要的灵兽");
        System.out.println("灵境之内禁止厮杀，一旦被界灵发现，将会直接抹除此人");
        for(int i=0;i<srr.length;i++){
            if(srr[i]!=null){
                System.out.println("灵兽序号："+i+"       灵兽名字："+srr[i].lsname+"   灵兽属性："+srr[i].lssx+"       灵兽能力："+srr[i].lsnl+"" +
                        "       灵兽等级："+srr[i].lsdj+"       灵兽技能："+srr[i].lsjn);
            }
        }
        System.out.println("请选择您想要的灵兽：");
        int k=sr.nextInt();
        if(k<srr.length&&k>=0){
            System.out.println("灵兽序号："+k+"       灵兽名字："+srr[k].lsname+"   灵兽属性："+srr[k].lssx+"       灵兽能力："+srr[k].lsnl+"" +
                    "       灵兽等级："+srr[k].lsdj+"       灵兽技能："+srr[k].lsjn);
        }else{
            System.out.println("您选择的灵兽"+k+"不存在");
        }
        System.out.println("请计算1+2的和为:");
        while(r){
        int s=sr.nextInt();
        if(s==3) {
            System.out.println("答案正确，捕捉成功");
            double q=Math.random()*10;
            long a=Math.round(q);
            System.out.println(a);
            if(a>0&&a<4){
                System.out.println("你的灵兽的等级为一般");
            }else if(a>3&&a<7){
                System.out.println("你的灵兽的等级为中等");
            }else if(a>6&&a<10){
                System.out.println("你的灵兽的等级为优秀");
            }else {
                System.out.println("你的灵兽的等级为极品");
            }
            return;
        }else{
            System.out.println("答案错误");
            System.out.println("如果弟子你信心十足想要继续捕捉请摁1");
            Scanner in=new Scanner(System.in);
                int f=in.nextInt();
                if(f==1) {
                    System.out.println("请重新输入答案");
                } else{
                    System.out.println("如果不想捕捉请摁除了1的数字");
                    r=false;
                }
            }

        }

    }
    public static int renname(String rname,String rmp,String rsex,int rnl){
        Ren mz=new Ren();
        mz.rname=rname;
        mz.rmp=rmp;
        mz.rsex=rsex;
        mz.rnl=rnl;
        if(rnl<10||rnl>30){
            System.out.println("");
            return -1;
        }
        return 1;
    }

}



