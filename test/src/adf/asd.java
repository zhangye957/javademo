package adf;

public class asd {
    static {
        System.out.println("静态代码块");
    }
    {
        System.out.println("构造代码块");
    }
    public asd(){
        System.out.println("构造方法");
    }
}
