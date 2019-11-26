package louda;

import java.util.Random;

public class BlueInscription extends Inscription{
    private final static String insColor="蓝色";
    private double maxLife;  //3 生命
    private double backBloodPerFive; //4 功能
    private double moveSpeed; //5 功能
    private double adSuckBlood;  //6 吸血
    private double apSuckBlood; //7 吸血
    private double apDefence; //8 防御
    private String criStrike;  //9 暴击

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
    public double getMaxLife()
    {
        return maxLife;
    }
    public double getBackBloodPerFive()
    {
        return backBloodPerFive;
    }
    public double getMoveSpeed()
    {
        return moveSpeed;
    }
    public double getAdSuckBlood()
    {
        return adSuckBlood;
    }
    public double getApSuckBlood()
    {
        return apSuckBlood;
    }
    public double getApDefence()
    {
        return apDefence;
    }
    public String getCriStrike()
    {
        return criStrike;
    }

    public void bluGetInfo(String insName)
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
                case 3:category[1]=1;break;
                case 8:category[2]=1;break;
                case 4:;
                case 5:category[3]=1;break;
                case 6:;
                case 7:category[4]=1;break;
                case 2:category[5]=1;break;
                case 9:category[6]=1;break;
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
                    this.maxLife=this.doubleChoice[this.insLevel-1];break;
                case 4:
                    this.backBloodPerFive=this.doubleChoice[this.insLevel-1];break;
                case 5:
                    this.moveSpeed=this.doubleChoice[this.insLevel-1];break;
                case 6:
                    this.adSuckBlood=this.doubleChoice[this.insLevel-1];break;
                case 7:
                    this.apSuckBlood=this.doubleChoice[this.insLevel-1];break;
                case 8:
                    this.apDefence=this.doubleChoice[this.insLevel-1];break;
                case 9:
                    this.criStrike=this.stringChoice[this.insLevel-1];break;
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
                    result+=("最大生命:+"+this.getMaxLife()+" ");break;
                case "4":
                    result+=("每5秒回血:+"+this.getBackBloodPerFive()+" ");break;
                case "5":
                    result+=("移速:+"+this.getMoveSpeed()+" ");break;
                case "6":
                    result+=("物理吸血:+"+this.getAdSuckBlood()+" ");break;
                case "7":
                    result+=("法术吸血:+"+this.getApSuckBlood()+" ");break;
                case "8":
                    result+=("法术防御:+"+this.getApDefence()+" ");break;
                case "9":
                    result+=("暴击率:+"+this.getCriStrike()+" ");break;
            }
        }
        System.out.println(result);
    }
}