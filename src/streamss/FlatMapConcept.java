package streamss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class FlatMapConcept {

	@Test
	public void Testing1()
	{
		List<Integer> l=Arrays.asList(1,2,3);
		List<Integer> l1=Arrays.asList(4,5,6);
		List<Integer> l2=Arrays.asList(7,8,9);
		
		List<List<Integer>> ll=Arrays.asList(l,l1,l2);
		
		List<Integer> lll=ll.stream().flatMap(n->n.stream()).collect(Collectors.toList());
        System.out.println(lll);
        
        List<Integer> llll=ll.stream().flatMap(n->n.stream().map(p->p+10)).collect(Collectors.toList());
        System.out.println(llll);
		
	}
}
