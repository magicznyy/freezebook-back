package back.freezebook.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Drawer {

    @Id
    @GeneratedValue
    private long idDrawer;

    private String drawerName;

    private List<FrozenFood> drawerContents;

}
