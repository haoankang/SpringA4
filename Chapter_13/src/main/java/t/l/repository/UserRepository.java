package t.l.repository;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import t.l.dto.User;

public interface UserRepository {

    public int addUser(User user);

    @Cacheable("kaka")
    public User queryById(Integer id);

    public int updateUser(User user);

    public int deleteUser(User user);

    @CacheEvict(value = "kaka", key = "#user.id")
    public void evictUser(User user);
}
