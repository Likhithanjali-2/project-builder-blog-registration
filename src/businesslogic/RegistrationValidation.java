package businesslogic;

import java.util.regex.*;

public class RegistrationValidation {
	private Pattern pattern;
    private Matcher matcher;
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		if(validPassword(password,confirmPassword) && validEmail(email))
			return true;
		return false;
	}
	
	private boolean validPassword(String password, String confirmPassword) {
		pattern = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,20})");
        matcher = pattern.matcher(password);
        return matcher.matches() && password.equals(confirmPassword);
	}
	
	private boolean validEmail(String email) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      return email.matches(regex);
	}
}