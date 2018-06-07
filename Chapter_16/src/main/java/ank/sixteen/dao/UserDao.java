package ank.sixteen.dao;

import ank.sixteen.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserDao extends JpaRepository<User, Integer> {

}
