package database;
import domain.Student;

public class StudentDao {

	// This is a single student system!
	private Student _studentDb;

	public Student createStudent() {
		_studentDb = new Student(1, 0, false);
		return _studentDb;
	}

	public Student getStudent(long id) {
		if (_studentDb != null && _studentDb.getStudentId() == id) {
			return _studentDb;
		}

		throw new IllegalArgumentException("Unknown student");

	}

	public Student updateStudent(Student student) {
		if (_studentDb != null
				&& _studentDb.getStudentId() == student.getStudentId()) {
			_studentDb = student;
			return student;
		}

		throw new IllegalArgumentException("Unknown student");
	}

}
