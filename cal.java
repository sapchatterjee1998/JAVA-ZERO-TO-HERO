public cal{

public void addition(){
int c;
int marks1=94;
int marks2=94;
int marks3=96;

c=marks1+marks2+marks3;
}

public class average extends cal{
int avg;

public void marks(){

avg=(c/300)*100;
}
}

class calculation{
public static void main (String []args)
{ 
int print;
average a=new average();
print=a.marks();
System.out.println("the avg is "+print);
}
}

}