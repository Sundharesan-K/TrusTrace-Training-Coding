package com.TrusTrace.SpringBoot.Repository;

import com.TrusTrace.SpringBoot.Pojo.Books;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.function.Supplier;

@Repository
public interface BookRepository extends MongoRepository<Books,String> {

    void delete(int id);


}
