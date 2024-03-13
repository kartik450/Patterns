import java.util.*;
public class Right_angle_triangle_reverse
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter number of rows: ");
        n=obj.nextInt();
        for(i=n-1;i>=0;i--)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
