package streamss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class MapsConcept {

	//@Test
	public void Testing()
	{
		List<String> l=Arrays.asList("gdjh","uiyreoi","uiiuthuif","jy");
		

		l.stream().map(n->n.toUpperCase()).forEach(System.out::println);
		List<String> la=l.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(la);
	}
	
	@Test
	public void Testing1()
	{
		List<String> l=Arrays.asList("gdjh","uiyreoi","uiiuthuif","jy");
		

		l.stream().map(n->n.length()).forEach(System.out::println);
		List<Integer> la=l.stream().map(n->n.length()).collect(Collectors.toList());
		System.out.println(la);
	}
	
	//  filter and map
	@Test
	public void Testing2()
	{
		List<String> l=Arrays.asList("gdjh","uiyreoi","uiiuthuif","jy");
		

		
	}
}
