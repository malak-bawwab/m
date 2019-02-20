package malakb;

import static org.junit.Assert.*;

import org.junit.Test;


public class mTest {

	@Test
	public void test() {
		
		SC s=new SC();
		assertEquals(0,s.getcount());
		}
	@Test

	public void test2() {
		product p=new product("java Book",1,127);
		SC s=new SC();
		s.add(p);
		assertEquals(1,s.getcount());
		assertEquals(127,s.gettotalprice());


		}
	@Test

	public void test3() {
		product p1=new product("java Book",1,127);
		product p2=new product("java Book",1,100);

		SC s=new SC();
		s.add(p1);
		s.add(p2);
		assertEquals(2,s.getcount());
		assertEquals(227,s.gettotalprice());


		}
		
}