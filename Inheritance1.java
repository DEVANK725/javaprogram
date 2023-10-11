class Animal{
    protected void display()
    {
        System.out.println("I am an animal");
    }
}
class Inheritance1 extends Animal
{
	public static void main(String[] args) {
		Inheritance1 d=new Inheritance1();
		d.display();
	}
}