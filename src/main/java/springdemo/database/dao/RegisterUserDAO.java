package springdemo.database.dao;

import springdemo.database.entities.RegisterUserEntity;

public interface RegisterUserDAO {
	
	public boolean registerUser(RegisterUserEntity userToRegister);
	
}
