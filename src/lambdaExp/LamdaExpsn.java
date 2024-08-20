package lambdaExp;

import org.testng.annotations.Test;

interface Demo
{
	int Say(int a);
}

public class LamdaExpsn {

	Demo d=(a)->{
		return a;
		//Shiv
	};
	@Test
	public void test()
	{
		Demo d1=(a)->{
			return a;
		};
		System.out.println(d1.Say(2));
		
		//  or
		
		Demo dd=a->a;
		System.out.println(dd.Say(24));
		
	}
}
