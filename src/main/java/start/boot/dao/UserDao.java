package start.boot.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import start.boot.beans.User;

@Transactional
public interface UserDao extends CrudRepository<User, Long>{
	
	public User findByEmail(String email);
		
}