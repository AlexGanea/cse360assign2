package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddingMachineTest {

	@Test
	public void test() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		
		System.out.println(myCalculator.getTotal());
		System.out.println(myCalculator.toString());
	}
	
	public void test2() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(3);
		myCalculator.subtract(1);
		
		System.out.println(myCalculator.getTotal());
		System.out.println(myCalculator.toString());
	}

}
