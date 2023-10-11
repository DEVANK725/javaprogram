import java.util.Scanner;
public class LinearSearch1
{
    public static int LinearSearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int []a1=new int[5];
	    int key = 50;
	   
	    System.out.println("Enter array elements");
	    for(int i=0;i<a1.length;i++)
	    {
	        a1[i]=sc.nextInt();
	    }
	    System.out.println(key+ " is foumd at index: "+ LinearSearch(a1,key));
	   
	}
}