package homeworkw2;

public class Course {
	
	private int courseNumber;
	private String courseName;
	private String teacherName;
	
	public Course() {
		
	}
	public Course(int courseNumber, String courseName, String teacherName) {
			this.courseNumber = courseNumber;
			this.courseName = courseName;
			this.teacherName = teacherName;
	}
	
	public int getCourseNumber(){return courseNumber;}
	public void setCourseNumber(int courseNumber){this.courseNumber = courseNumber;}
	
	public String getCourseName(){return courseName;}
	public void setCourseName(String courseName){this.courseName = courseName;}
	
	public String getTeacherName(){return teacherName;}
	public void setTeacherName(String teacherName){this.teacherName = teacherName;}

	
}
