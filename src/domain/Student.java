package domain;
public class Student {

	private long studentId;
	private int totalEc;
	private boolean isGraduated;

	public Student(long studentId, int totalEc, boolean isGraduated) {
		this.studentId = studentId;
		this.totalEc = totalEc;
		this.isGraduated = isGraduated;
	}

	public long getStudentId() {
		return studentId;
	}

	public int getTotalEc() {
		return totalEc;
	}

	public boolean isGraduated() {
		return isGraduated;
	}

	public void completeCourse(int ec) {
		totalEc += ec;
	}

	public void graduate() {
		isGraduated = true;
	}

}
