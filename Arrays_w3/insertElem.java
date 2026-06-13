import java.util.*;
class insertElem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+1];
        for(int i=0;i<n;i++)
        a[i] = sc.nextInt();

        int pos = sc.nextInt();   // 0-based position
        int val = sc.nextInt();   // value to insert

        // shift right from end to pos
        for(int i=n;i>pos;i--)
        {
            a[i] = a[i-1];
        }
        a[pos] = val;

        for(int i=0;i<=n;i++)
        System.out.print(a[i]+" ");
    }
}