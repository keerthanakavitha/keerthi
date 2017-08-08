class Str
{
public static void main(String[]args)
{
String input="ABCDE";
StringBuilder str=new StringBuilder();
char[]characters=input.ToCharArray();
for(int i=0;i<characters.length;i++)
{
if(i%2==0)
{
if((i+1)<characters.length)
{
output.Append(characters[i+1]);
}
output.Append(characters[i]);
}
}
}
}
