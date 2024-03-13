import java.util.*;
class Rhombus_Pattern
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n,i,j,k;
        System.out.print("Enter number of rows: ");
        n=obj.nextByte();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=n;k++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}