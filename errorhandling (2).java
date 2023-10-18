public class errorhandling{
    public static void main(String[] args){
    try{
        int x=100;
        int y=0;
        int z=x/y;
        System.out.println(z);
    }
    catch (Exception err){
        System.out.println(err.getMessage());
    }
    }
}
