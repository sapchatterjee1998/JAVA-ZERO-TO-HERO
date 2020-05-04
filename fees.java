import java.util.*;
class poly{

int scholarship(){return 0;}
}

class fivty extends poly{

int scholarship(){return 40000;}
}

class fourty extends poly{
int scholarship(){return 32000;}
}
class thirty extends poly{
int scholarship(){return 24000;}
}
class fees{
public static void main(String[] args)
{
poly p;
int percentage;
int price;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the % of scholarship you have got");
percentage=sc.nextInt();


if(percentage==50)
{
p=new fivty();
System.out.println("the schlorship ammount"+p.scholarship());

}
else if(percentage==40)
{
p=new fourty();
System.out.println("the schlorship ammount"+p.scholarship());

}
else
{
p=new thirty();
System.out.println("the schlorship ammount"+p.scholarship());

}

}


}
