package dataaccess;

import pojos.User;
import org.springframework.data.repository.CrudRepository;

/**
 * User Repository interface that will be used by String to create a bean that handles all the CRUD operations
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User getUserById(Integer id);
    User findByUsername(String username);

    //This is where you write code needed beyond the basics

}