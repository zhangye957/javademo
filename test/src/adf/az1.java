package adf;

public class az1 {
    String name;
    public int age;
    public void aseAge(int a){
        if(a<0||a>120){
            System.out.println("你的年龄有问题");
        }else{
            age=a;
        }
    }
    public void show(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
    }
}
