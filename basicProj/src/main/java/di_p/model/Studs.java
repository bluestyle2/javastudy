package di_p.model;

public class Studs {
	int jum;
	String grade;
	public int getJum() {
		return jum;
	}
	public void setJum(int jum) {
		this.jum = jum;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Studs [jum=" + jum + ", grade=" + grade + "]";
	}
	
	
}
