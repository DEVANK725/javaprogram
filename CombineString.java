import java.util.*;
public class CombineString
{
	public static void main(String[] args) {
	
	String s1="Hello";
	String s2="Bye";
    System.out.println("FirstString :" + s1);
    System.out.println("SecondString :" + s2);
    System.out.println("CombinedString :" + s1+s2);
    System.out.println("CombinedString :" + s2+s1);
    String x=s1.concat(s2);
	System.out.println("CombinedString :" + x);
	}
}