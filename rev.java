class Rev
{
public static void main(String[]args)
{
String str="ReverseMe";
String reverse=new StringBuffer(str).reverse().toString();
System.out.println(reverse);
String str1=str.replaceAll("[aeiouAEIOU]","");
System.out.println(str1);
}
}
