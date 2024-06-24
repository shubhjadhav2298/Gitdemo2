import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2= {1,2,3,4,5,6,7,8,9,10};
 
		//Check array which is multiple of 2
 
		for(int i=0;i<arr2.length;i++)
		{
			if (arr2[i]%2==0)
			{
				System.out.println(arr2[i]);
				break;
			}
			else
			{
				System.out.println(arr2[i] + "is not multiple of 2");
			}
			// Declare arraylist if we want add unlimited valur in array.
			ArrayList<String> a = new ArrayList<String>();
			a.add("shubham");
			a.add("Jadhav");
			a.add("Software");
			a.add("Tester");
			System.out.println(a.get(1));
			for (int b=0;b<a.size();b++)
			{
				System.out.println(a.get(3));
			}
			System.out.println("************");
			for (String s: a)
				
			{
				System.out.println(a.get(3));
			}
			//Item present in arraylist
			System.out.println(a.contains("Software"));
			String[] name= {"Rahul","Shetty","Acadamy"};
			//Convert normal array to arraylist through this..
			List nameArraylist= Arrays.asList(name);
			nameArraylist.contains("Rahul");
			
			
		}
		
		
		
	}
	
	
	

}
