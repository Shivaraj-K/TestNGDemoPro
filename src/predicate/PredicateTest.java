package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.testng.annotations.Test;

public class PredicateTest {

	@Test
	public void result()
	{
		Predicate<Integer> p=a->(a>10);
		System.out.println(p.test(30));
		
		Predicate<String> ps=a->(a.length()>10);
		System.out.println(ps.test("The Tiger"));
		
		
		// Different val;ues
		
		List<String> a=new ArrayList<String>();
		a.add("Shivaraj");
		a.add("Shweta");
		a.add("Sp");
		
		
		
		Predicate<List<String>> pp=i->(i.contains("SP"));
		System.out.println(pp.test(a));
		
		
		String[] s= {"Shivaraj","Shweta","Sp"};
		Predicate<String> ss=T->(T.length()>3);
		
		for(String st:s)
		{
			if(ss.test(st))
			{
				System.out.println(st);
			}
			
		}
	}
}
