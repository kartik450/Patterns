import java.util.*;
public class Floyd_Triangle {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter number of rows: ");
        n=obj.nextInt();
        int x=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(x+" ");
                x=x+1;
            }
            System.out.print("\n");
        }
    }
}
