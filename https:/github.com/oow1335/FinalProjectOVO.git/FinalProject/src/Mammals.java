// this is the Mammals character
public class Mammals {
	
	private String name;
	private int legs;
	
	public Mammals (String mammalName, int mammalLeg)
	{
		name = mammalName;
		legs = mammalLeg;
	}
	public String toString() {
		return "Mammal class: " + " is named " + name + "Legs: ";
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAge(int newAge) {
		legs = newAge;
	}
	
	
	}
	