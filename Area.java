import java.util.*;
public class Area{

public static void main (String [] args)
{
double radius,area;

Scanner sc= new Scanner(System.in);

System.out.print("Enter the radius");

radius=sc.nextDouble();

double p=3.14;

area=radius*radius*p;

System.out.println("Area is"+area);

}
}