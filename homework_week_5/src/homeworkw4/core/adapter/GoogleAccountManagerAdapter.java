package homeworkw4.core.adapter;

import homeworkw4.googleAccount.GoogleAccountManager;

public class GoogleAccountManagerAdapter implements ExternalSignInService {

	public void signInSystem() {
		GoogleAccountManager googleAccountManager = new GoogleAccountManager();
		googleAccountManager.signIn();	
	}

}
