Class HCF
{
public void main(String[]args)
{
int a,b,t,hcf;
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
hcf=a;
System.out.println("HCF="+hcf);
}
}

