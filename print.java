Class Add
{
public void main(String[]args)
{
int sum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int n=s.nextInt();
for(int i=1;i<=15;i++)
{
sum+=i;
}
System.out.println("Sum="+sum);
for(int i=15;i<=45;i+=2)
{
sum+=i;
}
System.out.println("Sum="+sum);
}
}
