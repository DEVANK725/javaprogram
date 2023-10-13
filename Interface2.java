interface solution{
    public void Hello();
    public void Welcome();
    public void show(String name);
}
class A implements solution{
    public void Hello(){
        System.out.println("Hello World");
    }
    public void Welcome(){
        System.out.println("Welcome to Edureka");
    }
    public void show(String name){
        System.out.println("Method "+ name);
    }
}
public class Interface2
{
    public static void main(String args[])
    {
        A a1=new A();
        a1.Hello();
        a1.Welcome();
        a1.show("Show");
    }
}