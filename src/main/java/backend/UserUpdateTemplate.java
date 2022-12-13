package backend;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class UserUpdateTemplate {
	protected abstract User getUser(String firstName, String lastName, String emailId);
	protected abstract User checkUserExists(String firstName,String lastName,String emailId);
	protected abstract boolean updateUserDetails(User user,final HashMap<String,String> updateValues);
	protected abstract ArrayList<String> validateUserInputs(HashMap<String,String> updateValues);
}
