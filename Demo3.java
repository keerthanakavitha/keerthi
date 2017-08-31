import java.util.Scanner;
class Fibonaicc
{
public static void main(String[]args)
{
int n1=0,n2=1,n,count=10;
System.out.println(n1+" "+n2);
for(int i=2;i<count;i++)
{
n=n1+n2;
System.out.print(" "+n);
n1=n2;
n2=n;
}
}
}

