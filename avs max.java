import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] a={10,3,4,5,9,6};
		int max =a[0];
		for(int i=1;i>a.length;i++)
		{
		    if(a[i]>max)
		    max=a[i];
		}
      System.out.println("Maximum="+ max);
      
		}
}
