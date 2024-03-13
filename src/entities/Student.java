package entities;

public class Student {
	
	public double n1,n2,n3;
	public String name;
	
	
	public double total() {
		return n1+n2+n3;
	}
	
	public double missingPont() {
		return 60 - total();
	}
	
	public String toString() {
		return "FINAL GRADE = "
				+ String.format("%.2f", total());
				
	}
}
