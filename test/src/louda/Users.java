package louda;

import java.util.Scanner;

public class Users {
    private String account; //用户名
    private String passwd;
    private OrangeInscription myOraIns[]=new OrangeInscription[10];
    private BlueInscription myBluIns[]=new BlueInscription[10];
    private GreenInscription myGreIns[]=new GreenInscription[10];
    private double totalAttribute1[]=new double[12];  //总double属性
    private String totalAttribute2[]=new String[7];  //总String属性
    private int oraIndex; //橙色下标
    private int bluIndex; //蓝色下标
    private int greIndex; //绿色下标
    Users(String account,String passwd)
    {
        this.account=account;
        this.passwd=passwd;
    }
    public void setAccount(String account)
    {
        this.account=account;
    }
    public void setPasswd(String passwd)
    {
        this.passwd=passwd;
    }
    public String getAccount()
    {
        return this.account;
    }
    public String getPasswd()
    {
        return this.passwd;
    }
    public void setOraIns(OrangeInscription oraIns)
    {
        if(oraIndex>=10)
        {
            System.out.println("该橙色铭文已放满！");
            return;
        }
        myOraIns[oraIndex++]=oraIns;
        String[]r=oraIns.getAttribute();
        for(int j=0;j<r.length;j++)
        {
            switch (r[j])
            {
                case "0":
                    totalAttribute1[0]+=oraIns.getAdAttack();
                    break;
                case "1":
                    totalAttribute1[1]+=oraIns.getApAttack();
                    break;
                case "2":
                    totalAttribute2[0]=stringAdd(totalAttribute2[0],oraIns.getAttSpeed());
                    break;
                case "3":
                    totalAttribute2[1]=stringAdd(totalAttribute2[1],oraIns.getCriStrike());
                    break;
                case "4":
                    totalAttribute1[2]+=oraIns.getAdThrough();
                    break;
                case "5":
                    totalAttribute2[2]=stringAdd(totalAttribute2[2],oraIns.getCriEffect());
                    break;
                case "6":
                    totalAttribute1[3]+=oraIns.getMaxLive();
                    break;
                case "7":
                    totalAttribute2[3]=stringAdd(totalAttribute2[3],oraIns.getApThrough());
                    break;
                case "8":
                    totalAttribute2[4]=stringAdd(totalAttribute2[4],oraIns.getAdSuckBlood());
                    break;
                case "9":
                    totalAttribute1[4]+=oraIns.getAdDefence();
                    break;
            }
        }
    }
    public void setBluIns(BlueInscription bluIns)
    {
        if(bluIndex>=10)
        {
            System.out.println("该蓝色铭文已放满！");
            return;
        }
        myBluIns[bluIndex++]=bluIns;
        String[]r=bluIns.getAttribute();
        for(int j=0;j<r.length;j++)
        {
            switch (r[j])
            {
                case "0":
                    totalAttribute1[0]+=bluIns.getAdAttack();
                    break;
                case "1":
                    totalAttribute1[1]+=bluIns.getApAttack();
                    break;
                case "2":
                    totalAttribute2[0]=stringAdd(totalAttribute2[0],bluIns.getAttSpeed());
                    break;
                case "3":
                    totalAttribute1[3]+=bluIns.getMaxLife();
                    break;
                case "4":
                    totalAttribute1[5]+=bluIns.getBackBloodPerFive();
                    break;
                case "5":
                    totalAttribute1[6]+=bluIns.getMoveSpeed();
                    break;
                case "6":
                    totalAttribute1[7]+=bluIns.getAdSuckBlood();
                    break;
                case "7":
                    totalAttribute1[8]+=bluIns.getApSuckBlood();
                    break;
                case "8":
                    totalAttribute1[9]+=bluIns.getApDefence();
                    break;
                case "9":
                    totalAttribute2[1]=stringAdd(totalAttribute2[1],bluIns.getCriStrike());
                    break;
            }
        }
    }
    public void setGreIns(GreenInscription greIns)
    {
        if(greIndex>=10)
        {
            System.out.println("该绿色铭文已放满！");
            return;
        }
        myGreIns[greIndex++]=greIns;
        String[] r=greIns.getAttribute();
        for(int j=0;j<r.length;j++)
        {
            switch (r[j])
            {
                case "0":
                    totalAttribute1[0]+=greIns.getAdAttack();
                    break;
                case "1":
                    totalAttribute1[1]+=greIns.getApAttack();
                    break;
                case "2":
                    totalAttribute2[0]=stringAdd(totalAttribute2[0],greIns.getAttSpeed());
                    break;
                case "3":
                    totalAttribute1[2]+=greIns.getAdThough();
                    break;
                case "4":
                    totalAttribute1[4]+=greIns.getAdDefence();
                    break;
                case "5":
                    totalAttribute1[9]+=greIns.getApDefence();
                    break;
                case "6":
                    totalAttribute1[10]+=greIns.getApThough();
                    break;
                case "7":
                    totalAttribute2[5]=stringAdd(totalAttribute2[5],greIns.getCd());
                    break;
                case "8":
                    totalAttribute1[11]+=greIns.getLifeBack();
                    break;
                case "9":
                    totalAttribute2[6]=stringAdd(totalAttribute2[6],greIns.getApSuckBlood());
                    break;
                case "10":
                    totalAttribute1[5]+=greIns.getBackBloodPerFive();
                    break;
            }
        }
    }
    public int getOraNum()
    {
        return oraIndex;
    }
    public int getBluNum()
    {
        return bluIndex;
    }
    public int getGreNum()
    {
        return greIndex;
    }
    public void choiceIns(Scanner sc,OrangeInscription[]oraIns,BlueInscription[]bluIns,GreenInscription[]greIns) //选择铭文
    {
        int color;
        int type;
        int level;
        int flag[]=new int[32]; //标记数组
        int count; //flag相关计数器
        int num; //用户所选铭文序号
        int amount;//所选铭文数量
        int lable1;
//      String insCategory[]={"攻击","生命","防御","功能","吸血","攻速","暴击","穿透"};
        while(true)   //每次大循环选择任意数量的一种铭文，选够30才能离开循环
        {
            count=0;
            lable1=0;
            System.out.println("铭文颜色有：1橙色，2蓝色，3绿色");
            while (true)
            {
                System.out.println("请客官先按序号选择铭文颜色:");
                color = sc.nextInt();
                if (color != 1 && color != 2 && color != 3) continue;
                else break;
            }
            System.out.println("铭文大概类型有：1攻击,2生命,3防御,4功能,5吸血,6攻速,7暴击,8穿透");
            while (true)
            {
                System.out.println("请客官按序号选择类型:");
                type = sc.nextInt();
                if (type != 1 && type != 2 && type != 3 && type != 4 && type != 5 && type != 6 && type != 7 && type != 8)
                    continue;
                else
                    break;
            }
            System.out.println("铭文等级有1，2，3，4，5");
            while (true)
            {
                System.out.println("请客官选择相应等级:");
                level = sc.nextInt();
                if (level != 1 && level != 2 && level != 3 && level != 4 && level != 5) continue;
                else break;
            }
            System.out.println("请根据序号选择相应铭文及数量，之间空格隔开！");
            int number=1;

            if (color == 1)  //橙色
            {
                int i;
                for (i = 0; i < oraIns.length; i++)
                {
                    if (oraIns[i].judgeCategory(type) && oraIns[i].judgeLevel(level))
                    {
                        System.out.print((number++)+":");
                        oraIns[i].showIns();
                        flag[count++]=i;
                        lable1=1;
                    }
                }
                if (lable1!=1)
                {
                    System.out.println("没有满足条件的铭文!");
                    continue;
                }
                num=sc.nextInt();
                amount=sc.nextInt();
                if(amount>10-(oraIndex))
                {
                    amount=10-(oraIndex);
                }
                for(int j=0;j<amount;j++)
                {
                    this.setOraIns(oraIns[flag[num-1]]);
                }
            }
            else if (color == 2) //蓝色
            {
                number=1;
                int i;
                for (i = 0; i < bluIns.length; i++)
                {
                    if (bluIns[i].judgeCategory(type) && bluIns[i].judgeLevel(level))
                    {
                        System.out.print((number++)+":");
                        bluIns[i].showIns();
                        flag[count++]=i;
                        lable1=1;
                    }
                }
                if (lable1!=1)
                {
                    System.out.println("没有满足条件的铭文!");
                    continue;
                }
                num=sc.nextInt();
                amount=sc.nextInt();
                if(amount>10-(bluIndex))
                {
                    amount=10-(bluIndex);
                }
                for(int j=0;j<amount;j++)
                {
                    this.setBluIns(bluIns[flag[num-1]]);
                }
            }
            else  //绿色
            {
                number=1;
                int i;
                for (i = 0; i < greIns.length; i++)
                {
                    if (greIns[i].judgeCategory(type) && greIns[i].judgeLevel(level))
                    {
                        System.out.print((number++)+":");
                        greIns[i].showIns();
                        flag[count++]=i;
                        lable1=1;
                    }
                }
                if (lable1!=1)
                {
                    System.out.println("没有满足条件的铭文!");
                    System.out.println("====================================================");
                    continue;
                }
                num=sc.nextInt();
                amount=sc.nextInt();
                if(amount>10-(greIndex))
                {
                    amount=10-(greIndex);
                }
                for(int j=0;j<amount;j++)
                {
                    this.setGreIns(greIns[flag[num-1]]);
                }
            }
            showTempAll();
            if(oraIndex<=9 || bluIndex<=9 || greIndex<=9)
            {
                System.out.println("尚有某颜色铭文没有装备完");
            }
            else
            {
                System.out.println("您的铭文已装备完毕!是否确认?,不确认的话之前操作将会全部撤销！");
                System.out.print("确认请按1，不确认请按2");
                int key;
                while (true) {
                    key = sc.nextInt();
                    if (key == 1) return;
                    else if(key==2)
                    {
                        oraIndex=bluIndex=greIndex=0;
                        break;
                    }
                    else
                    {
                        System.out.print("您输入有误！请重新输入:");
                    }
                }
            }
            System.out.println("====================================================");
        } //while

    }
    public void showTempAll()  //展示当前所选择的铭文及总加持属性
    {
        String result="";
        String r[];
        System.out.println("橙色铭文个数："+oraIndex);
        for(int i=0;i<oraIndex;i++)
        {
            result+=("颜色:"+myOraIns[i].getInsColor()+" "+"名字:"+myOraIns[i].getInsName()+" ");
            result+=("等级:"+myOraIns[i].getInsLevel()+" ");
            r=myOraIns[i].getAttribute();
            for(int j=0;j<r.length;j++)
            {
                switch (r[j])
                {
                    case "0":
                        result+=("物理攻击:+"+myOraIns[i].getAdAttack()+" ");
                        break;
                    case "1":
                        result+=("法术攻击:+"+myOraIns[i].getApAttack()+" ");
                        break;
                    case "2":
                        result+=("攻速:+"+myOraIns[i].getAttSpeed()+" ");
                        break;
                    case "3":
                        result+=("暴击率:+"+myOraIns[i].getCriStrike()+" ");
                        break;
                    case "4":
                        result+=("物理穿透:+"+myOraIns[i].getAdThrough()+" ");
                        break;
                    case "5":
                        result+=("暴击效果:+"+myOraIns[i].getCriEffect()+" ");
                        break;
                    case "6":
                        result+=("最大生命:+"+myOraIns[i].getMaxLive()+" ");
                        break;
                    case "7":
                        result+=("法术穿透:+"+myOraIns[i].getApThrough()+" ");
                        break;
                    case "8":
                        result+=("物理吸血:+"+myOraIns[i].getAdSuckBlood()+" ");
                        break;
                    case "9":
                        result+=("物理防御:+"+myOraIns[i].getAdDefence());
                        break;
                }
            }
            System.out.println(result);
            result="";
        }
        System.out.println("蓝色铭文个数："+bluIndex);
        for(int i=0;i<bluIndex;i++)
        {
            result+=(myBluIns[i].getInsColor()+" "+myBluIns[i].getInsName()+" ");
            result+=(myBluIns[i].getInsLevel()+" ");
            r=myBluIns[i].getAttribute();
            for(int j=0;j<r.length;j++)
            {
                switch (r[j])
                {
                    case "0":
                        result+=("物理攻击:+"+myBluIns[i].getAdAttack()+" ");
                        break;
                    case "1":
                        result+=("法术攻击:+"+myBluIns[i].getApAttack()+" ");
                        break;
                    case "2":
                        result+=("攻速:+"+myBluIns[i].getAttSpeed()+" ");
                        break;
                    case "3":
                        result+=("最大生命:+"+myBluIns[i].getMaxLife()+" ");
                        break;
                    case "4":
                        result+=("每5秒回血:+"+myBluIns[i].getBackBloodPerFive()+" ");
                        break;
                    case "5":
                        result+=("移速:+"+myBluIns[i].getMoveSpeed()+" ");
                        break;
                    case "6":
                        result+=("物理吸血:+"+myBluIns[i].getAdSuckBlood()+" ");
                        break;
                    case "7":
                        result+=("法术吸血:+"+myBluIns[i].getApSuckBlood()+" ");
                        break;
                    case "8":
                        result+=("法术防御:+"+myBluIns[i].getApDefence()+" ");
                        break;
                    case "9":
                        result+=("暴击率:+"+myBluIns[i].getCriStrike()+" ");
                        break;
                }
            }
            System.out.println(result);
            result="";
        }
        System.out.println("绿色铭文个数："+greIndex);
        for(int i=0;i<greIndex;i++)
        {
            result+=(myGreIns[i].getInsColor()+" "+myGreIns[i].getInsName()+" ");
            result+=(myGreIns[i].getInsLevel()+" ");
            r=myGreIns[i].getAttribute();
            for(int j=0;j<r.length;j++)
            {
                switch (r[j])
                {
                    case "0":
                        result+=("物理攻击:+"+myGreIns[i].getAdAttack()+" ");
                        break;
                    case "1":
                        result+=("法术攻击:+"+myGreIns[i].getApAttack()+" ");
                        break;
                    case "2":
                        result+=("攻速:+"+myGreIns[i].getAttSpeed()+" ");
                        break;
                    case "3":
                        result+=("物理穿透:+"+myGreIns[i].getAdThough()+" ");
                        break;
                    case "4":
                        result+=("物理防御:+"+myGreIns[i].getAdDefence()+" ");
                        break;
                    case "5":
                        result+=("法术防御:+"+myGreIns[i].getApDefence()+" ");
                        break;
                    case "6":
                        result+=("法术穿透:+"+myGreIns[i].getApThough()+" ");
                        break;
                    case "7":
                        result+=("冷却缩减:+"+myGreIns[i].getCd()+" ");
                        break;
                    case "8":
                        result+=("生命回复:+"+myGreIns[i].getLifeBack()+" ");
                        break;
                    case "9":
                        result+=("法术吸血:+"+myGreIns[i].getApSuckBlood()+" ");
                        break;
                    case "10":
                        result+=("每5秒回血:+"+myGreIns[i].getBackBloodPerFive()+" ");
                        break;
                }
            }
            System.out.println(result);
            result="";
        }
        System.out.println("=========================================================================");
        System.out.println("总加持属性:");
        for(int i=0;i<totalAttribute1.length;i++)  //遍历double数组
        {
            if(Math.abs(totalAttribute1[i]-0.0)>1e-6)  //该属性不为空
            {
                switch (i)
                {
                    case 0:
                        System.out.println("物理攻击:"+String.format("%.2f",totalAttribute1[i]));
                        break;
                    case 1:
                        System.out.println("法术攻击:+"+String.format("%.2f",totalAttribute1[i]));
                        break;
                    case 2:
                        System.out.println("物理穿透:+"+String.format("%.2f",totalAttribute1[i]));
                        break;
                    case 3:
                        System.out.println("最大生命:+"+String.format("%.2f",totalAttribute1[i]));
                        break;
                    case 4:
                        System.out.println("物理防御:+"+String.format("%.2f",totalAttribute1[i]));
                        break;
                    case 5:
                        System.out.println("每5秒回血:+"+String.format("%.2f",totalAttribute1[i]));
                        break;
                    case 6:
                        System.out.println("移速:+"+String.format("%.2f",totalAttribute1[i]));
                        break;
                    case 7:
                        System.out.println("物理吸血:+"+String.format("%.2f",totalAttribute1[i]));
                        break;
                    case 8:
                        System.out.println("法术吸血:+"+String.format("%.2f",totalAttribute1[i]));
                        break;
                    case 9:
                        System.out.println("法术防御:+"+String.format("%.2f",totalAttribute1[i]));
                        break;
                    case 10:
                        System.out.println("法术穿透:+"+String.format("%.2f",totalAttribute1[i]));
                        break;
                    case 11:
                        System.out.println("生命回复:+"+String.format("%.2f",totalAttribute1[i]));
                        break;
                }
            }
        }
        for(int i=0;i<totalAttribute2.length;i++)  //遍历String数组
        {
            if(totalAttribute2[i]!=null)
            {
                switch (i)
                {
                    case 0:
                        System.out.println("攻速:+"+totalAttribute2[i]);
                        break;
                    case 1:
                        System.out.println("暴击率:+"+totalAttribute2[i]);
                        break;
                    case 2:
                        System.out.println("暴击效果:+"+totalAttribute2[i]);
                        break;
                    case 3:
                        System.out.println("法术穿透:+"+totalAttribute2[i]);
                        break;
                    case 4:
                        System.out.println("物理吸血:+"+totalAttribute2[i]);
                        break;
                    case 5:
                        System.out.println("冷却缩减:+"+totalAttribute2[i]);
                        break;
                    case 6:
                        System.out.println("法术吸血:+"+totalAttribute2[i]);
                        break;

                }
            }
        }
        System.out.println("=========================================================================");
    }
    public String stringAdd(String a,String b)
    {
        if(a==null)a="%0.0";
        double c=Double.parseDouble(a.substring(1));
        double d=Double.parseDouble(b.substring(1));
        String m="%"+(c+d);
        if(m.length()>6)
            return m.substring(0,6);
        else
            return m;
    }
}
