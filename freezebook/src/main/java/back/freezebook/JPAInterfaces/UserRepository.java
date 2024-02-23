package back.freezebook.JPAInterfaces;

import back.freezebook.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
