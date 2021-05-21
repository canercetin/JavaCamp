package homeworkw2;

public class Main {

	public static void main(String[] args) {
		//Courses
		Course course1 = new Course(1, "Java", "Engin Demiroð");
		Course course2 = new Course();
		 course2.setCourseNumber(2);
		 course2.setCourseName("C++");
		 course2.setTeacherName("Þadi Evren Þeker");
		Course course3 = new Course(2, "Game Development", "Armaðan Yavuz");
		
			Course[] courses = {course1, course2, course3};
			for(Course course : courses) 
			{
				System.out.println("Course " + course.getCourseNumber() + " : " + course.getCourseName() + 
						           " by " + course.getTeacherName());
			}
		
		//Categories
		Category category1 = new Category(1,"Programming Languages");
		Category category2 = new Category(2,"Development Lessons");
			Category[] categories = {category1, category2};
			for(int i = 0; i < categories.length; i++)
			{
				System.out.println(categories[i].getCategoryNumber() + "th Category is " +
								   categories[i].getCategoryName());
			}
		
		//Methods
		CourseManager courseManager = new CourseManager();
		courseManager.buyCourse(course3);
		courseManager.buyCourse(course1);
		courseManager.exitCourse(course3);
	}

}
