package louda;

import java.util.Random;

public class OrangeInscription extends Inscription{
    private final static String insColor="橙色";
    private String criStrike;  //3 暴击
    private double adThrough;  //4 穿透
    private String criEffect;  //5 暴击
    private double maxLive;    //6 生命
    private String apThrough;  //7 穿透
    private String adSuckBlood;  //8 吸血
    private double adDefence;    //9 防御
    public void oraGetInfo(String insName)
    {
        Random rand=new Random();
        this.insName=insName;
        attribute=rand.nextInt(3)+1;  //属性个数随机[1,3]
        int index; //flag[]内容
        int k=0;
        int j;
        for(int i=0;i<attribute;i++) //属性随机
        {
            while (true)
            {
                index=rand.nextInt(10)+0;
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
                case 6:category[1]=1;break;
                case 9:category[2]=1;break;
                case 8:category[4]=1;break;
                case 2:category[5]=1;break;
                case 3:;
                case 5:category[6]=1;break;
                case 4:;
                case 7:category[7]=1;break;
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
                    this.criStrike=this.stringChoice[this.insLevel-1];break;
                case 4:
                    this.adThrough=this.doubleChoice[this.insLevel-1];break;
                case 5:
                    this.criEffect=this.stringChoice[this.insLevel-1];break;
                case 6:
                    this.maxLive=this.doubleChoice[this.insLevel-1];break;
                case 7:
                    this.apThrough=this.stringChoice[this.insLevel-1];break;
                case 8:
                    this.adSuckBlood=this.stringChoice[this.insLevel-1];break;
                case 9:
                    this.adDefence=this.doubleChoice[this.insLevel-1];break;
            }
        }
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
                    result+=("暴击率:+"+this.getCriStrike()+" ");break;
                case "4":
                    result+=("物理穿透:+"+this.getAdThrough()+" ");break;
                case "5":
                    result+=("暴击效果:+"+this.getCriEffect()+" ");break;
                case "6":
                    result+=("最大生命:+"+this.getMaxLive()+" ");break;
                case "7":
                    result+=("法术穿透:+"+this.getApThrough()+" ");break;
                case "8":
                    result+=("物理吸血:+"+this.getAdSuckBlood()+" ");break;
                case "9":
                    result+=("物理防御:+"+this.getAdDefence()+" ");break;
            }
        }
        System.out.println(result);
    }
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
    public String getCriStrike()
    {
        return criStrike;
    }
    public double getAdThrough()
    {
        return adThrough;
    }
    public String getCriEffect()
    {
        return criEffect;
    }
    public double getMaxLive()
    {
        return maxLive;
    }
    public String getApThrough()
    {
        return apThrough;
    }
    public String getAdSuckBlood()
    {
        return adSuckBlood;
    }
    public double getAdDefence()
    {
        return adDefence;
    }

}