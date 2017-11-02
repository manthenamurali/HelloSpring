package springdemo.database.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import springdemo.database.entities.RegisterUserEntity;

public class RegisterUserDAOImpl implements RegisterUserDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public boolean registerUser(RegisterUserEntity userToRegister) {
		
		if(sessionFactory == null) {
			return false;
		}
		
		Session session = sessionFactory.openSession();
		session.persist(userToRegister);
		
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		
		session.close();
		
		return true;
	}
}
