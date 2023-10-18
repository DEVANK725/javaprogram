interface solution
{
    public void hello();
    public void welcome();
}
public class A implements solution {
    public void hello(){
        java.lang.System.out.println("HELLO WORLD");
        
    }
    public void welcome(){
        java.lang.System.out.println("welcome to edureka");
        
    }
    public static void main(String[] args)
    {
        A a = new A();
        a.hello();
        a.welcome();
    }
}