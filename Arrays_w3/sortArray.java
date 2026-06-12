import java.util.*;
class sortArray
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        String s[] = new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        System.out.println("Org ARR: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sort ARR: " + Arrays.toString(a));
        
        System.out.println("Org ARR: " + Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("Sort ARR: " + Arrays.toString(s));
	}
}
