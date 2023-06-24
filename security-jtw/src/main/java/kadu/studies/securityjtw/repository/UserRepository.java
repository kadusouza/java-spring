package kadu.studies.securityjtw.repository;

import kadu.studies.securityjtw.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {
    //    @Query("SELECT e FROM User e WHERE e.username= :username")
//    @Query("SELECT e FROM User e JOIN FETCH e.roles WHERE e.username= (:username)")
//    @Query(value = "SELECT * FROM tab_user u JOIN  u.tab_user_roles WHERE u.username = :username",
//            nativeQuery = true)
//    @Query(value = "SELECT * FROM tab_user u  JOIN tab_user_roles x ON x.user_id  = u.user_id where u.username = 'admin'",
//            nativeQuery = true)
    @Query("SELECT e FROM User e JOIN FETCH e.roles WHERE e.username= (:username)")
    public User findByUsername(@Param("username") String username);
    boolean existsByUsername(String username);
}