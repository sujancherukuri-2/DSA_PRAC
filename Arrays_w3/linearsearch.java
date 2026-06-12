import java.util.*;
class linearsearch
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int index=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                index=i;
                break;
            }
        }
        if(index!=-1)
        {
            System.out.println("Element " + key + " found at index " + index);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}