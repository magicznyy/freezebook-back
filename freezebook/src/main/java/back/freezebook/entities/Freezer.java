package back.freezebook.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor
public class Freezer {

    Freezer(String freezerName, User owner, ArrayList<Drawer> freezerDrawers){

        this.freezerName = freezerName;
        this.freezerOwners = new ArrayList<>();
        this.freezerOwners.add(owner);
        this.freezerDrawers = freezerDrawers;

    }
    @Id
    @GeneratedValue
    private long idFreezer;

    private String freezerName;
    private int drawersNumber;

    private ArrayList<User> freezerOwners;

    private ArrayList<Drawer> freezerDrawers;

    public void addOwner(User owner){
        this.freezerOwners.add(owner);
    }

}




