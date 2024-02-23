package back.freezebook.JPAInterfaces;

import back.freezebook.entities.Drawer;
import org.springframework.data.repository.CrudRepository;

public interface DrawerRepository extends CrudRepository<Drawer,Long> {
}
