public class array{

public static void main(String[] args){



double[]mylist={10,15,41,47,4,6,5,7,4,2};

print(mylist);
sum(mylist);
max(mylist);
}

public static void print(double[] my){
int i;
for(i=0;i<my.length;i++)
{
System.out.println(my[i]);

}
}
public static void sum(double [] mylist){
int sum=0;
int j;
for(j=0;j<mylist.length;j++)
{
sum+=mylist[j];
}
System.out.println("the sum is "+sum);
}
public static void max(double[]mylist)
{
int k;
double temp=0;
for(k=0;k<mylist.length;k++)
{
if(mylist[k]>temp)
{
temp=mylist[k];
}


}
System.out.println("the max is:"+temp);
}
}