Class Lcm
{
public void main(String[]args)
{
int x,y,t,lcm;
Scanner s=new Scanner(System.in);
System.out.println("Enter two numbers:");
int a=s.nextInt();
int b=s.nextInt();
a=x;
b=y;
while(b!=0)
{
t=b;
b=a%b;
a=t;
}
lcm=(x*y)/a;
System.out.println("LCM="+lcm);
}
}
