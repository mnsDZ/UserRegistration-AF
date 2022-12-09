package com.example.demo.afUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AfUserRepository extends JpaRepository<AfUser, Long> {

    @Query("SELECT s FROM AfUser s WHERE s.id = ?1")
    Optional<AfUser> findAfUserById(Long id);

}
