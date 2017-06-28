public class Numbers
{
public static void main(String[]args)
{
int num1,num2,rem,temp,n,count=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the intervals:");
System.out.println("enter starting numbers:");
num1=s.nextInt();
System.out.println("enter ending numbers:");
num2=s.nextInt();
for(int i=num1+1;i<num2;i++)
{
temp=1;
n=0;
while(temp!=0)
{
rem=temp%10;
n=n+rem*rem*rem;
temp=temp/10;
}
if(i==n)
{
if(count==0)
{
System.out.println("armstrong number between the given intervals are:");
}
System.out.println(i+"");
count++;
}
if(count==0)
{
System.out.println("armstrong number not found between the given intervals:");
}
}
}
