package ank.orm.hibernate.repository;

import ank.orm.hibernate.domain.User;

public interface UserRepository {

    void add(User user);

    int update(User user);

    int delete(User user);
}
