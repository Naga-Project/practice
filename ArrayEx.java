import java.util.*;
public class ArrayEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[]=new int[4];
		//finding length of array
		int l=a.length;
		System.out.println("array size ="+l);
		System.out.println("enter 4 elements");
		for(int i=0;i<l;i++)
			a[i]=s.nextInt();
		System.out.println("array elements are");
		int sum=0;
		for (int i:a)
		//for(int i=0;i<l;i++)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("sum ="+sum);
	}

}
