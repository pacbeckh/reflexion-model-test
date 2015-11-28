import Authorization.Authorizer;
import domain.Student;
import service.StudentService;

public class StudentEndPoint {

	private final StudentService studentService;

	public StudentEndPoint(StudentService studentService) {
		this.studentService = studentService;
	}

	public Student createStudent(String authToken) {
		checkAuthorization(authToken);

		return studentService.createNewStudent();
	}

	public Student getStudent(String authToken, long studentId) {
		checkAuthorization(authToken);

		return studentService.getStudent(studentId);
	}

	public void completeCourse(String authToken, long studentId, int ec) {
		checkAuthorization(authToken);

		studentService.completeCourse(studentId, ec);
	}

	public void graduate(String authToken, long studentId) {
		checkAuthorization(authToken);

		studentService.graduate(authToken, studentId);
	}

	private void checkAuthorization(String authToken) {
		if (!Authorizer.isAuthorized(authToken)) {
			throw new RuntimeException("403 Unauthorized");
		}
	}

}
