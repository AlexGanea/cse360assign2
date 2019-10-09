/*Alexandra GANEA
 * CSE360 Assign2
 * https://github.com/AlexGanea/cse360assign2
 */


package cse360assign2;

public class AddingMachine {

	private int total;
	private String result; 
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		result = "0";
	}
	
	public int getTotal () {
		return total;
		
	}
	
	public void add (int value) {
		total += value;
		result += " + " + value;
	}
	
	public void subtract (int value) {
		total -= value;
		result += " - " + value;
	}
		
	public String toString () {
		return result;
	}

	public void clear() {
		total = 0;
		result = "0";
	}
}
