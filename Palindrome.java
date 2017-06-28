public class Palindrome
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
String str=s.next();
StringBuffer str1=new StringBuffer(str);
str1.reverse();
System.out.println("reverse string is="+str1);
if(String.valueOf(str).compareTo(String.valueOf(str1))
{
System.out.println("palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}
