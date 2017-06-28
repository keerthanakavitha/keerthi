public class Power
{
public static void main(String[]args)
{
int n=5,m=3,result=1;
if(n>=0&&m==0)
{
result=1;
}
else if(n==0&&m>=1)
{
result=0;
}
else
{
for(int i=1;i<=m;i++)
{
result=result*n;
}
}
System.out.println(+n"^"+m+"="+result);
}
}
