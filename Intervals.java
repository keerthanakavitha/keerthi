public class Intervals
{
public static void main(String[]args)
{
int flag=0;
Scanner n=new Scanner(System.in);
System.out.println("lower limit");
int s1=n.nextInt();
System.out.println("upper limit");
int s2=n.nextInt();
for(int i=s1;i<=s2;i++)
{
for(int j=2;j<i;j++)
{
if(i%j==0)
{
flag=0;
break;
}
else
{
flag=1;
}
}
if(flag==1)
{
System.out.println(i);
}
}
}
}

