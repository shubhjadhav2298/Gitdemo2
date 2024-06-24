import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class testJava {

	// TODO Auto-generated method stub
	// count the number of names start with A

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("women");
		names.add("men");
		names.add("kohli");
		names.add("chandan");
		names.add("kanha");

		// there is no life for intermidate op if there is no terminal op
		// terminal op will execute if intermidate op return true
		// We can create stream
		// how to use filter in stream

		Long f = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(f);
		long d = Stream.of("Adarsh", "Suresh", "Ajay", "Shubham", "Anand").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		//Print the name end with a and with uppercase
		names.stream().filter(s -> s.length() > 4).limit(2).forEach(s -> System.out.println(s));
		Stream.of("Adarsh", "Suresha", "Ajaya", "Shubham", "Ananda").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		// Print the name which have first later A and sorted

		List<String> names1 = Arrays.asList("Azdarsh", "Suresha", "Axjaya", "Shubham", "Ananda");
		names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		
		//merge the two stream into one stream
		
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s->System.out.println(s));
		
		//boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("kohli"));
		//System.out.println(flag);
		//Assert.assertTrue(flag);
		
		List<String> ls=Stream.of("Adarsh", "Suresha", "Ajaya", "Shubham", "Ananda").filter(s -> s.endsWith("a"))
		.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(1));
		
		

	}

	

}
