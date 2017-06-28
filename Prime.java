public class Prime
{
public static void main(String[]args)
{
int count=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int num=s.nextInt();
for(int i=2;i<=num/2;i++)
{
if(num%i==0)
{
count++;
break;
}
}
if(count==0)
System.out.println("prime number"+num);
else
System.out.println("not a prime"+num);
}
}
