package sl;

public class sl18 {
    public static void main(String[] args) {
        int sum=0,i;
        for(i=1;i<=100;i++){
            if(i%3!=0){
                sum=sum+i;
            }
        }
        System.out.println("1到100之间不能被3整除的数之和为:"+sum);
    }
}
