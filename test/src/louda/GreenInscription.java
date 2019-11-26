package louda;

import java.util.Random;

public class GreenInscription extends Inscription{
    private final static String insColor="绿色";
    private double adThough;  //3 穿透
    private double adDefence;  //4 防御
    private double apDefence;  //5 防御
    private double apThough; //6 穿透
    private String cd;  //7 功能
    private double lifeBack;  //8 功能
    private String apSuckBlood; //9 吸血
    private double backBloodPerFive; //10 功能

    public String getInsName()
    {
        return insName;
    }
    public String getInsColor()
    {
        return insColor;
    }
    public int getInsLevel()
    {
        return insLevel;
    }
    public double getAdAttack()
    {
        return adAttack;
    }
    public double getApAttack()
    {
        return apAttack;
    }
    public String getAttSpeed()
    {
        return attSpeed;
    }
    public void showIns() //展示本铭文所有内容
    {
        String result="";
        String r[];
        result+=("颜色:"+getInsColor()+" "+"名字:"+getInsName()+" ");
        result+=("等级:"+getInsLevel()+" ");
        r=this.getAttribute();
        for(int j=0;j<r.length;j++)
        {
            switch (r[j])
            {
                case "0":
                    result+=("物理攻击:+"+this.getAdAttack()+" ");break;
                case "1":
                    result+=("法术攻击:+"+this.getApAttack()+" ");break;
                case "2":
                    result+=("攻速:+"+this.getAttSpeed()+" ");break;
                case "3":
                    result+=("物理穿透:+"+this.getAdThough()+" ");break;
                case "4":
                    result+=("物理防御:+"+this.getAdDefence()+" ");break;
                case "5":
                    result+=("法术防御:+"+this.getApDefence()+" ");break;
                case "6":
                    result+=("法术穿透:+"+this.getApThough()+" ");break;
                case "7":
                    result+=("冷却缩减:+"+this.getCd()+" ");break;
                case "8":
                    result+=("生命回复:+"+this.getLifeBack()+" ");break;
                case "9":
                    result+=("法术吸血:+"+this.getApSuckBlood()+" ");break;
                case "10":
                    result+=("每5秒回血:+"+this.getBackBloodPerFive());break;
            }
        }
        System.out.println(result);
    }
    public double getAdThough()
    {
        return adThough;
    }
    public double getAdDefence()
    {
        return adDefence;
    }
    public double getApDefence()
    {
        return apDefence;
    }
    public double getApThough()
    {
        return apThough;
    }
    public double getLifeBack()
    {
        return lifeBack;
    }
    public double getBackBloodPerFive()
    {
        return backBloodPerFive;
    }
    public String getCd()
    {
        return cd;
    }
    public String getApSuckBlood()
    {
        return apSuckBlood;
    }

    public void greGetInfo(String insName)
    {
        Random rand=new Random();
        this.insName=insName;
        attribute=rand.nextInt(3)+1;  //属性个数随机[1,3]
        int index; //flag[]下标
        int k=0;
        int j;
        for(int i=0;i<attribute;i++) //属性随机
        {
            while (true)
            {
                index=rand.nextInt(11)+0;
                for(j=0;j<k;j++)
                {
                    if(flag[j]==index) //属性重复
                    {
                        break;
                    }
                }
                if(j==k) //属性没有重复
                {
                    break;
                }
            }
            flag[k++]=index;
            switch (index)
            {
                case 0:;
                case 1:category[0]=1;break;
                case 4:;
                case 5:category[2]=1;break;
                case 7:;
                case 8:;
                case 10:category[3]=1;break;
                case 9:category[4]=1;break;
                case 2:category[5]=1;break;
                case 3:;
                case 6:category[7]=1;break;
            }
        }
        k=0;
        this.insLevel=rand.nextInt(5)+1; //随机等级
        for(int i=0;i<attribute;i++)
        {
            switch(flag[k++])
            {
                case 0:
                    this.adAttack=this.doubleChoice[this.insLevel-1];break;
                case 1:
                    this.apAttack=this.doubleChoice[this.insLevel-1];break;
                case 2:
                    this.attSpeed=this.stringChoice[this.insLevel-1];break;
                case 3:
                    this.adThough=this.doubleChoice[this.insLevel-1];break;
                case 4:
                    this.adDefence=this.doubleChoice[this.insLevel-1];break;
                case 5:
                    this.apDefence=this.doubleChoice[this.insLevel-1];break;
                case 6:
                    this.apThough=this.doubleChoice[this.insLevel-1];break;
                case 7:
                    this.cd=this.stringChoice[this.insLevel-1];break;
                case 8:
                    this.lifeBack=this.doubleChoice[this.insLevel-1];break;
                case 9:
                    this.apSuckBlood=this.stringChoice[this.insLevel-1];break;
                case 10:
                    this.backBloodPerFive=this.doubleChoice[this.insLevel-1];break;
            }
        }
    }
}