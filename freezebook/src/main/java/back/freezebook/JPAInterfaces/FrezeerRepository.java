package back.freezebook.JPAInterfaces;

import back.freezebook.entities.Freezer;
import back.freezebook.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FrezeerRepository extends CrudRepository<Freezer,Long> {

   Freezer findById(long id);



}
