//package ank.orm.jpa.repository;
//
//import ank.orm.jpa.domain.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.PersistenceContext;
//import javax.persistence.PersistenceUnit;
//
//@Repository
//public class JpaUserRepository implements UserRepository {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
////    @PersistenceUnit
////    private EntityManagerFactory entityManagerFactory;
//
//    public User add(User user) {
//        entityManager.persist(user);
//        return user;
//    }
//
//    public int update(User user) {
//        return 0;
//    }
//}
