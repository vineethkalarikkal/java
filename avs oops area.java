import java.util.Scanner;
class Circle {
    double r, area;
    public void getdata()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter r :");
        r=in.nextDouble();
    }
    public void Calc()
    {
        area=3.14 * r * r;
        System.out.println("Area:" + area);
    }
}
public class Main {
    public static void Main(String[]args)
    {
        Circle obj= new Circle();
        obj.getdata();
        obj.Calc();
    }
}

