package service;

import database.StudentDao;
import domain.Student;

public class StudentService {

	private static final int MIN_EC = 120;
	private final StudentDao studentDao;

	public StudentService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public Student createNewStudent() {
		return studentDao.createStudent();
	}

	public Student getStudent(long studentId) {
		return studentDao.getStudent(studentId);
	}

	public void completeCourse(long studentId, int ec) {
		Student student = studentDao.getStudent(studentId);
		student.completeCourse(ec);
		studentDao.updateStudent(student);
	}

	public void graduate(String authToken, long studentId) {
		Student student = studentDao.getStudent(studentId);
		if (student.getTotalEc() >= MIN_EC) {
			student.graduate();
			studentDao.updateStudent(student);
		} else {
			throw new RuntimeException("Student needs "
					+ (MIN_EC - student.getTotalEc())
					+ " EC before it can graduate!");
		}

	}

}
