package com.pokemonreview.api.repository;

import com.pokemonreview.api.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByUserName(String username);
    Boolean existsByUserName(String username);

}
