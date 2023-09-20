package coutinho.demo.jwt.security.service;

import coutinho.demo.jwt.security.model.User;
import coutinho.demo.jwt.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private PasswordEncoder encoder;

    public void createUser(User user) {
        String pwd = user.getPassword();
        //Criptografia antes de inserir no banco
        user.setPassword(encoder.encode(pwd));
        repository.save(user);
    }
}
