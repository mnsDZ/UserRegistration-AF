package com.example.demo.afUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service // or @Component
@Transactional
public class AfUserService {

    private final AfUserRepository afUserRepository;

    @Autowired
    public AfUserService(AfUserRepository afUserRepository) {
        this.afUserRepository = afUserRepository;
    }

    @GetMapping
    public List<AfUser> getAfUsers(){
        return afUserRepository.findAll();
    }

    @GetMapping
    public AfUser getAfUser(@PathVariable Long id){
        Optional<AfUser> AfUserById = afUserRepository.findAfUserById(id);
        if(AfUserById.isPresent()){
            return AfUserById.get();
        }
        throw new RuntimeException("User is not found for the id " + id);
    }

    public void addNewAfUser(AfUser afUser) {
        Optional<AfUser> AfUserById = afUserRepository.findAfUserById(afUser.getId());
        if(AfUserById.isPresent()){
            throw new IllegalStateException("User id is taken");
        }

        System.out.println("test"+ afUser);
        afUserRepository.save(afUser);

    }

}

