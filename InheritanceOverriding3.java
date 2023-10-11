class Animal{
    public void eat(){
        System.out.println("method eat in parent class");
    }
}
class Dog extends Animal
{
    public void eat(){
        super.eat();
        System.out.println("Method eat in subclass");
    }
}
public class InheritanceOverriding3
{
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		Dog d=new Dog();
		d.eat();
		Animal c = new Dog();
		c.eat();
	}
}