import java.util.*;
class Voting
{
public static void main(String[] args)
{

int age;
Scanner a=new Scanner(System.in);
System.out.println("Enter Your Age :");
age=a.nextInt();
if(age<18)
{
System.out.println("not eligible");
}
else
{
System.out.println("eligible");
}
}
}