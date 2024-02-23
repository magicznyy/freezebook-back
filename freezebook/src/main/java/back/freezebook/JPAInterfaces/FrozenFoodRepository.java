package back.freezebook.JPAInterfaces;

import back.freezebook.entities.FrozenFood;
import org.springframework.data.repository.CrudRepository;

public interface FrozenFoodRepository extends CrudRepository <FrozenFood,Long> {
}
