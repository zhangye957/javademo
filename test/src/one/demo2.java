package one;

public class demo2 {
    public static void main(String[] args){
        int x=1,s=0;
        for(x=1;x<=100;x++){
            if(x%2 !=0){
                s=s+x;
            }
        }
        System.out.println(s);
    }
}
