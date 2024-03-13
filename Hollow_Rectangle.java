import java.util.*;
public class Hollow_Rectangle {
    public static void main(String[] args) {
        int n,i,j,k,l;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        n=obj.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==1 || i==n || j==1 || j==n){
                System.out.print("* ");}
                else
                {
                    System.out.print("  ");
                }

            }
            System.out.print("\n");
        }
    }
}
