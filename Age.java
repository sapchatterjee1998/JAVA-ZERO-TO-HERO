import java.util.*;

class Age {
public static void main(String[] args) {

int age;

Scanner sc = new Scanner(System.in);

System.out.print("Enter first number- ");

age= sc.nextInt();

if (age<18)
{ 
System.out.println("You can't vote");

}

else{

System.out.println("you can vote");
}

}
}