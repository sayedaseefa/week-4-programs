public class RemoveAllSpace
{
public static void main(String a[])
{
String str="I AM A GOOD GIRL";
String noSpaceStr=str.replaceAll("\\s","");
System.out.println(noSpaceStr);
}
}
