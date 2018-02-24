package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {

	private VendingMachine vend1, vend2, vend3;
	VendingMachineItem item1, item2, item3;
	
	@Before
	public void setUp() throws Exception {
		vend1 = new VendingMachine();
		vend2 = new VendingMachine();
		vend3 = new VendingMachine();
		item1 = new VendingMachineItem("marley", 420);
		item2 = new VendingMachineItem("@53n2 h\n24378", 0);
		item3 = new VendingMachineItem("josh", 100);
	}

	@Test
	public void testAddItem(){
		
	}
	
	/**
	 * not strictly necessary
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
