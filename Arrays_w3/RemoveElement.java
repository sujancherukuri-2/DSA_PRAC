import java.util.*;
class RemoveElement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                for(int j=i;j<n-1;j++)
                {
                    a[j]=a[j+1];
                }
                break;
            }
        }
        for(int i=0;i<n-1;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}