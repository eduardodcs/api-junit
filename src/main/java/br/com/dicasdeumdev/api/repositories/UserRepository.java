package br.com.dicasdeumdev.api.repositories;

import br.com.dicasdeumdev.api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
