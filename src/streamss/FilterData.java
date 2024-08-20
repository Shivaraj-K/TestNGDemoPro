package streamss;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

import org.testng.annotations.Test;

public class FilterData {

	//@Test
	public void Testing()
	{
		List<Integer> l=Arrays.asList(10,5,15,12,24,25,30);
		List<Integer> la=new ArrayList<Integer>();

		la=	l.stream().filter(n->(n%2==0)).collect(Collectors.toList());
		System.out.println(la);

		l.stream().filter(n->(n%2==0)).forEach(n -> System.out.println(n));
		l.stream().filter(n->(n%2==0)).forEach(System.out::println);
	}
	
	@Test
	public void Testing1()
	{
		List<String> l=Arrays.asList("gdjh","uiyreoi","uiiuthuif","jy");
		

		l.stream().filter(n->(n.length()>3 && n.length()<7)).forEach(System.out::println);
		List<String> la=l.stream().filter(n->(n.length()>3 && n.length()<7)).collect(Collectors.toList());
		System.out.println(la);
		
		//l.stream().filter(n->(n!=null)).collect(null);
	}
}
