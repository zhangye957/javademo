package sl;

public class sl17 {
    public static void main(String[] args) {
        int sum=0;
        int num=2;
        do{
            sum=sum+num;
            num=num+2;
        }while(num>=1&&num<=50);
        System.out.println("50以内的偶数之和为："+sum);
    }
}
