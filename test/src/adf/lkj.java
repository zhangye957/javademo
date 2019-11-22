package adf;
import java.util.Scanner;
public class lkj {
    public static void main (String [] args) {
        Scanner ss = new Scanner(System.in);
            int tt =ss.nextInt();
             int ge =tt%10;
             int shi =tt/10%10;
             int bai =tt/100;
            if ( ge * ge * ge + shi * shi * shi + bai * bai * bai ==tt){
                System.out.println("水仙花");
            }
            else {
                System.out.println("不是水仙花");
            }
         }



    }
