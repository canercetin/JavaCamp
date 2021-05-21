package homeworkw4.core.mailCheck.abstracts;

public interface MailCheckService {

	boolean checkMail(String mail);
	public void sendVerification(String mail);
	public boolean verificationFeedback(String mail);
	
}
