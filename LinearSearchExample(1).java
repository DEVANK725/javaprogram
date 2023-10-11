import java.util.Scanner;
public class LinearSearchExample
{
    public int LinearSearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    LinearSearchExample l = new LinearSearchExample();
	    Scanner sc = new Scanner(System.in);
	    int []a1=new int[5];
	    int key = 50;
	    int a=l.LinearSearch(a1,key);
	    System.out.println("Enter array elements");
	    for(int i=0;i<a1.length;i++)
	    {
	        a1[i]=sc.nextInt();
	    }
	    if(a==-1){
		System.out.println("Not Found ");
	    }
	    else{
	        System.out.println(key+ " is foumd at index: "+ a);
	    }
	}
}