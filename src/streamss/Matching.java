package streamss;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;


//anyMatch()
//allMatch()
//noneMatch()
//findAny
//findFirst
//ConcatinateStream

public class Matching {

	@Test
	public void Testing1()
	{
		Set<String> s=new HashSet<String>();
		s.add("one mango");
		s.add("one appple");
		s.add("two mango");
		s.add("three mango");
		s.add("one orange");

		//anyMatch()
		boolean b=s.stream().anyMatch(v->{return v.startsWith("one");});
		System.out.println(b);

		//allMatch()
		boolean b1=s.stream().allMatch(v->{return v.startsWith("one");});
		System.out.println(b1);

		//noneMatch()
		boolean b2=s.stream().noneMatch(v->{return v.startsWith("aa");});
		System.out.println(b2);

		//findAny
		Optional<String> o=s.stream().findAny();
		System.out.println(o);
		System.out.println(o.get());


		//findFirst
		Optional<String> o1=s.stream().findFirst();
		System.out.println(o1);
		System.out.println(o1.get());
		
		
		//ConcatinateStream
		
		List<String> ls=Arrays.asList("gdjh","uiyreoi","uiiuthuif","jy");
		List<String> ls1=Arrays.asList("ban","appl","bel","ch");
		
		
		List<Integer> l=Arrays.asList(10,5,15,12,24,25,30);
		List<Integer> l1=Arrays.asList(4,5,6);
		
		Stream<String> a=ls.stream();
		Stream<String> b3=ls1.stream();
		
		List<String> ii=Stream.concat(a, b3).collect(Collectors.toList());
		System.out.println(ii);

	}

}
