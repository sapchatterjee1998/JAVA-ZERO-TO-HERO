public class methodover{

public static void main(String[] args){

int first=5;
int second=8;
double one=14.7;
double two=9.9;
int result1;
double result2;

int result1=maxvalue(first, second);
double result2=maxvalue(one, two);

System.out.println("the max no is:"+result1);
System.out.println("the max no is:"+result2);
}
public static int maxvalue(int firstinput,int secondinput){

if (firstinput<secondinput)
{
result1=secondinput;
}
else
{
result1=firstinput;
}
      return result1;
}
public static double maxvalue(double onein,double twoin){

if (onein<twoin)
{
result2=twoin;
}
else
{
result2=onein;
}
      return result2;
}

}
