package adf;

public class az2 {
    public static void main(String[] args) {
        az1 s=new az1();
        s.show();
        System.out.println("______________");
        s.name="小白";
        s.age=27;
        s.aseAge(27);
        s.show();
        System.out.println("——————————————————————————————");
        s.age=-27;
        s.aseAge(-27);
        s.show();
        System.out.println("__________");
    }
}
