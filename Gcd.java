Class GCD
{
public void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("First number:");
int n1=s.nextInt();
System.out.println("second number:");
int n2=s.nextInt();
int r;
while(n1!=0)
{
r=n1%n2;
n1=n2;
n2=r;
}
System.out.println("GCD="+n1);
}
}
