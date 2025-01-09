package catalogue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BetterBasketTest {

	@Test
	void testMergeAddProduct() {
		ArrayList<Product> br = new ArrayList<>();
		Product p1 = new Product("0001","toaster",12.3,1);
		Product p2 = new Product("0002","kettle",12.7,1);
		Product p3 = new Product("0002","kettle",12.7,1);
		Product p4 = new Product("0002","kettle",12.7,1);
		br.add(p1);
		br.add(p2);
		br.add(p3);
		br.add(p4);
		assertEquals(2, br.size(),"incorrect size after merge");
		assertEquals(3, br.get(1).getQuantity(),"incorrect quality after merge");
	}
	
	@Test
	void testSortAddProduct() {
		BetterBasket br = new BetterBasket ();
		Product p1 = new Product("0004","toaster",12.3,1);
		Product p2 = new Product("0002","kettlec",12.7,1);
		Product p3 = new Product("0001","kettleb",12.7,1);
		Product p4 = new Product("0003","kettlea",12.7,1);
		br.add(p1);
		br.add(p2);
		br.add(p3);
		br.add(p4);
		
		assertEquals("0001", br.get(0).getProductNum(),"incorrect quality after merge");
	}
}
