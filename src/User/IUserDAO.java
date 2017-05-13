package User;

import java.util.List;

public interface IUserDAO {

	public List getAllUsers();
	public boolean createUser();
	public boolean validateUser();
	public boolean updateUser();
};