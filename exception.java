import java.io.*;

public class exception{

public static void main(String[] args)

{

try{
FileInputStream fis= new FileInputStream("D:/welcom.txt");
int i;
while((i=fis.read() )!=-1){
System.out.print((char)i);
}
}catch(FileNotFoundException e)
{
System.out.println(e);
}

}

}