import static org.junit.Assert.*;

import org.junit.Test;

public class BitwiseANDProductTest {
	
	
	@Test
	public void test1() {
		assertEquals(BitwiseANDProduct.andProduct(100663312L, 100925473L), 100663296);
	}
	
	@Test
	public void test2() {
		assertEquals(BitwiseANDProduct.andProduct(201326611L, 201850892L), 201326592);
	}
	
	@Test
	public void test3() {
		assertEquals(BitwiseANDProduct.andProduct(201326602L, 201588818L), 201326592);
	}
	
	@Test
	public void test4() {
		assertEquals(BitwiseANDProduct.andProduct(805306487L, 807403634L), 805306368);
	}
	
	@Test
	public void test5() {
		assertEquals(BitwiseANDProduct.andProduct(134217837L, 135266320L), 134217728);
	}
	
	@Test
	public void test6() {
		assertEquals(BitwiseANDProduct.andProduct(100663383L, 100925459L), 100663296);
	}
	
	@Test
	public void test7() {
		assertEquals(BitwiseANDProduct.andProduct(805306381L, 807403572L), 805306368);
	}
	
	@Test
	public void test8() {
		assertEquals(BitwiseANDProduct.andProduct(805306372L, 807403535L), 805306368);
	}
	
	@Test
	public void test9() {
		assertEquals(BitwiseANDProduct.andProduct(536870923L, 537919538L), 536870912);
	}
	
	@Test
	public void test10() {
		assertEquals(BitwiseANDProduct.andProduct(268435572L, 268959749L), 268435456);
	}
	
	@Test
	public void test11() {
		assertEquals(BitwiseANDProduct.andProduct(402653188L, 403701863L), 402653184);
	}
	
	@Test
	public void test12() {
		assertEquals(BitwiseANDProduct.andProduct(402653249L, 403701881L), 402653184);
	}
	
	@Test
	public void test13() {
		assertEquals(BitwiseANDProduct.andProduct(536870926L, 538968092L), 536870912);
	}
	
	@Test
	public void test14() {
		assertEquals(BitwiseANDProduct.andProduct(536871013L, 537919581L), 536870912);
	}
	
	@Test
	public void test15() {
		assertEquals(BitwiseANDProduct.andProduct(134217800L, 135266414L), 134217728);
	}
	
	@Test
	public void test16() {
		assertEquals(BitwiseANDProduct.andProduct(268435461L, 269484127L), 268435456);
	}
	
	@Test
	public void test17() {
		assertEquals(BitwiseANDProduct.andProduct(402653201L, 403701764L), 402653184);
	}
	

}
