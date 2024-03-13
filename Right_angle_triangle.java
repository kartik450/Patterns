import java.util.*;
public class Right_angle_triangle
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter number of rows: ");
        n=obj.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
