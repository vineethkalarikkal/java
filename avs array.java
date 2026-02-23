import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n;
		int[]a=new int[5];
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(int i = 0; i < n; i++)
		{
		    a[i]=in.nextInt();
		}
		System.out.println("\n Array elements:\n");
		for(int i=0;i<n;i++)
		{
		  System.out.println(a[i]);
		}
		in.close();
	}
}



