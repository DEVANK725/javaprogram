class Shape{
    public void area(){
        System.out.println("area");
    }
}
class Circle extends Shape
{
    public void area(int r){
        System.out.println("area of circle = "+ 3.14*r*r);
    }
}
class Rectangle extends Shape
{
    public void area(int l,int b){
        System.out.println("area of rectangle = "+ l*b);
    }
}
public class InheritanceOverriding4
{
	public static void main(String[] args) {
	    Shape s=new Shape();
	    s.area();
	    Circle c=new Circle();
	    c.area(2);
		Rectangle r=new Rectangle();
	    r.area(2,3);
	}
}