
import java.util.Scanner;
public class Marks_calc {
    public static void main(String[] args) {
        float math,physics,english,hindi,chemistry=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Math marks");
    math=sc.nextInt();
     System.out.println("Enter physics marks");
    physics=sc.nextInt();
     System.out.println("Enter english marks");
    english=sc.nextInt();
     System.out.println("Enter hindi marks");
    hindi=sc.nextInt();
     System.out.println("Enter chemistry marks");
    chemistry=sc.nextInt();
    float total=math+physics+english+chemistry+hindi;
   float percentage=total/5;
   System.out.println("Percentage:"+percentage);
   sc.close();
}
}
