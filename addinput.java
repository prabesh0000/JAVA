import java.util.Scanner;
public class addinput
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
int a , b;
System.out.println("enter first number:");
a= sc.nextInt();
System.out.println("enter the second number:");
b=sc.nextInt();
sc.close();
int sum=a+b;
System.out.println("the sum is :"+sum);
}
}