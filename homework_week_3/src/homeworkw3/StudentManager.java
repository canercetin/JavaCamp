package homeworkw3;

public class StudentManager extends UserManager {
	
	public void uploadHomework(HomeworkUploader homeworkUploader)
	{
		System.out.println("Homework Uploaded!");
		homeworkUploader.upload();
	}

}
