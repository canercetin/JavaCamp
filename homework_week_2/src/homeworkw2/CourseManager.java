package homeworkw2;

public class CourseManager {
	public void buyCourse(Course course) {
		System.out.println("You bought the course : " + course.getCourseName());
	}
	public void exitCourse(Course course) {
		System.out.println("You exited the course : " + course.getCourseName());
	}
}
