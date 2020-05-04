public class method{

public static void main(String[] args){

int first=5;
int second=8;

int result=maxvalue(first, second);
System.out.println("the max no is:"+result);

}
public static int maxvalue(int firstinput,int secondinput){

if (firstinput<secondinput)
{
int result=secondinput;
}
else
{
int result=firstinput;
}
      return result;
}
}
