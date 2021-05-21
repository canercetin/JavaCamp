package homeworkw3;

public class Main {

	public static void main(String[] args) {
		
		//Instructors
		Instructor instructor1 = new Instructor();
		instructor1.firstName = "Instructer";
		instructor1.lastName = "One";
		instructor1.email = "instructer_1@gmail.com";
		instructor1.teacherId = "111";
		
		Instructor instructor2 = new Instructor();
		instructor2.firstName = "Instructer";
		instructor2.lastName = "Two";
		instructor2.email = "instructer_2@gmail.com";
		instructor2.teacherId = "222";
		
		Instructor[] instructors = {instructor1, instructor2};
			for(Instructor instructor : instructors)
			{
				System.out.println(instructor.email + " - " + instructor.teacherId);
			}
		
		//Students
		Student student1 = new Student();
		student1.firstName = "Student";
		student1.lastName = "One";
		student1.email = "student_1@gmail.com";
		student1.studentId = "111-111";
		student1.coursesTaken = 9;
		
		Student student2 = new Student();
		student2.firstName = "Student";
		student2.firstName = "Two";
		student2.email = "student_2@gmail.com";
		student2.studentId = "222-222";
		student2.coursesTaken = 4;
		
		Student[] students = {student1, student2};
			for(int i = 0; i < students.length; i++)
			{
				System.out.println(students[i].email + " " + students[i].coursesTaken);
			}
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.logIn();
		instructorManager.startLesson();
		
		StudentManager studentManager = new StudentManager();
		studentManager.logIn();
		studentManager.uploadHomework(new DailyHwUploader());
		studentManager.uploadHomework(new WeeklyHwUploader());		

	}

}
