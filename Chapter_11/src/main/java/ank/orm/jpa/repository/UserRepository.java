package ank.orm.jpa.repository;

import ank.orm.jpa.domain.User;

public interface UserRepository {

    void add(User user);

    int update(User user);

    int delete(User user);
}
