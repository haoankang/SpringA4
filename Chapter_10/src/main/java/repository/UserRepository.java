package repository;

import dto.User;

public interface UserRepository {

    int add(User user);

    int update(User user);

    int delete(User user);
}
