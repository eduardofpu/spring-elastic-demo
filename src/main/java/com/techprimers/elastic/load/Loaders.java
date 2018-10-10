package com.techprimers.elastic.load;

import com.techprimers.elastic.model.Users;
import com.techprimers.elastic.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loaders {

    @Autowired
    ElasticsearchOperations operations;
    @Autowired
    UsersRepository usersRepository;

    @PostConstruct
    @Transactional
    public void loadAll(){

        operations.putMapping(Users.class);
        System.out.println("Loading Data");
        usersRepository.save(getData());
        System.out.println("Loading Completed");

    }


    private List<Users> getData() {
        List<Users> users = new ArrayList<>();
        users.add(new Users("Ajay", 123L, "Accounting", 12000L));
        users.add(new Users("Jaga", 1234L, "Accounting", 22000L));
        users.add(new Users("Thiru", 12345L, "Accounting", 12000L));

        return users;
    }
}
