package louda;

public class Inscription {
    protected double doubleChoice[]={1.1,2.1,3.1,4.1,5.1};
    protected String stringChoice[]={"%1.1","%2.1","%3.1","%4.1","%5.1"};
    protected int flag[]=new int[3];  //存放随机属性的序号
    protected int category[]=new int[8]; //存放铭文的类型
    protected String insName;
    protected int insLevel;
    protected int attribute;
    //    protected String category;  不需要类型
    protected double adAttack;  //0 攻击
    protected double apAttack;  //1 攻击
    protected String attSpeed;  //2 攻速
    Inscription()
    {

    }
    Inscription(String insName,String attSpeed,int insLevel,double adAttack,double apAttack)
    {
        this.insName=insName;
        this.attSpeed=attSpeed;
        this.insLevel=insLevel;
        this.adAttack=adAttack;
        this.apAttack=apAttack;
    }
    public int getAttributeNum() //返回该铭文属性个数
    {
        return this.attribute;
    }
    public String[] getAttribute() //返回该铭文属性序号
    {
        int k=this.getAttributeNum();
//        System.out.print("该铭文的属性个数:"+k+" ");
        String[]result=new String[k];
        for(int i=0;i<k;i++)
        {
            result[i]=""+flag[i];
        }
        return result;
    }
    public boolean judgeCategory(int type) //判断铭文的类型
    {
        if(category[type-1]==1)
            return true;
        return false;
    }
    public boolean judgeLevel(int level) //判断铭文的等级
    {
        if(level==insLevel)return true;
        return false;
    }

}
