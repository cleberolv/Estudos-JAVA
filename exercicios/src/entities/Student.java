package entities;

public class Student {

	public String name;
	public Double grade1;
	public Double grade2;
	public Double grade3;
	public Double media;
	
	public double calculoDeMedia() {
		return media = grade1 + grade2 + grade3;
	}
	
	public double missingPoints() {
		if (calculoDeMedia() < 60.0) {
			return 60.0 - calculoDeMedia();
		}
		else {
			return 0.0;
		 }
	}
}
