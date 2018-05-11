package ank.orm.hibernate.repository;

import ank.orm.hibernate.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateUserRepository implements UserRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.openSession();
    }

    public void add(User user) {
        getSession().saveOrUpdate(user);
    }

    public int update(User user) {
        return 0;
    }

    public int delete(User user) {
        return 0;
    }
}
