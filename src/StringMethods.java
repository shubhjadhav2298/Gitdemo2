
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="Shubham";
		String b= "Jadhav";
			
		String name = new String("Welcome");
		String name2=new String("Welcome");
		
		System.out.println(name2);
		String a2 ="Shubham Jadhav Gym ";
		String[] Splistring =a2.split("Jadhav");
		System.out.println(Splistring[0]);
		System.out.println(Splistring[1]);
		System.out.println(Splistring[1].trim());
		// String print char by char
		for(int i=0 ;i<a2.length();i++)
		{
			System.out.println(a2.charAt(i));
		}
		//Reverse string print
		for(int j=a2.length()-1;j>=0;j--)//---- Logic
		{
			System.out.println(a2.charAt(j));
		}
	}

}
