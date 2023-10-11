class OverwritingtoString
{
int rollno;
String name;
String city;
OverwritingtoString(int rollno,String name,String city)
{
this.rollno=rollno;
this.name=name;
this.city=city;
}
public String toString(){
	return rollno+" "+name+" "+city;
}
	
public static void main(String args[])
{
OverwritingtoString s1=new OverwritingtoString(101,"Raj","Lucknow");
OverwritingtoString s2=new OverwritingtoString(102,"Vijay","Ghaziabad");
System.out.println(s1);
System.out.println(s2);
}}
