 class Data{
    private  String n;
     public void set(String name){
        n=name;
    }
    public void get(){
        System.out.println(n);
}
}
public class accessSpeciferEx
{
	public static void main(String[] args) {
	    Data o =new Data();
	    o.set(" devank");
	    o.get();
		//System.out.println("Hello World");
	}
}