package back.freezebook.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class FrozenFood {
    @Id
    @GeneratedValue
    private long ifFrozenFood;

    private String foodName;
    private int foodWeight;
    private int foodQuantity;

    private List<String> foodTags;

    private String foodComment;
    private Date frozenDate;



}
