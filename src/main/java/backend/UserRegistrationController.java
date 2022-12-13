package backend;

public class UserRegistrationController implements IUserRegistrationController{

	UserRegistrationImpl userRegistrationImpl;
	
	public UserRegistrationController(UserRegistrationImpl userRegistrationImpl) {
		this.userRegistrationImpl=userRegistrationImpl;
	}

	@Override
	public boolean register(User user) {
		return userRegistrationImpl.register(user);
	}
}
