package com.example.demo.afUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
* Controller
*/
@RestController
@RequestMapping(path="api/v1/afUser")

public class AfUserController {
    private final AfUserService afUserService;

    @Autowired
    public AfUserController(AfUserService afUserService){
        this.afUserService = afUserService;
    }

    @GetMapping("/users")
    public List<AfUser> getAfUsers(){
        return afUserService.getAfUsers();
    }

    @GetMapping("/users/{id}")
    public AfUser getAfUser(@PathVariable Long id) {
        return afUserService.getAfUser(id);
    }

    @PostMapping
    public void registerNewAfUser(@RequestBody @Valid AfUser afUser){

        //logique
        System.out.println("test-------------"+ afUser);
        afUserService.addNewAfUser(afUser);
    }

}
