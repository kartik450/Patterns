import java.util.*;
public class Right_triangle_left_side_reverse
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter number of rows: ");
        n=obj.nextInt();
        for(i=n;i>=0;i--)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
