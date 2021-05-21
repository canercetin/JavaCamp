package homeworkw4.core.mailCheck.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import homeworkw4.core.mailCheck.abstracts.MailCheckService;

public class MailCheckManager implements MailCheckService {

	@Override
	public boolean checkMail(String mail) {
		
		Pattern pattern = Pattern.compile(
				"^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
		Matcher matcher = pattern.matcher(mail);
		
		return matcher.matches();
	}
	
	public void sendVerification(String mail) {
		
		System.out.println("Verification mail sent! - "+mail);
		
	}
	public boolean verificationFeedback(String mail)
	{
		return true;
	}

	
	
}
