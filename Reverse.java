public class Digits
{
public static void main(String[]args)
{
int rev=0,n;
while(n!=0)
{
rev=rev*10;
rev=rev+n%10;
n=n/10;
}
System.out.println(reverse);
