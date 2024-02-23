package back.freezebook.controllers;

import back.freezebook.entities.Freezer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FreezerController {

    @PostMapping("/addFreezer")
    void addFreezer(Freezer freezer){

    }
}
