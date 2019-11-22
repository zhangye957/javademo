package game.zhouce;

public class ShuZu {
    String category;//数据类型
    String yz;//原始值
    String xz;//新的值

    //无参构造方法
    public ShuZu() {

    }

    //有参构造方法
    public ShuZu(String c, String y, String x) {
        this.category = c;
        this.yz = y;
        this.xz = x;
    }

}
