package kadu.studies.restapi.repository;

import kadu.studies.restapi.handler.RequiredFieldException;
import kadu.studies.restapi.handler.UserInfoException;
import kadu.studies.restapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user){
        if(user.getLogin()==null)
            throw new RequiredFieldException("Login");
        if(user.getPassword()==null)
            throw new UserInfoException("Problem on the user data");//Another less specific method
        if(user.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(user);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<User> findAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<User> usuarios = new ArrayList<>();
        usuarios.add(new User("gleyson","password"));
        usuarios.add(new User("frank","masterpass"));
        return usuarios;
    }
    public User findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("gleyson","password");
    }
    public User findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o usernamae: %s para localizar um usuário", username));
        return new User("gleyson","password");
    }
}