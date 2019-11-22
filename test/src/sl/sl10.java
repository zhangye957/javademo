package sl;

import java.util.Scanner;
public class sl10 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int a=sr.nextInt();
        if(a>=60){
            String mark="成绩及格";
            System.out.println("考试成绩如何:"+mark);
        }else if(a<60){
            String mark="成绩不及格";
            System.out.println("考试成绩如何:"+mark);
    }
    }
}
