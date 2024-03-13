import java.util.*;
public class Rectangle_Pattern
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int m,n,i,j;
        System.out.print("Enter number of rows: ");
        m=obj.nextInt();
        System.out.print("Enter number of columns: ");
        n=obj.nextInt();
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
